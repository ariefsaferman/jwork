/**
 * 
 * Class DatabaseJob akan berfungsi sebagai 
 * list array sebuah job yang ada serta 
 * 
 * @author Arief Saferman
 * @version 18 Maret 2021 
 * 
 */
public class DatabaseJob
{
    public static String[] listJob = {}; 
    
    
    
    /** 
     * Method addJob untuk menambah list job pada database
     * @param job Untuk menerima argumen list job baru 
     * @return boolean memberikan tanda bahwa ada sebuah job baru 
     */
    public static boolean addJob(Job job)
    {
        return false; 
    }
    
    
    /** 
     * Untuk menghapus item pada list job database 
     * @param job  untuk menerima variabel yang ingin dihapus 
     * @return boolean memberikan tanda bahwa ada ingin item yang ingin dihapus 
     */
    public static boolean removeJob(Job job)
    {
        return false; 
    }
    
    
    /** 
     * @return Job mengembalikkan nilai yang di dapat dari list 
     */
    public static Job getJob()
    {
        return null; 
    }
    
    
    /** 
     * @return String[] untuk menyimpan seluruh list job yang ada 
     */
    public static String[] getListJob()
    {
        return listJob;
    }
    
}