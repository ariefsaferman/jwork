package ariefsaferman.jwork;
/**
 * 
 *
 * @author Arief Saferman
 * @version  18 Maret 2021 
 * 
 */

public class Location
{
    private String province; 
    private String city; 
    private String description; 
    
    public Location(String province, String city, String description)
    {
        this.province = province; 
        this.city = city; 
        this.description = description; 
    }
    
    
    /** 
     * getter untuk memberikan nilai awal province 
     * @return String menyimpan variabel province sebagai string 
     */
    public String getProvince()
    {
        return province; 
    }
    
    
    /** 
     * getter untuk memberikan nilai awal city
     * @return String menyimpan string city 
     */
    public String getCity()
    {
        return city; 
    }
    
    
    /** 
     * deskripsi dari kota yang asal 
     * @return String menyimpan string deskripsi dari lokasi kota 
     */
    public String getDescription()
    {
        return description; 
    }
    
    
    /** 
     * mengubah province dengan nilai yang baru 
     * @param province menyimpan nilai province yang sudah diubah 
     */
    public void setProvince(String province)
    {
        this.province = province; 
    }
    
    
    /** 
     * mengubah nilai city yang dengan yang baru 
     * @param city menyimpan nilai city yang baru 
     */
    public void setCity(String city)
    {
        this.city = city; 
    }
    
    
    /** 
     * mengubah deskripsi untuk kota yang baru 
     * @param description menyimpan deskripsi kota 
     */
    public void setDescription(String description)
    {
        this.description = description; 
    }
    
    // public  void printData()
    // {
    //     System.out.println("Provinsi: " + province);
    //     System.out.println("City: " + city);
    //     System.out.println("Deskripsi: " + description);
    // }

    public String toString()
    {
      return "Province = " + province + 
            "\nCity = " + city + 
            "\nDescription = " + description;
    }
    
}