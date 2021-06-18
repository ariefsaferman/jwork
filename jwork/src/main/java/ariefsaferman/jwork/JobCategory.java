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
    WebDeveloper("WebDeveloper"),
    FrontEnd("FrontEnd"),
    BackEnd("BackEnd"),
    UI("UI"), 
    UX("UX"), 
    Devops("Devops"),
    DataScientist("DataScientist"),
    DataAnalyst("DataAnalyst");

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