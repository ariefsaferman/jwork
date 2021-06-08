package ariefsaferman.jwork;
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

        for (int i = 0; i < JOBSEEKER_DATABASE.size(); i++) {
            if (id == JOBSEEKER_DATABASE.get(i).getId()) {
                temp = JOBSEEKER_DATABASE.get(i);
            }
        }
        if(temp == null){
            throw new JobSeekerNotFoundException(id);
        }
        return temp;
    }



    /** 
     * method yang digunakan untuk menambah jobseeker 
     * @param jobseeker as Jobseeker
     * @return jobseeker yang ditambah 
     */
    public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException
    {
        for (Jobseeker jobseekere : JOBSEEKER_DATABASE) {
            if (jobseekere.getEmail().equals(jobseeker.getEmail())) {
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
        boolean a = false; 
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getId() == id) {
                JOBSEEKER_DATABASE.remove(jobseeker.getId());
                a = true;
            }
        }
        if(a == false){
            throw new JobSeekerNotFoundException(id);
        }
        return a;
    }

    public static Jobseeker jobseekerLogin(String email, String password)
    {
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE){
            if(jobseeker.getEmail().equals(email) && jobseeker.getPassword().equals(password)){
                return jobseeker;
            }
        }
        return null;
    }

  


}


