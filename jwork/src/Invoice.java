import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 
 *
 * @author Arief Saferman
 * @version  18 Maret 2021 
 * 
 */

abstract class Invoice
{
    // instance variables - replace the example below with your own
    // private int id, totalFee;
    // private String date;
    // private Jobseeker jobseeker; 
    // private PaymentType paymentType;
    // private InvoiceStatus invoiceStatus;

    private int id; 
    private Job job; 
    private Calendar date; 
    protected int totalFee; 
    private Jobseeker jobseeker; 
    private InvoiceStatus invoiceStatus; 

    public Invoice(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        this.date = new GregorianCalendar();
        this.id = id; 
        this.job = job; 
        this.jobseeker = jobseeker; 
        this.invoiceStatus = invoiceStatus; 
        // this.id = id;
        // this.idJob = idJob; 
        // this.date = date; 
        // this.totalFee = totalFee; 
        // this.jobseeker = jobseeker; 
        // this.paymentType = paymentType;
        // this.status = status; 
        
    }

    public abstract PaymentType getPaymentType();

    public Job getJob()
    {
        return job; 
    }

    public void setJob(Job job)
    {
        this.job = job; 
    }

    public InvoiceStatus getStatus() {
        return invoiceStatus;
    }

    public void setStatus(InvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
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
    public Calendar getDate()
    {
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
    public Jobseeker getJobseeker()
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
    // public void setIdJobs(Job job)
    // {
    //     this.job = job; 
    // }
    
    /** 
     * Method yang digunakan untuk mengubah tanggal invoice 
     * @param date Digunakan untuk menyimpan nilai tanggal yang diubah 
     */
    public void setDate(Calendar date)
    {
        this.date = date;
    }

    public void setDate(int year, int month, int dayOfMonth)
    {
        this.date = new GregorianCalendar(year, month, dayOfMonth);
    }
    
    /** 
     * method yang digunakan untuk mengubah totalFee 
     *
     */
    public abstract void setTotalFee();
    
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
    // public abstract void printData();

    public abstract String toString();
}
