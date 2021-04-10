
import java.util.GregorianCalendar;

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

        // System.out.println(listJob1);
        // System.out.println(listJob2);

        // // Tugas 1 bagian D 
        // PaymentType pay1 = PaymentType.BankPayment;
        // PaymentType pay2 = PaymentType.EwalletPayment;

        // System.out.println("\n" + pay1);
        // System.out.println(pay2);

        // Tugas 5 
        // Location location = new Location("Depok", "Jawa Barat", "Universitas Indonesia"); 
        // Recruiter recruiter = new Recruiter(1, "Hansaka", "apaaja", "0811", location);
        // Job job = new Job(1, 100000000, "Senior Designer", JobCategory.WebDeveloper, recruiter);

        // job.printData();

        InvoiceStatus status1 = InvoiceStatus.Cancelled;
        InvoiceStatus status2 = InvoiceStatus.Finished;
        InvoiceStatus status3 = InvoiceStatus.OnGoing;
        
        //post test modul 3 
        //Location location = new Location("Depok", "Jawa Barat", "Universitas Indonesia");
        //Recruiter recruiter = new Recruiter(1, "Hansaka", "apaaja", "0811", location);
        //Job job = new Job(1, 100000000, "Senior Designer", JobCategory.WebDeveloper, recruiter);
        //Jobseeker jobseeker = new Jobseeker(1, "Mahasiwa", "tidakpenting@gmail.com", "1234556", "14 juli");
        //Invoice invoice1 = new Invoice(1 ,job.getId(), "23/03/2021", job.getFee(), jobseeker, pay1, status2);

    
        //invoice1.printData(); 
        // CS Modul 5 
        // Jobseeker jobseeker = new Jobseeker(1, "Mahasiwa", "tidakpenting@gmail.com", "1234556", "14 juli");
        Bonus bonus1 = new Bonus(1, "123", 0, 100000, true);
        Bonus bonus2 = new Bonus(1, "123", 100000000, 100000, true);
        Location location = new Location("Depok", "Jawa Barat", "Universitas Indonesia");
        Recruiter recruiter = new Recruiter(1, "Hansaka", "apaaja", "0811", location);
        Job job = new Job(1, 100000000, "Senior Designer", JobCategory.WebDeveloper, recruiter);

       
        
        // e1.setTotalFee();
        // e2.setTotalFee();
        // e3.setTotalFee();
        // e1.printData();
        // e2.printData();
        // e3.printData();

        // Post Test Modul 5 
        // Jobseeker jobseeker = new Jobseeker(1, "Mahasiwa", "tidakpenting@gmail.com", "1234556", "14 juli");
        // Location location = new Location("Depok", "Jawa Barat", "Universitas Indonesia");
        // Recruiter recruiter = new Recruiter(1, "Hansaka", "apaaja", "0811", location);
        // Job job = new Job(1, 10, "Senior Designer", JobCategory.WebDeveloper, recruiter);
        // BankPayment b1 = new BankPayment(1, job, "20 Maret 2020", jobseeker, status2);
        // BankPayment b2 = new BankPayment(1, job, "20 Maret 2020", jobseeker, status2, 7);

        // b1.setTotalFee();
        // b2.setTotalFee();

        // b1.printData();
        // b2.printData();
        GregorianCalendar calender = new GregorianCalendar(2021, 07, 14);
        Jobseeker jobseeker = new Jobseeker(1, "Arief Saferman", "..arief@gmail.com", "123", calender);
        Jobseeker jobseeker2 = new Jobseeker(2, "Salman", "arief.saferman@gmail.com", "Saferman14", 2021, 07, 14);
        Jobseeker jobseeker3 = new Jobseeker(3, "Aldo", "..arief@gmail.com", "123");
        EwalletPayment e1 = new EwalletPayment(1, job, jobseeker, status2);
        EwalletPayment e2 = new EwalletPayment(2, job, jobseeker, bonus1, status2);
        EwalletPayment e3 = new EwalletPayment(2, job, jobseeker, bonus2, status2);
        BankPayment b1 = new BankPayment(1, job, "14/07/2000", jobseeker, status2); 

        System.out.println(jobseeker.toString()); 
        System.out.println(jobseeker2.toString()); 
        System.out.println(jobseeker3.toString()); 

        jobseeker.setEmail("salman.alfarisi@gmail.com");
        jobseeker.setPassword("salmanAiueo10");
        System.out.println(jobseeker.toString());

        //PT Modul 5 
        System.out.println(e1.toString());
        System.out.println(b1.toString());



    } 
}
