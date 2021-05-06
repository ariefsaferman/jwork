import java.util.ArrayList;

public class DatabaseJobseeker {
    public String[] listJobseeker = {};
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
    private static int lastId = 0;

    public static ArrayList<Jobseeker> getJobDatabase() {
        return JOBSEEKER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException{
        Jobseeker temp = null;
        try{
            for (int i = 0; i < JOBSEEKER_DATABASE.size(); i++) {
                if (id == JOBSEEKER_DATABASE.get(i).getId()) {
                    temp = JOBSEEKER_DATABASE.get(i);
                }
            }
        }
        catch (Exception e){
            throw new JobSeekerNotFoundException(id);
        }
        return temp;
    }

    public DatabaseJobseeker()
    {
        // masih prototipe 
    }


    /** 
     * method yang digunakan untuk menambah jobseeker 
     * @param jobseeker as Jobseeker
     * @return jobseeker yang ditambah 
     */
    public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException
    {
        for (Jobseeker jobseekere : JOBSEEKER_DATABASE) {
            if (jobseekere.getEmail() == jobseeker.getEmail()) {
                throw new EmailAlreadyExistsException(jobseeker);
            }
        }
        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }

    /** 
     * method yang digunakan untuk menghapus jobseeker 
     * @param id as Jobseeker
     * @return int mengebalikan nilai adminfee  
     */
    public boolean removeJobseeker(int id) throws JobSeekerNotFoundException
    {
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getId() == id) {
                JOBSEEKER_DATABASE.remove(jobseeker.getId());
                return true;
            }
        }
        throw new JobSeekerNotFoundException(id);
    }

    /** 
     * method yang digunakan untuk mendapatkan jobseeker
     * @return jobseeker  
     */
    public Jobseeker getJobseeker()
    {
        return null; 
    }

    /** 
     * method yang digunakan untuk mendapatkan list jobseeker
     * @return list jobseeker
     */
    public String[] getListJobseeker()
    {
        return listJobseeker; 
    }
}


