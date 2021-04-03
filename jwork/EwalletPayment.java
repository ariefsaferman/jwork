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
    EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker, invoiceStatus); 
    }

    // Constructor kedua 
    EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, Bonus bonus, InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker, invoiceStatus);
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
        if(bonus != null && bonus.getActive() == true && super.getJob().getFee() > bonus.getMinTotalFee()){
            super.totalFee = super.getJob().getFee() + bonus.getExtraFee();
        } else{
            super.totalFee = super.getJob().getFee(); 
        }
    }

   
    /**
     * method yang digunakan untuk printData invoice 
     */
    public void printData()
    {
        System.out.println("====== Invoice ====== " + 
        "\nid = " + super.getId() + 
        "\nJob = " + super.getJob().getName() +
        "\nDate = " + super.getDate() + 
        "\nJob seeker = " + super.getJobseeker().getName());
        if(bonus != null){
            System.out.println("kode referal:" + bonus.getReferralCode());
        }

        System.out.println("Total Fee = " + super.getTotalFee() +
        "\n Status = " +super.getStatus() + 
        "\n Payment Type = " + PAYMENT_TYPE);
    }

   
}
