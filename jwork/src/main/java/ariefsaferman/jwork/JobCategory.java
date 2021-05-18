package ariefsaferman.jwork;
/**
 * 
 *
 * @author Arief Saferman
 * @version  18 Maret 2021 
 * 
 */

public enum JobCategory 
{
    WebDeveloper("Web Developer"), 
    FrontEnd("Front End"), 
    BackEnd("Back End"), 
    UI("UI"), 
    UX("UX"), 
    Devops("Devops"),
    DataScientist("Data Scientist"), 
    DataAnalyst("Data Analyst"); 

    private final String jobstring; 

    JobCategory(String jobstring)
    {
        this.jobstring = jobstring; 
    }

    @Override
    public String toString()
    {
        return jobstring; 
    }
}