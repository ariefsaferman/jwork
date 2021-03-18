
public class JWork
{
    public static void main(String[] agrs)
    {
        Location location = new Location("DKI Jakarta", "Jakarta Timur", "ondel-onde"); 
        Recruiter recruiter = new Recruiter(1, "arief saferman", "arief.saferman@gmail.com", "021-555", location); 
        Job job = new Job(1, 1000, "arief", "pegawai tetap", null); 
        Jobseeker jobseeker = new Jobseeker(1, "arief", "tidakpenting@gmail.com", "1234556", "14 juli"); 
        Invoice invoice = new Invoice(1, 1, 100, "14 juli", jobseeker); 
    }
}
