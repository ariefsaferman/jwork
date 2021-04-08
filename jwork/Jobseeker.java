
/**
 * Write a description of class Jobseeker here.
 *
 * @author Arief Saferman
 * @version 18 Maret 2021 
 * 
 * 
 * Ini adalah metode constructor yang digunakan untuk Jobseeker
 * @return int This returns sum of numA and numB.
   */

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;
import java.util.regex.*;

public class Jobseeker
{
    private int id;
    private String name, email, password;
    private Calendar joinDate;
  
    
    public Jobseeker(int id, String name, String email, String password, Calendar joinDate)
    {
        setEmail(email);
        setPassword(password);
        this.id = id; 
        this.name = name; 
        this.email = email; 
        this.password = password; 
        this.joinDate = joinDate; 
    }

    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
        setEmail(email);
        setPassword(password);
        this.id = id; 
        this.name = name; 
        this.email = email; 
        this.password = password; 
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }

    public Jobseeker(int id, String name, String email, String password)
    {
        setEmail(email);
        setPassword(password);
        this.id = id; 
        this.name = name; 
        this.email = email; 
        this.password = password; 
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
    public Calendar getJoinDate()
    {
        return joinDate;
    }


    /** 
     * 
     *  
     * ini adalah metode getPassword untuk setiapp object mendapatkan password masing-masing  
     * @return tidak mengembalikan nilai  
     */
    public String getPassword()
    {
        return password; 
    }
    
    
    /** 
     * 
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
     * 
     *  
     * ini adalah metode setPassword  
     * @param password digunakan untuk memberikan nilai pada parameter password  
     * @return mengembalikan nilai password yang diubah   
     */
    public void setPassword(String password)
    {
        Pattern p = Pattern.compile("[0-9a-zA-Z]{6,}");
        Matcher matcher = p.matcher(password);
        if(matcher.find()){
            this.password = password;
        }
        else{
            this.password = " "; 
        }
         
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
        Pattern p = Pattern.compile("^(?!.*([.])\1)[^.][a-zA-Z0-9.&*_~]+@[^-. ][a-zA-Z0-9-.&*_~]+(?:[a-zA-Z0-9-]+)*");
        Matcher matcher = p.matcher(email); 
        if(matcher.find()){
            this.email = email; 
        }else{
            this.email = " "; 
        }
        
    }
    
    /** 
     * mengubah nilai joinDate untuk data yang baru 
     * @param joinDate menyimpan data yang baru untuk pekerja yang baru juga
     */
    public void setJoinDate(Calendar joinDate)
    {
        this.joinDate = joinDate; 
    }

    public void setJoinDate(int year, int month, int dayOfMonth)
    {
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }

    // public void printData()
    // {
    //     System.out.println("Id: " + id);
    //     System.out.println("Name: " + name);
    //     System.out.println("Email: " + email);
    //     System.out.println("Password: " + password);
    //     System.out.println("JoinDate: " + joinDate);
    // }
    public String toString()
    {
      return "ID = " + id + 
            "\nName = " + name + 
            "\nEmail = " + email +
            "\nPassword = " + password +
            "\nJoin Date = " + joinDate ;
    }
}
