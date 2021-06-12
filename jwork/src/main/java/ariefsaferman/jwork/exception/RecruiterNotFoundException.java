package ariefsaferman.jwork.exception;
public class RecruiterNotFoundException extends Exception{
    private int recruiter_error;

    public RecruiterNotFoundException(int recruiter_input)
    {
        super("Recruiter Id: ");
        recruiter_error = recruiter_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}