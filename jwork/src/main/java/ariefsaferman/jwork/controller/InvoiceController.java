package ariefsaferman.jwork.controller;

import ariefsaferman.jwork.*;
import ariefsaferman.jwork.database.DatabaseBonus;
import ariefsaferman.jwork.database.DatabaseInvoice;
import ariefsaferman.jwork.database.DatabaseJob;
import ariefsaferman.jwork.database.DatabaseJobseeker;
import ariefsaferman.jwork.database_postgre.DatabaseBonusPostgre;
import ariefsaferman.jwork.database_postgre.DatabaseInvoicePostgre;
import ariefsaferman.jwork.database_postgre.DatabaseJobPostgre;
import ariefsaferman.jwork.database_postgre.DatabaseJobseekerPostgre;
import ariefsaferman.jwork.exception.InvoiceNotFoundException;
import ariefsaferman.jwork.exception.JobNotFoundException;
import ariefsaferman.jwork.exception.JobSeekerNotFoundException;
import ariefsaferman.jwork.exception.OngoingInvoiceAlreadyExistsException;
import org.springframework.web.bind.annotation.*;


import java.sql.SQLException;
import java.util.ArrayList;

@RequestMapping("/invoice")
@RestController
public class InvoiceController
{
    @RequestMapping("")
    public ArrayList<Invoice> getAllInvoice()
    {
        return DatabaseInvoice.getInvoiceDatabase();
    }

    @RequestMapping("/{id}")
    public Invoice getInvoiceById(@PathVariable int id)
    {
        Invoice invoice = null;
        try{
            invoice = DatabaseInvoice.getInvoiceById(id);
        } catch (InvoiceNotFoundException e){
            System.out.println(e.getMessage());
            return null;
        }
        return invoice;
    }

    @RequestMapping("jobseeker/{jobseekerId}")
    public ArrayList<Invoice> getInvoiceByJobseekerId(@PathVariable int jobseekerId)
    {
        ArrayList<Invoice> invoice = new ArrayList<>();
        try {
            invoice = DatabaseInvoicePostgre.getInvoiceByJobseeker(jobseekerId);
        } catch (SQLException throwables) {
            System.err.println(throwables.getMessage());
        }
        return invoice;
    }

    @RequestMapping(value = "invoiceStatus/{id}", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@PathVariable int id,
                                       @RequestParam(value = "status") InvoiceStatus status){
        Invoice invoice = null;
        try {
            invoice = DatabaseInvoicePostgre.getInvoiceById(id);
            invoice.setInvoiceStatus(status);
            DatabaseInvoicePostgre.changeInvoice(invoice);
            return invoice;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public boolean removeInvoice(@PathVariable int id)
    {
        boolean temp = false;
        try {
            temp = DatabaseInvoice.removeInvoice(id);
        } catch (InvoiceNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return temp;
    }

    @RequestMapping(value = "/createBankPayment", method = RequestMethod.POST)
    public Invoice addBankPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                  @RequestParam(value = "jobseekerId") int jobseekerId,
                                  @RequestParam(value = "adminFee") int adminFee) {
        Invoice invoice = null;
        ArrayList<Job> jobs = new ArrayList<Job>();
        for (Integer integer : jobIdList) {
            jobs.add(DatabaseJobPostgre.getJobById(integer));
        }
        invoice = new BankPayment(DatabaseInvoice.getLastId() + 1, jobs, DatabaseJobseekerPostgre.getJobseeker(jobseekerId), adminFee);
        invoice.setTotalFee();
        boolean status = false;
        try {
            status = DatabaseInvoicePostgre.addInvoice(invoice);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        if (status) {
            return invoice;
        } else {
            return null;
        }
    }

    @RequestMapping(value = "/createEWalletPayment", method = RequestMethod.POST)
    public Invoice addEWalletPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                     @RequestParam(value = "jobseekerId") int jobseekerId,
                                     @RequestParam(value = "referralCode") String referralCode) {
        Invoice invoice = null;
        ArrayList<Job> jobs = new ArrayList<Job>();
        System.err.println("Jobseeker Id: " + jobseekerId);
        for (int integer : jobIdList) {
            jobs.add(DatabaseJobPostgre.getJobById(integer));
        }
        invoice = new EwalletPayment(DatabaseInvoice.getLastId() + 1, jobs, DatabaseJobseekerPostgre.getJobseeker(jobseekerId), DatabaseBonusPostgre.getBonusByReferralCode(referralCode));
        invoice.setTotalFee();
        boolean status = false;
        try {
            status = DatabaseInvoicePostgre.addInvoice(invoice);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        if (status) {
            return invoice;
        } else {
            return null;
        }
    }
}
