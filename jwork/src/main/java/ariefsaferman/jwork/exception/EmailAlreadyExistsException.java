package ariefsaferman.jwork.exception;

import ariefsaferman.jwork.Jobseeker;

public class EmailAlreadyExistsException extends Exception
{

    private Jobseeker jobseeker_error;

    public EmailAlreadyExistsException(Jobseeker jobseeker_input){
        super("Jobseeker Email: ");
        jobseeker_error = jobseeker_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + jobseeker_error.getEmail() + " already exists.";
    }
}