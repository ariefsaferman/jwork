import java.util.ArrayList;

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
    private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>();
    private static int lastId = 0;
    
    /** 
     * Method addJob untuk menambah list job pada database
     * @param job Untuk menerima argumen list job baru 
     * @return boolean memberikan tanda bahwa ada sebuah job baru 
     */
    public static boolean addJob(Job job)
    {
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }
    
    
    /** 
     * Untuk menghapus item pada list job database 
     * @param job  untuk menerima variabel yang ingin dihapus 
     * @return boolean memberikan tanda bahwa ada ingin item yang ingin dihapus 
     */
    public static boolean removeJob(int id) throws JobNotFoundException
    {
        boolean status = false;
        for (Job element : JOB_DATABASE) {
            if (element.getId() == id) {
                JOB_DATABASE.remove(element);
                status = true;
                break;
            }
        }
        if (!status){
            throw new JobNotFoundException(id);
        }

        return status;
    }

    public static ArrayList<Job> getJobDatabase(){
        return JOB_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Job getJobById(int id) throws JobNotFoundException
    {
        Job result = null;
        for (Job element : JOB_DATABASE) {
            if (element.getId() == id) {
                result = element;
                return result;
            }
        }
        if (result == null){
            throw new JobNotFoundException(id);
        }

        return result;
    }

    public static ArrayList<Job> getJobByRecruiter(int recruiterId){
        ArrayList<Job> temp = new ArrayList<Job>();
        for (Job job : JOB_DATABASE) {
            if (recruiterId == job.getRecruiter().getId()) {
                temp.add(job);
            } else {
                return null;
            }
        }
        return temp;
    }

    public static ArrayList<Job> getJobByCategory(JobCategory category){
        ArrayList<Job> temp = new ArrayList<Job>();
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (category == JOB_DATABASE.get(i).getCategory()) {
                temp.add(JOB_DATABASE.get(i));
            }
        }
        return temp;
    }
    
//    /**
//     * @return Job mengembalikkan nilai yang di dapat dari list
//     */
//    public static Job getJob()
//    {
//        return null;
//    }
//
//
//    /**
//     * @return String[] untuk menyimpan seluruh list job yang ada
//     */
//    public static String[] getListJob()
//    {
//        return listJob;
//    }
    
}