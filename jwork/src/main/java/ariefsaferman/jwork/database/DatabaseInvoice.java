package ariefsaferman.jwork.database;
import ariefsaferman.jwork.Invoice;
import ariefsaferman.jwork.exception.InvoiceNotFoundException;
import ariefsaferman.jwork.InvoiceStatus;
import ariefsaferman.jwork.exception.OngoingInvoiceAlreadyExistsException;

import java.util.ArrayList;

/**
 *
 *
 * @author Arief Saferman
 * @version  18 Juni 2021
 *
 */
public class DatabaseInvoice 
{
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException
    {
        Invoice x = null;
        for (Invoice a : INVOICE_DATABASE) {
            if (id == a.getId()) {
                x = a;
            }
        }
        if(x == null){
            throw new InvoiceNotFoundException(id);
        }
        return x;
    }

    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerId)
    {
        ArrayList<Invoice> temp = new ArrayList<Invoice>();
        for (int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (jobseekerId == INVOICE_DATABASE.get(i).getJobseeker().getId()) {
                temp.add(INVOICE_DATABASE.get(i));
            }
        }
        return temp;
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getStatus() == InvoiceStatus.OnGoing && invoice.getJobseeker().getId() == invoice.getJobseeker().getId()){
                invoice.setStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException
    {
        for (Invoice invoicee : INVOICE_DATABASE) {
            if (invoicee.getStatus() == InvoiceStatus.OnGoing && invoicee.getJobseeker().getId() == invoice.getJobseeker().getId()) {
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean removeInvoice(int id) throws InvoiceNotFoundException
    {
        boolean temp = true;
        for (Invoice invoice: INVOICE_DATABASE) {
            if (id == invoice.getId()){
                INVOICE_DATABASE.remove(invoice);
                temp = true;
                break;
            }
            else{
                temp = false;
            }
        }
        if (temp == false){
            throw new InvoiceNotFoundException(id);
        }

        return temp;
    }
}
