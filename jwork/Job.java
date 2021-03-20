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
     * method yang digunakan untuk mendapatkan id dari pekerjaan 
     * @param id menerima passing variabel integer yang merupakan idjob 
     * @return int mengebalikan nilai id job 
     */
    public int getId(int id)
    {
        return id;
    }
    
    
    /** 
     * accessor yang digunakan untuk mendapatkan nama pekerjaan 
     * @param name menerima nama pekerja 
     * @return String mengembalikan nama pekerja 
     */
    public String getName(String name)
    {
        return name;
    }
    
    
    /** 
     * accessor yang digunakan untuk menginisiasi nilai fee 
     * @param fee menerima passing parameter untuk nilai fee 
     * @return int mengembalikan nilai fee yang sudah di set 
     */
    public int getFee(int fee)
    {
        return fee;
    }
    
    
    /** 
     * acesssor untuk memberikan nilai awal pada category pekerjaan 
     * @param category menerima object category 
     * @return String mengembalikan kategori yang sudah di set 
     */
    public String getCategory(String category)
    {
        return category;
    }
    
    
    /** 
     * accessor untuk memberikan nilai awal untuk recruiter 
     * @param recruiter menerima passing variabel jenis tipe data recruiter 
     * @return Recruiter mengembalikan nilai recruiter 
     */
    public Recruiter getRecruiter(Recruiter recruiter)
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
    public void setId(int id)
    {
        this.id = id;
    }
    
    
    /** 
     * setter untuk mengubah nilai name 
     * @param name menyimpan hasil perubahan variabel name 
     */
    public void setName(String name)
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
    
    
    public void printData()
    {
        System.out.println("nama pekerja:  " + this.name);
    }
}
