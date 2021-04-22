public class DatabaseBonus {
    private String[] listBonus = {}; 

    /** 
     * method yang digunakan untuk menambah bonus 
     * @return Bonus untuk mengembalikan ada bonus atau tidak
     */
    public Boolean addBonus(Bonus bonus)
    {
        return false; 
    }

    /** 
     * method yang digunakan untuk mengubah admin fee
     * @param bonus bonus yang ingin dihapus 
     * @return Bonus menghapus bonus 
     */
    public Boolean removeBonus(Bonus bonus)
    {
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
