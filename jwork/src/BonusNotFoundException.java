public class BonusNotFoundException extends Exception{
    private int recruiter_error; 

    public BonusNotFoundException(int recruiter_input)
    {
        super("Recruiter Id: ");
        this.recruiter_error = recruiter_input; 
    }

    public String getMessage()
    {
        return super.getMessage() + recruiter_error + "Not Found";
    }


}
