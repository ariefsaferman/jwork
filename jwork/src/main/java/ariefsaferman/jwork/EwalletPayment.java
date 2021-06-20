package ariefsaferman.jwork;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * 
 *
 * @author Arief Saferman
 * @version  3 April 2021 
 * 
 */

public class EwalletPayment extends Invoice {
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment; 
    private Bonus bonus; 
    

    // Constructor pertama 
    EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        super(id, jobs, jobseeker);
    }

    // Constructor kedua 
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, Bonus bonus)
    {
        super(id, jobs, jobseeker);
        this.bonus = bonus; 
    }

     /** 
     * method untuk mendapatkan tipe pembayaran 
     * @return PAYMENT_TYPE Mengembalikan nilai konstanta payment type 
     */
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE; 
    }

    /**
     * method untuk mendapatkan nilai bonus 
     * @return mengembalikan nilai bonus 
     */
    public Bonus getBonus()
    {
        return bonus; 
    }

     /**
     * method untuk mengubah nilai bonus
      * @param bonus objek bonus
     */
    public void setBonus(Bonus bonus)
    {
        this.bonus = bonus; 
    }

     /**
     * method untuk mengubah nilai total fee saat kondisi bonus terpenuhi   
     */
    public void setTotalFee()
    {
        ArrayList<Job> jobs = getJobs();
        for(Job job: jobs){
            int fee = job.getFee();
            if(bonus != null && bonus.getActive() == true && fee > bonus.getMinTotalFee()){
                totalFee = fee + bonus.getExtraFee();
            } else{
                totalFee = fee;
            }
        }

    }

   
    /**
     * method yang digunakan untuk printData invoice 
     */
    // public void printData()
    // {
    //     System.out.println("====== Invoice ====== " + 
    //     "\nid = " + getId() + 
    //     "\nJob = " + getJob().getName() +
    //     "\nDate = " + getDate() + 
    //     "\nJob seeker = " + getJobseeker().getName());
    //     if(bonus != null){
    //         System.out.println("kode referal:" + bonus.getReferralCode());
    //     }

    //     System.out.println("Total Fee = " + getTotalFee() +
    //     "\n Status = " + getStatus() + 
    //     "\n Payment Type = " + PAYMENT_TYPE);
    // }

    @Override
    public String toString()
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
        String formattedDate = simpleDateFormat.format(super.getDate().getTime());

        String jobNames = "";

        for (Job job:super.getJobs()) {
            jobNames += job.getName() + "";
        }

        if (bonus != null && bonus.getActive() && super.totalFee > bonus.getMinTotalFee()) {
            return  "\n========== INVOICE ==========" +
                    "\nId = " + super.getId() +
                    "\nJobs: \n" + jobNames +
                    "\nDate = " + formattedDate +
                    "\nSeeker = " + super.getJobseeker().getName() +
                    "\nFee = " + super.totalFee +
                    "\nReferral Code = " + bonus.getReferralCode() + 
                    "\nStatus = " + super.getStatus().toString() +
                    "\nPayment Type = " + PAYMENT_TYPE;
        }

        return  "\n========== INVOICE ==========" +
                 "\nId = " + super.getId() +
                 "\nJobs = \n" + jobNames +
                 "\nDate =  " + formattedDate +
                 "\nSeeker =  " + super.getJobseeker().getName() +
                 "\nFee = " + super.totalFee +
                 "\nStatus = " + super.getStatus().toString() +
                 "\nPayment Type = " + PAYMENT_TYPE;

    }
}
