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

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReferralCode() {
        return this.referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    public int getExtraFee() {
        return this.extraFee;
    }

    public void setExtraFee(int extraFee) {
        this.extraFee = extraFee;
    }

    public int getMinTotalFee() {
        return this.minTotalFee;
    }

    public void setMinTotalFee(int minTotalFee) {
        this.minTotalFee = minTotalFee;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void printData()
    {
        System.out.println("id: " + id);
        System.out.println("referal code: " + referralCode);
        System.out.println("Extra Fee: " + extraFee);
        System.out.println("minTotal: " + minTotalFee);
        System.out.println("active: " + active);

    }

   
}
