
/**
 * Write a description of class Jobseeker here.
 *
 * @author Arief Saferman
 * @version 18 Maret 2021 
 * 
 * 
 * Ini adalah metode constructor yang digunakan 
 * untuk membuat menginisialisi isi dari instance variabel 
 * @param id merupakan id dari orang yang mencari kerja 
 * @param name  merupakan nama pelamar kerja 
 * @param email email pekerja 
 * @param password  merupakan password pekerja saat mendaftar 
 * @param joindate  merupakan tanggal bergabung dengan perusahaan 
 * @return int This returns sum of numA and numB.
   */
public class Jobseeker
{
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
        System.out.println("pencari kerja: " + this.name);
    }
    

    
    /** 
     * @return int
     * 
     *  ini adalah metode getId untuk setiapp object mendapatkan ID masing-masing 
     *  @param id parameter ini digunakan untuk menyimpan value ID 
     * @return dia akan mengembalikan dari ID yang diberikan oleh perusahaan 
         */
    public int getID()
    {
        
        return id;
    }
    
    
    /** 
     * @return String
     * /**
     * ini adalah metode getName untuk setiapp object mendapatkan ID masing-masing 
     * @param id parameter ini digunakan untuk menyimpan value ID 
     * @return dia akan mengembalikan dari ID yang diberikan oleh perusahaan 
     */
    public String getName()
    {
        
        return name;
    }
    
    
    /** 
     * @return String
    * ini adalah metode getEmail untuk setiapp object mendapatkan ID masing-masing 
    * @param email parameter ini digunakan untuk menyimpan value email 
    * @return dia akan mengembalikan dari email yang didaftarkan 
    */
    public String getEmail()
    {
       
        return email;
    }
    
    
    /** 
     * @return String
     * ini adalah metode joinDate untuk setiapp object mendapatkan ID masing-masing 
     * @return dia akan mengembalikan dari berupaa string dengan nilai waktu bergabung 
     */
    public String getJoinDate()
    {
        
         
         
        return joinDate;
    }
    
    
    /** 
     * @param id
     *  
     * ini adalah metode setID untuk setiapp object mendapatkan ID masing-masing 
     * @param digunakan untuk memberikan nilai pada parameter ID  
     * @return tidak mengembalikan nilai  
     */
    public void setID(int id)
    {
       
        this.id = id;
    }
    
    /** 
     * setter untuk mengubah nilai dari nama 
     * @param name menyimpan nama yang diubah 
     */
    public void setName(String name)
    {
        this.name = name; 
    }
    
    
    /** 
     * setter untuk mengubah email dari pelamar pekerjaan 
     * @param email return email sebagai string 
     */
    public void setEmail(String email)
    {
        this.email = email; 
    }
    
    
    /** 
     * mengubah nilai password 
     * @param password mengembalikan nilai password yang diubah 
     */
    public void setPassword(String password)
    {
        this.password = password; 
    }
    
    
    /** 
     * mengubah nilai joinDate untuk data yang baru 
     * @param joinDate menyimpan data yang baru untuk pekerja yang baru juga
     */
    public void setJoinDate(String joinDate)
    {
        this.joinDate = joinDate; 
    }
    
}
