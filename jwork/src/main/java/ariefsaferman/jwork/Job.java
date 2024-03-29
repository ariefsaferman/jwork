package ariefsaferman.jwork;
/**
 * 
 *
 * @author Arief Saferman
 * @version  18 Maret 2021 
 * 
 */

public class Job
{
  
    private  int id, fee;
    private  String name;
    private  Recruiter recruiter; 
    private  JobCategory category; 


    public Job(int id, int fee, String name, JobCategory category, Recruiter recruiter)
    {
        this.id = id; 
        this.fee = fee; 
        this.name = name; 
        this.category = category; 
        this.recruiter = recruiter; 
       
    }

    /** 
     * method yang digunakan untuk mendapatkan id dari pekerjaan
     * @return int mengebalikan nilai id job 
     */
    public int getId()
    {
        return id;
    }
    
    /** 
     * accessor yang digunakan untuk mendapatkan nama pekerjaan
     * @return String mengembalikan nama pekerja 
     */
    public String getName()
    {
        return name;
    }
    
    
    /** 
     * accessor yang digunakan untuk menginisiasi nilai fee
     * @return int mengembalikan nilai fee yang sudah di set 
     */
    public int getFee()
    {
        return fee;
    }
    
    /** 
     * acesssor untuk memberikan nilai awal pada category pekerjaan 
     * @return String mengembalikan kategori yang sudah di set 
     */
    public JobCategory getCategory()
    {
        return category;
    }
    
    /** 
     * accessor untuk memberikan nilai awal untuk recruiter 
     * @return Recruiter mengembalikan nilai recruiter 
     */
    public Recruiter getRecruiter()
    {
        return recruiter; 
    }
    
    
    /** 
     * mutator untuk mengubah nilai recruiter 
     * @param recruiter variabel yang menyimpan nilai recruiter 
     */
    public void setRecruiter(Recruiter recruiter)
    {
        this.recruiter = recruiter; 
    }
    
    
    /** 
     * setter untuk mengubah nilai id 
     * @param id variabel yang menyimpan hasil ubahan nilai id 
     */
    public  void setId(int id)
    {
        this.id = id;
    }
    
    /** 
     * setter untuk mengubah nilai name 
     * @param name menyimpan hasil perubahan variabel name 
     */
    public  void setName(String name)
    {
        this.name = name;
    }
    
    /** 
     * setter untuk mengubah nilai fee 
     * @param fee menyimpan nilai fee yang sudah diubah 
     */
    public void setFee(int fee)
    {
        this.fee = fee;
    }

    public void setCategory(JobCategory category)
    {
        this.category = category; 
    }
    
    
    // public void printData()
    // {
    //     System.out.println("================== JOB ==================");
    //     System.out.println("ID: " + id);
    //     System.out.println("Name: " + name);
    //     System.out.println("Recruiter: " + recruiter.getName());
    //     System.out.println("City: " + recruiter.getLocation().getCity());
    //     System.out.println("Fee: " + fee);
    //     System.out.println("Category: " + category);
    // }

    public String toString()
    {
      return "ID = " + id + 
            "\nName = " + name + 
            "\nRecruiter = " + recruiter +
            "\nCity = " + recruiter.getLocation().getCity() +
            "\nFee = " + fee +
            "\nCategory = " + category;
    }
}
