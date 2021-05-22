package ariefsaferman.jwork.controller;

import ariefsaferman.jwork.*;
import org.springframework.web.bind.annotation.*;


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
            e.getMessage();
            return null;
        }
        return invoice;
    }

    @RequestMapping("Jobseeker/{JobseekerId}")
    public Jobseeker getInvoiceByJobseekerId(@PathVariable int jobseekerId)
    {
        try {
            return DatabaseJobseeker.getJobseekerById(jobseekerId);
        } catch (JobSeekerNotFoundException e) {
            e.getMessage();
        }
        return null;
    }

    @RequestMapping(value = "invoiceStatus/{id}", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@PathVariable int id,
                                       @RequestParam(value = "status") InvoiceStatus status){
        Invoice invoice = null;
        try {
            invoice = DatabaseInvoice.getInvoiceById(id);
            invoice.setInvoiceStatus(status);
            return invoice;
        } catch (InvoiceNotFoundException e) {
            e.getMessage();
            return null;
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public boolean removeInvoice(@PathVariable int id)
    {
        try {
            DatabaseInvoice.removeInvoice(id);
            return true;
        } catch (InvoiceNotFoundException e) {
            e.getMessage();
        }
        return false;
    }

    @RequestMapping(value = {"/createBankPayment}", method = RequestMethod.POST)


}
