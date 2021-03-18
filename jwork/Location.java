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
    
    public String getProvince(String province)
    {
        return province; 
    }
    
    public String getCity(String city)
    {
        return city; 
    }
    
    public String getDescription(String description)
    {
        return description; 
    }
    
    public void setProvince(String province)
    {
        this.province = province; 
    }
    
    public void setCity(String city)
    {
        this.city = city; 
    }
    
    public void setDescription(String description)
    {
        this.description = description; 
    }
    
    public void printData()
    {
        
    }
    
}