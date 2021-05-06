import java.util.ArrayList;

public class DatabaseRecruiter
{
    public static String[] listRecruiter = {};
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
    private static int lastId = 0;

    public static ArrayList<Recruiter> getRecruiterDatabase()
    {
        return RECRUITER_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Recruiter getRecruiterById(int id) throws RecruiterNotFoundException
    {
        Recruiter temp = null;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if (id == recruiter.getId()) {
                temp = recruiter;
                return temp;
            }
        }
        throw new RecruiterNotFoundException(id);
    }
    /** 
     * method yang digunakan untuk menambah rekruiter
     * @param recruiter as Recruiter
     * @return recruiter   
     */
    public static boolean addRecruiter(Recruiter recruiter)
    {
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();
        return true;
    }

    /** 
     * method yang digunakan untuk menghapus rekruiter 
     * @param recruiter as Recruiter 
     * @return boolean untuk menghapus/tidak 
     */
    public static boolean removeRecruiter(int id) throws RecruiterNotFoundException
    {
        boolean temp = true;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if (id == recruiter.getId()) {
                RECRUITER_DATABASE.remove(id);
                temp = true;
                return temp;
            }
        }
            throw new RecruiterNotFoundException(id);
    }

    /** 
     * method yang digunakan untuk mengambil rekruiter 
     * @return recruiter 
     */
    public static Recruiter getRecruiter()
    {
        return null; 
    }

    /** 
     * method yang digunakan untuk mendapatkan list rekruiter 
     * @return list 
     */
    public static String[] getListRecruiter()
    {
        return listRecruiter; 
    }

}
