import java.util.ArrayList;

public class DatabaseBonus {
    private String[] listBonus = {};
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<Bonus>();
    private static int lastId = 0;

    public static ArrayList<Bonus> getBonusDatabase(){
        return BONUS_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Bonus getBonusById(int id){
        Bonus x = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                x = bonus;
            }
        }
        return x;
    }

    public static Bonus getBonusByRefferalCode(String refferalCode){
        Bonus x = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (refferalCode.equals(bonus.getReferralCode())) {
                x = bonus;
            }
        }
        return x;
    }
    /** 
     * method yang digunakan untuk menambah bonus 
     * @return Bonus untuk mengembalikan ada bonus atau tidak
     */
    public static Boolean addBonus(Bonus bonus)
    {
        for (Bonus element : BONUS_DATABASE) {
            if (bonus.getReferralCode() == element.getReferralCode()) {
                return false;
            }
        }
        BONUS_DATABASE.add(bonus);
        lastId = bonus.getId();
        return true;
    }

    public static boolean activateBonus(int id){
        boolean x = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(true);
                x = true;
            }
        }
        return x;
    }

    public static boolean deactivateBonus(int id){
        boolean x = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(false);
                x = true;
            }
        }
        return x;
    }

    /** 
     * method yang digunakan untuk mengubah admin fee
     * @param id bonus yang ingin dihapus
     * @return Bonus menghapus bonus 
     */
    public Boolean removeBonus(int id)
    {
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getId() == id) {
                BONUS_DATABASE.remove(bonus);
                return true;
            }
        }
        return false;
    }

    /** 
     * method yang digunakan untuk mendapatkan bonus
     * @return int mengebalikan nilai bonus
     */
    public Bonus getBonus()
    {
        return null; 
    }

    /** 
     * method yang digunakan untuk mendapatkan list bonus
     * @return string list bonus   
     */
    public String[] getListBonus()
    {
        return listBonus;
    }
}
