package ariefsaferman.jwork;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class BankPayment extends Invoice{
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment; 
    private int adminFee; 

    BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        super(id, jobs, jobseeker);
    }

    BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, int adminFee)
    {
        super(id, jobs, jobseeker);
        this.adminFee = adminFee; 
    }

     /** 
     * method yang digunakan untuk mendapatkan tipe payment 
     * @return payment type mengebalikan nilai tipe payment
     */
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE; 
    }

     /** 
     * method yang digunakan untuk mendapatkan admin fee
     * @return int mengebalikan nilai adminfee  
     */
    public int getAdminFee()
    {
        return adminFee;
    }

    /** 
     * method yang digunakan untuk mengubah admin fee
     * @return int mengebalikan nilai adminfee  
     */
    public void setAdminFee(int adminFee)
    {
        this.adminFee = adminFee; 
    }

    /** 
     * method yang digunakan untuk mengubah total fee 
     * @return int mengebalikan nilai totalFee 
     */
    public void setTotalFee()
    {
        ArrayList<Job> jobs = getJobs();
        for(Job job: jobs) {
            int fee = job.getFee();
            if(adminFee != 0 ){
                totalFee += fee - adminFee;
            } else{
                totalFee += fee;
            }
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
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
        String formattedDate = simpleDateFormat.format(super.getDate().getTime());

        String jobNames = "";

        for (Job job:super.getJobs()) {
            jobNames += job.getName() + "\n";
        }

        return  "\n========== INVOICE ==========" +
                 "\nId = " + super.getId() +
                 "\nJobs = \n" + jobNames +
                 "\nDate = " + formattedDate +
                 "\nJobseeker = " + super.getJobseeker().getName() +
                 "\nAdmin Fee = " + adminFee +
                 "\nTotal Fee = " + super.totalFee +
                 "\nStatus = " + super.getStatus().toString() +
                 "\nPayment Type = " + PAYMENT_TYPE;
    }





}
