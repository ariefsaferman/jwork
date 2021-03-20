/**
 * 
 *
 * @author Arief Saferman
 * @version  18 Maret 2021 
 * 
 */

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

    
    /** 
     * method yang digunakan untuk men
     * @param id
     * @return int
     */
    public int getId(int id)
    {
        return id;
    }
    
    
    /** 
     * @param name
     * @return String
     */
    public String getName(String name)
    {
        return name;
    }
    
    
    /** 
     * @param fee
     * @return int
     */
    public int getFee(int fee)
    {
        return fee;
    }
    
    
    /** 
     * @param category
     * @return String
     */
    public String getCategory(String category)
    {
        return category;
    }
    
    
    /** 
     * @param recruiter
     * @return Recruiter
     */
    public Recruiter getRecruiter(Recruiter recruiter)
    {
        return recruiter; 
    }
    
    
    /** 
     * @param recruiter
     */
    public void setRecruiter(Recruiter recruiter)
    {
        this.recruiter = recruiter; 
    }
    
    
    /** 
     * @param id
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    
    /** 
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    
    /** 
     * @param fee
     */
    public void setFee(int fee)
    {
        this.fee = fee;
    }
    
    public void printData()
    {
        
    }
}
