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
     * @return String
     */
    public String getProvince()
    {
        return province; 
    }
    
    
    /** 
     * @return String
     */
    public String getCity()
    {
        return city; 
    }
    
    
    /** 
     * @return String
     */
    public String getDescription()
    {
        return description; 
    }
    
    
    /** 
     * @param province
     */
    public void setProvince(String province)
    {
        this.province = province; 
    }
    
    
    /** 
     * @param city
     */
    public void setCity(String city)
    {
        this.city = city; 
    }
    
    
    /** 
     * @param description
     */
    public void setDescription(String description)
    {
        this.description = description; 
    }
    
    public void printData()
    {
        System.out.println("Provinsi: " + this.province);
    }
    
}