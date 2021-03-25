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

    public String toString()
    {
        return jobstring; 
    }
}