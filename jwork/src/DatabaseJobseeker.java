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

    public static Jobseeker getJobseekerById(int id) {
        Jobseeker temp = null;
        for (int i = 0; i < JOBSEEKER_DATABASE.size(); i++) {
            if (id == JOBSEEKER_DATABASE.get(i).getId()) {
                temp = JOBSEEKER_DATABASE.get(i);
            }
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
    public static boolean addJobseeker(Jobseeker jobseeker)
    {
        boolean result = false;
        if (JOBSEEKER_DATABASE.size() == 0){
            JOBSEEKER_DATABASE.add(jobseeker);
            lastId = jobseeker.getId();
            result = true;
            return result;
        }
        for (int i = 0; i < JOBSEEKER_DATABASE.size(); i++) {
            if (jobseeker.getEmail().equals(JOBSEEKER_DATABASE.get(i).getEmail())) {
                System.out.println("Email has been registered");
                result = false;
                return result;
            } else {
                JOBSEEKER_DATABASE.add(jobseeker);
                lastId = jobseeker.getId();
                result = true;
                return result;
            }

        }
        return result;
    }

    /** 
     * method yang digunakan untuk menghapus jobseeker 
     * @param id as Jobseeker
     * @return int mengebalikan nilai adminfee  
     */
    public boolean removeJobseeker(int id)
    {
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getId() == jobseeker.getId()) {
                JOBSEEKER_DATABASE.remove(jobseeker);
                return true;
            }
        }
        return false;
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


