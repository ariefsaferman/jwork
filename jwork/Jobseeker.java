
/**
 * Write a description of class Jobseeker here.
 *
 * @author Arief Saferman
 * @version 18 Maret 2021 
 * 
 */
public class Jobseeker
{
    private int id;
    private String name,email,password,joinDate;
    /**
   * Ini adalah metode constructor yang digunakan 
   * untuk membuat menginisialisi isi dari instance variabel 
   * @param id merupakan id dari orang yang mencari kerja 
   * @param name  merupakan nama pelamar kerja 
   * @param email email pekerja 
   * @param password  merupakan password pekerja saat mendaftar 
   * @param joindate  merupakan tanggal bergabung dengan perusahaan 
   * @return int This returns sum of numA and numB.
   */
    
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
        System.out.println("pencari kerja: " + this.name);
    }
    

    
    /** 
     * @return int
     */
    public int getID()
    {
        /**
         * ini adalah metode getId untuk setiapp object mendapatkan ID masing-masing 
         * @param id parameter ini digunakan untuk menyimpan value ID 
         * @return dia akan mengembalikan dari ID yang diberikan oleh perusahaan 
         */
        return id;
    }
    
    
    /** 
     * @return String
     */
    public String getName()
    {
        /**
         * ini adalah metode getName untuk setiapp object mendapatkan ID masing-masing 
         * @param id parameter ini digunakan untuk menyimpan value ID 
         * @return dia akan mengembalikan dari ID yang diberikan oleh perusahaan 
         */
        return name;
    }
    
    
    /** 
     * @return String
     */
    public String getEmail()
    {
        /**
         * ini adalah metode getEmail untuk setiapp object mendapatkan ID masing-masing 
         * @param email parameter ini digunakan untuk menyimpan value email 
         * @return dia akan mengembalikan dari email yang didaftarkan 
         */
        return email;
    }
    
    
    /** 
     * @return String
     */
    public String getJoinDate()
    {
        /**
         * ini adalah metode joinDate untuk setiapp object mendapatkan ID masing-masing 
         * @param date parameter ini digunakan untuk menyimpan nilai date 
         * @return dia akan mengembalikan dari berupaa string dengan nilai waktu bergabung 
         */
        return joinDate;
    }
    
    
    /** 
     * @param id
     */
    public void setID(int id)
    {
        /**
         * ini adalah metode setID untuk setiapp object mendapatkan ID masing-masing 
         * @param digunakan untuk memberikan nilai pada parameter ID  
         * @return tidak mengembalikan nilai  
         */
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
     * @param email
     */
    public void setEmail(String email)
    {
        this.email = email; 
    }
    
    
    /** 
     * @param password
     */
    public void setPassword(String password)
    {
        this.password = password; 
    }
    
    
    /** 
     * @param joinDate
     */
    public void setJoinDate(String joinDate)
    {
        this.joinDate = joinDate; 
    }
    
}
