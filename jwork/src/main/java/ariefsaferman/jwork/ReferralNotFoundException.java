package ariefsaferman.jwork;
public class ReferralNotFoundException extends Exception {
    private int referral_code_error;

    public ReferralNotFoundException(int referral_code_input){
        super("Referral Code ID: ");
        referral_code_error = referral_code_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + referral_code_error + " not found";
    }

}