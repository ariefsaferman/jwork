public class EwalletPayment extends Invoice {
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment; 
    private Bonus bonus; 

    EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker, invoiceStatus); 
    }

    EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, Bonus bonus, InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker, invoiceStatus);
        this.bonus = bonus; 
    }

    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE; 
    }

    public Bonus getBonus()
    {
        return bonus; 
    }

    public void setBonus(Bonus bonus)
    {
        this.bonus = bonus; 
    }

    public void setTotalFee()
    {
        if(bonus != null && bonus.getActive() == true && super.getJob().getFee() > bonus.getMinTotalFee()){
            super.totalFee = super.getJob().getFee() + bonus.getExtraFee();
        } else{
            super.totalFee = super.getJob().getFee(); 
        }
    }

    @Override
    public void printData()
    {
        System.out.println("====== Invoice ====== " + 
        "\nid = " + super.getId() + 
        "\nJob = " + super.getJob().getName() +
        "\nDate = " + super.getDate() + 
        "\nJob seeker = " + super.getJobSeeker().getName());
        if(bonus != null){
            System.out.println("kode referal:" + bonus.getReferralCode());
        }

        System.out.println("Total Fee = " + super.getTotalFee() +
        "\n Status = " +super.getStatus() + 
        "\n Payment Type = " + PAYMENT_TYPE);
    }

   
}
