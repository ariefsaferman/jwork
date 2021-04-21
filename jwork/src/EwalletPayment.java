import java.text.SimpleDateFormat;
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
    EwalletPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job, jobseeker, invoiceStatus); 
    }

    // Constructor kedua 
    EwalletPayment(int id, Job job, Jobseeker jobseeker, Bonus bonus, InvoiceStatus invoiceStatus)
    {
        super(id, job, jobseeker, invoiceStatus);
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
        if(bonus != null && bonus.getActive() == true && getJob().getFee() > bonus.getMinTotalFee()){
            totalFee = getJob().getFee() + bonus.getExtraFee();
        } else{
            totalFee = getJob().getFee(); 
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
        String kode = " "; 

        SimpleDateFormat tanggal = new SimpleDateFormat("dd MMMM yyyy");
        if(bonus != null && bonus.getActive() && totalFee > bonus.getMinTotalFee()){
            kode = bonus.getReferralCode();
        }

        return "========== Ewallet Payment ===========" +
        "\nID =  " + getId() + 
        "\nJob = "  + getJob().getName() +
        "\nDate = " + tanggal.format(getDate().getTime()) + 
        "\nJob seeker = " + getJobseeker().getName() +
        "\nKode Referal = " + kode +
        "\n Total Fee = " +  getTotalFee() + 
        "\n Payment Type = " + PAYMENT_TYPE;
         
    }

   
}
