
public class JWork
{
    public static void main(String[] agrs)
    {
        // Modul 2
        // Location location = new Location("DKI Jakarta", "Jakarta Timur", "ondel-onde"); 
        // Recruiter recruiter = new Recruiter(1, "arief saferman", "arief.saferman@gmail.com", "021-555", location); 
        // Job job = new Job(1, 1000, "Mahasiwa", "pegawai tetap", recruiter); 
        // Jobseeker jobseeker = new Jobseeker(1, "Mahasiwa", "tidakpenting@gmail.com", "1234556", "14 juli"); 
        // Invoice invoice = new Invoice(1, 1, 100, "14 juli", jobseeker); 

        // System.out.println("Nama Recruiter: " + recruiter.getName());
        // recruiter.setName("Titus Zarek");
        // System.out.println("Nama Recruiter setelah setter: " + recruiter.getName());

        // job.printData();

        // DatabaseJob.addJob(job);
        // DatabaseRecruiter.addRecruiter(recruiter);

        // Tugas 1 bagian C 
        JobCategory listJob1 = JobCategory.BackEnd;
        JobCategory listJob2 = JobCategory.DataAnalyst;
        JobCategory listJob3 = JobCategory.DataScientist;
        JobCategory listJob4 = JobCategory.Devops;
        JobCategory listJob5 = JobCategory.FrontEnd;
        JobCategory listJob6 = JobCategory.UI;
        JobCategory listJob7 = JobCategory.UX;
        JobCategory listJob8 = JobCategory.WebDeveloper;

        System.out.println(listJob1);
        System.out.println(listJob2);

        // Tugas 1 bagian D 
        PaymentType pay1 = PaymentType.BankPayment;
        PaymentType pay2 = PaymentType.EwalletPayment;

        System.out.println("\n" + pay1);
        System.out.println(pay2);

        // Tugas 5 
        // Location location = new Location("Depok", "Jawa Barat", "Universitas Indonesia"); 
        // Recruiter recruiter = new Recruiter(1, "Hansaka", "apaaja", "0811", location);
        // Job job = new Job(1, 100000000, "Senior Designer", JobCategory.WebDeveloper, recruiter);

        // job.printData();

        InvoiceStatus status1 = InvoiceStatus.Cancelled;
        InvoiceStatus status2 = InvoiceStatus.Finished;
        InvoiceStatus status3 = InvoiceStatus.OnGoing;
        
        //post test modul 3 
        Location location = new Location("Depok", "Jawa Barat", "Universitas Indonesia");
        Recruiter recruiter = new Recruiter(1, "Hansaka", "apaaja", "0811", location);
        Job job = new Job(1, 100000000, "Senior Designer", JobCategory.WebDeveloper, recruiter);
        Jobseeker jobseeker = new Jobseeker(1, "Mahasiwa", "tidakpenting@gmail.com", "1234556", "14 juli");
        Invoice invoice1 = new Invoice(1 ,job.getId(), "23/03/2021", job.getFee(), jobseeker, pay1, status2);

    
        invoice1.printData(); 

    } 
}
