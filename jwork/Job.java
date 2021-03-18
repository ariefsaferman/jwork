
public class Job
{
  
    private int id, fee;
    private String name, category;
    private Recruiter recruiter; 


    public Job(int id, int fee, String name, String category, Recruiter recruiter)
    {
        this.id = id; 
        this.fee = fee; 
        this.name = name; 
        this.category = category; 
        this.recruiter = recruiter; 
       
    }

    public int getId(int id)
    {
        return id;
    }
    
    public String getName(String name)
    {
        return name;
    }
    
    public int getFee(int fee)
    {
        return fee;
    }
    
    public String getCategory(String category)
    {
        return category;
    }
    
    public Recruiter getRecruiter(Recruiter recruiter)
    {
        return recruiter; 
    }
    
    public void setRecruiter(Recruiter recruiter)
    {
        this.recruiter = recruiter; 
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setFee(int fee)
    {
        this.fee = fee;
    }
    
    public void printData()
    {
        
    }
}
