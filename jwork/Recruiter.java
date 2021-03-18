/**
 * 
 *
 * @author Arief Saferman
 * @version 1.0 18 Maret 2021 
 * 
 */


public class Recruiter
{
    
    private int id;
    private String name, email, phoneNumber;
    private Location location; 
    
    public Recruiter(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id = id; 
        this.name = name; 
        this.email = email; 
        this.phoneNumber = phoneNumber; 
        this.location = location; 
      
    }

    public int getId(int id)
    {
       
        return id;
    }
    
    public String getName(String name)
    {
        name = "oop";
        return name;
    }
    
    public String getEmail(String email)
    {
        email = "oop";
        return email;
    }
    
    public String getPhoneNumber(String phoneNumber)
    {
        phoneNumber = "oop";
        return phoneNumber;
    }
    
    public void setId(int id)
    {
       
        this.id = id;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
     public void setName(String name)
    {
        this.name = name;
    }
    
    public  void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    public Location getLocation(Location location)
    {
        return location; 
    }
    
    public void setLocation(Location location)
    {
        this.location = location;
    }
    
    public void printData()
    {
        
    }
}
