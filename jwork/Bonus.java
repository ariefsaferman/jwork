/**
 * 
 *
 * @author Arief Saferman
 * @version  18 Maret 2021 
 * 
 */

public class Bonus {
    private int id;
    private String referralCode;
    private int extraFee;
    private int minTotalFee;
    private Boolean active;

    public Bonus(int id, String referralCode, int extraFee, int minTotalFee, Boolean active)
    {
        this.id = id; 
        this.referralCode = referralCode; 
        this.extraFee = extraFee;
        this.minTotalFee = minTotalFee; 
        this.active = active; 
    }

     /** 
     * method yang digunakan untuk mendapatkan id dari bonus
     * @param id menerima passing variabel integer yang merupakan idjob 
     * @return int mengebalikan nilai id job 
     */
    public int getId() {
        return this.id;
    }

     /** 
     * method yang digunakan untuk menset id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /** 
     * method yang digunakan untuk mendapat referal code 
     */
    public String getReferralCode() {
        return this.referralCode;
    }

     /** 
     * method yang digunakan untuk set referal code 
     */
    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

     /** 
     * method yang digunakan untuk mendapatkan extraFee 
     */
    public int getExtraFee() {
        return this.extraFee;
    }

     /** 
     * method yang digunakan untuk mengubah extraFee 
     */
    public void setExtraFee(int extraFee) {
        this.extraFee = extraFee;
    }

     /** 
     * method yang digunakan untuk mendapatkan minimum total fee 
     */
    public int getMinTotalFee() {
        return this.minTotalFee;
    }

     /** 
     * method yang digunakan untuk mengubah nilai minimum total fee 
     */
    public void setMinTotalFee(int minTotalFee) {
        this.minTotalFee = minTotalFee;
    }

     /** 
     * method yang digunakan untuk mendapat status dari bonus 
     */
    public Boolean getActive() {
        return this.active;
    }

     /** 
     * method yang digunakan untuk mengubah nilai status dari bonus  
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /** 
     * method yang digunakan untuk mmendispay data 
     */
    public void printData()
    {
        System.out.println("id: " + id);
        System.out.println("referal code: " + referralCode);
        System.out.println("Extra Fee: " + extraFee);
        System.out.println("minTotal: " + minTotalFee);
        System.out.println("active: " + active);

    }

   
}
