public class BankPayment extends Invoice{
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment; 
    private int adminFee; 

    BankPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus status)
    {
        super(id, job, date, jobseeker, status);
    }

    BankPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus status, int adminFee)
    {
        super(id, job, date, jobseeker, status);
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
            super.totalFee = super.getJob().getFee() - adminFee; 
        } else{
            super.totalFee = super.getJob().getFee();
        }

    }

    public void printData()
    {
        System.out.println("=========== Invoice =========== ");
        System.out.println("ID: " + super.getId());
        System.out.println("Job: " + super.getJob().getName());
        System.out.println("Date: " + super.getDate());
        System.out.println("Jobseeker: " + super.getJobseeker().getName()); 
        System.out.println("Admin Fee: " + adminFee);
        System.out.println("Total Fee: " + super.getTotalFee());
        System.out.println("Status: " + super.getStatus());
        System.out.println("Payment Type: " + PAYMENT_TYPE);
    }





}
