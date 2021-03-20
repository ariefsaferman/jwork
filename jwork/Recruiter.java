/**
 * 
 *
 * @author Arief Saferman
 * @version  18 Maret 2021 
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

    
    /** 
     * @return int
     */
    public int getId()
    {
       
        return id;
    }
    
    
    /** 
     * @return String
     */
    public String getName()
    {
        name = "oop";
        return name;
    }
    
    
    /** 
     * @return String
     */
    public String getEmail()
    {
        email = "oop";
        return email;
    }
    
    
    /** 
     * @return String
     */
    public String getPhoneNumber()
    {
        phoneNumber = "oop";
        return phoneNumber;
    }
    
    
    /** 
     * @param id
     */
    public void setId(int id)
    {
       
        this.id = id;
    }
    
    
    /** 
     * @param email
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
     
     /** 
      * @param name
      */
     public void setName(String name)
    {
        this.name = name;
    }
    
    
    /** 
     * @param phoneNumber
     */
    public  void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    
    /** 
     * @param location
     * @return Location
     */
    public Location getLocation(Location location)
    {
        return location; 
    }
    
    
    /** 
     * @param location
     */
    public void setLocation(Location location)
    {
        this.location = location;
    }
    
    public void printData()
    {
        System.out.println("nama perekrut: " + this.name);
    }
}
