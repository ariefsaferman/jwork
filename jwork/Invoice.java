
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id, idJob, totalFee;
    private String date;
    private Jobseeker jobseeker; 

    public Invoice(int id, int idJob, int totalFee, String date, Jobseeker jobseeker)
    {
        this.id = id;
        this.idJob = idJob; 
        this.totalFee = totalFee; 
        this.date = date; 
        this.jobseeker = jobseeker; 
    }

    
    public int getId(int id)
    {
        
        return id;
    }
    
    public String getDate(String date)
    {
        date = "oop";
        return date;
    }
    
    public String getTotalFee(String totalFee)
    {
        totalFee = "oop";
        return totalFee;
    }
    
    public Jobseeker getJobSeeker(Jobseeker jobseeker)
    {
        return jobseeker; 
    }
    
    public void setID(int id)
    {
         this.id = id;
    }
    
    public void setIdJobs(int idJob)
    {
        this.idJob = idJob; 
    }
    
    public void  setDate(String date)
    {
        this.date = date;
    }
    
    public void setTotalFee(int totalFee)
    {
        this.totalFee = totalFee;
    }
    
    public void setJobseeker(Jobseeker jobseeker)
    {
        this.jobseeker = jobseeker; 
    }
    
    public void printData()
    {
        
    }
}
