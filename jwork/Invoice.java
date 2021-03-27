/**
 * 
 *
 * @author Arief Saferman
 * @version  18 Maret 2021 
 * 
 */

public class Invoice
{
    // instance variables - replace the example below with your own
    private int id, idJob, totalFee;
    private String date;
    private Jobseeker jobseeker; 
    private PaymentType paymentType;
    private InvoiceStatus status;

    public PaymentType getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public InvoiceStatus getStatus() {
        return this.status;
    }

    public void setStatus(InvoiceStatus status) {
        this.status = status;
    }

    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker, PaymentType paymentType, InvoiceStatus status)
    {
        this.id = id;
        this.idJob = idJob; 
        this.date = date; 
        this.totalFee = totalFee; 
        this.jobseeker = jobseeker; 
        this.paymentType = paymentType;
        this.status = status; 
        
    }

    
    
    /** 
     * method untuk mendapatkan id pembayaran 
     * @return Id Mengembalikan nilai Id sebagai bukti invoice 
     */
    public int getId()
    {
        
        return id;
    }
    
    
    /** 
     * method untuk mendapatkan tanggal dari invoice dibuat 
     * @return String mengembalikan tanggal invoice 
     */
    public String getDate()
    {
        date = "oop";
        return date;
    }
    
    
    /** 
     * method yang digunakan untuk mendapatkan totalFee dari seluruh invoice 
     * @return int Mengembalikan total invoice 
     */
    public int getTotalFee()
    {
        return totalFee;
    }
    
    
    /** 
     * method yang digunakan untuk mencari karyawan 
     * @return Jobseeker Mengembalikan object jobseeker supaya terlihat keseluruh informasi personalnya 
     */
    public Jobseeker getJobSeeker()
    {
        return jobseeker; 
    }
    
    
    /** 
     * mutator/setter untuk mengubah nilai id invoice 
     * @param id Menyimpan nilai Id yang diubah 
     */
    public void setID(int id)
    {
         this.id = id;
    }
    
    
    /** 
     * mutator/setter mengubah nilai idJob 
     * @param idJob Menyimpan nilai idJob yang diubah 
     */
    public void setIdJobs(int idJob)
    {
        this.idJob = idJob; 
    }
    
    
    /** 
     * Method yang digunakan untuk mengubah tanggal invoice 
     * @param date Digunakan untuk menyimpan nilai tanggal yang diubah 
     */
    public void  setDate(String date)
    {
        this.date = date;
    }
    
    
    /** 
     * method yang digunakan untuk mengubah totalFee 
     * @param totalFee menyimpan nilai totalFee yang diubah 
     */
    public void setTotalFee(int totalFee)
    {
        this.totalFee = totalFee;
    }
    
    
    /** 
     * method yang digunakan untuk mengubah object jobseeker
     * @param jobseeker mengembalikkan object jobseeker 
     */
    public void setJobseeker(Jobseeker jobseeker)
    {
        this.jobseeker = jobseeker; 
    }
    /**
     * method yang digunakan untuk mengeprint data 
     */
    public void printData()
    {
        System.out.println("========== INVOICE ==========");
        System.out.println("ID: " + id);
        System.out.println("ID Job: " + idJob);
        System.out.println("Date: " +  date); 
        System.out.println("Seeker: " + jobseeker.getName());
        System.out.println("Status: " + status.Finished);
    }
}
