/**
 * 
 *
 * @author Arief Saferman
 * @version  18 Maret 2021 
 * 
 */

public class Recruiter
{
    
    private  int id;
    private  String name, email, phoneNumber;
    private  Location location; 
    
    public Recruiter(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id = id; 
        this.name = name; 
        this.email = email; 
        this.phoneNumber = phoneNumber; 
        this.location = location; 
      
    }

    
    /** 
     * mendapatkan nilai Id 
     * @return int mengembalikan nilai id 
     */
    public int getId()
    {
       
        return id;
    }
    
    
    /** 
     * mendapatkan string nama dari setter 
     * @return String mengembalikkan ke main sebuah nama recruiter 
     */
    public  String getName()
    {
        return name;
    }
    
    
    /** 
     * mendapatkan email pelamar 
     * @return String mengembalikkan string dari email pelamar 
     */
    public String getEmail()
    {
        email = "oop";
        return email;
    }
    
    
    /** 
     * mendapatkan nomor hp dari pelamar 
     * @return String mengembalikkan variabel no hp dari pelamar 
     */
    public String getPhoneNumber()
    {
        phoneNumber = "oop";
        return phoneNumber;
    }
    
    
    /** 
     * mengubah nilai awal id 
     * @param id menyimpan nilai id yang baru 
     */
    public void setId(int id)
    {
       
        this.id = id;
    }
    
    
    /** 
     * mengubah nilai awal email 
     * @param email menyimpan nilai email yang baru 
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
     
     /** 
      * mengubah nilai awal nama 
      * @param name menyimpan nama yang baru 
      */
     public void setName(String name)
    {
        this.name = name;
    }
    
    
    /** 
     * mengubah nilai awal no hp 
     * @param phoneNumber menyimpan nilai no hp yang baru 
     */
    public  void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    
    /** 
     * @param location menyimpak lokasi yang ingin diakses 
     * @return Location mengembalikan nilai lokasi dari setter 
     */
    public   Location getLocation()
    {
        return location; 
    }
    
    
    /** 
     * memberikan nilai ke variabel location 
     * @param location mengubah/memberikan nilai ke variabel location 
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
