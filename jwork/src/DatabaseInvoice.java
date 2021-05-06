import java.util.ArrayList;

public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Invoice getInvoiceById(int id){
        Invoice x = null;
        for (Invoice a : INVOICE_DATABASE) {
            if (id == a.getId()) {
                x = a;
            }
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
            if (invoice.getStatus() == InvoiceStatus.OnGoing){
                invoice.setStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    public static boolean addInvoice(Invoice invoice){
        for (Invoice invoicee : INVOICE_DATABASE) {
            if (invoicee.getId() == invoice.getId()) {
                return false;
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean removeInvoice(int id)
    {
        boolean temp = true;
        for (Invoice invoice: INVOICE_DATABASE) {
            if (id == invoice.getId()){
                INVOICE_DATABASE.remove(id);
                temp = true;
            }
            else{
                temp = false;
            }
        }
        return temp;
    }
}
