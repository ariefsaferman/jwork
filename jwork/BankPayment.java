import java.text.SimpleDateFormat;

public class BankPayment extends Invoice{
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment; 
    private int adminFee; 

    BankPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus status)
    {
        super(id, job, jobseeker, status);
    }

    BankPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus status, int adminFee)
    {
        super(id, job, jobseeker, status);
        this.adminFee = adminFee; 
    }

    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE; 
    }

    public int getAdminFee()
    {
        return adminFee;
    }

    public void setAdminFee(int adminFee)
    {
        this.adminFee = adminFee; 
    }

    public void setTotalFee()
    {
        if(adminFee != 0 ){
            totalFee = getJob().getFee() - adminFee; 
        } else{
            totalFee = getJob().getFee();
        }

    }

    // public void printData()
    // {
    //     System.out.println("=========== Invoice =========== ");
    //     System.out.println("ID: " + getId());
    //     System.out.println("Job: " + getJob().getName());
    //     System.out.println("Date: " + getDate());
    //     System.out.println("Jobseeker: " + getJobseeker().getName()); 
    //     System.out.println("Admin Fee: " + adminFee);
    //     System.out.println("Total Fee: " + getTotalFee());
    //     System.out.println("Status: " + getStatus());
    //     System.out.println("Payment Type: " + PAYMENT_TYPE);
    // }

    @Override
    public String toString()
    {
        SimpleDateFormat tanggal = new SimpleDateFormat("dd MMMM yyyy");
        return "\n=========== Bank Payment =========== "+
        "\nID: " + getId() +
        "\nJob: " + getJob().getName()+
        "\nDate: " + tanggal.format(getDate().getTime()) +
        "\nJobseeker: " + getJobseeker().getName() +
        "\nAdmin Fee: " + adminFee +
        "\nTotal Fee: " + getTotalFee() +
        "\nStatus: " + getStatus() +
        "\nPayment Type: " + PAYMENT_TYPE;
    }





}
