
/**
 * Write a description of class Jobseeker here.
 *
 * @author Arief Saferman
 * @version 1.0 18 Maret 2021 
 * 
 */
public class Jobseeker
{
    private int id;
    private String name,email,password,joinDate;

    
    public Jobseeker(int id, String name, String email, String password, String joinDate)
    {
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
    

    public int getID(int id)
    {
        /**
         * ini adalah metode getId untuk setiapp object mendapatkan ID masing-masing 
         * @param id parameter ini digunakan untuk menyimpan value ID 
         * @return dia akan mengembalikan dari ID yang diberikan oleh perusahaan 
         */
        return id;
    }
    
    public String getName(String name)
    {
        /**
         * ini adalah metode getName untuk setiapp object mendapatkan ID masing-masing 
         * @param id parameter ini digunakan untuk menyimpan value ID 
         * @return dia akan mengembalikan dari ID yang diberikan oleh perusahaan 
         */
        return name;
    }
    
    public String getEmail(String email)
    {
        /**
         * ini adalah metode getEmail untuk setiapp object mendapatkan ID masing-masing 
         * @param email parameter ini digunakan untuk menyimpan value email 
         * @return dia akan mengembalikan dari email yang didaftarkan 
         */
        return email;
    }
    
    public String joinDate(String date)
    {
        /**
         * ini adalah metode joinDate untuk setiapp object mendapatkan ID masing-masing 
         * @param date parameter ini digunakan untuk menyimpan nilai date 
         * @return dia akan mengembalikan dari berupaa string dengan nilai waktu bergabung 
         */
        return date;
    }
    
    public void setID(int id)
    {
        /**
         * ini adalah metode setID untuk setiapp object mendapatkan ID masing-masing 
         * @param digunakan untuk memberikan nilai pada parameter ID  
         * @return tidak mengembalikan nilai  
         */
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
