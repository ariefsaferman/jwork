
/**
 * Write a description of class Jobseeker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Jobseeker
{
    // instance variables - replace the example below with your own
    private int id;
    private String name,email,password,joinDate;

    
    public Jobseeker(int id, String name, String email, String password, String joinDate)
    {
        this.id = id; 
        this.name = name; 
        this.email = email; 
        this.password = password; 
        this.joinDate = joinDate; 
        
    }
    
    public void printData()
    {
        
    }
    

    public int getID(int id)
    {
        return id;
    }
    
    public String getName(String nama)
    {
        nama = "oop";
        return nama;
    }
    
    public String getEmail(String email)
    {
        email = "oop";
        return email;
    }
    
    public String joinDate(String date)
    {
        date = "oop";
        return date;
    }
    
    public void setID(int id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name; 
    }
    
    public void setEmail(String email)
    {
        this.email = email; 
    }
    
    public void setPassword(String password)
    {
        this.password = password; 
    }
    
    public void setJoinDate(String joinDate)
    {
        this.joinDate = joinDate; 
    }
    
}
