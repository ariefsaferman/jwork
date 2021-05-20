package ariefsaferman.jwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JWork
{
    public static void main(String[] args){
        JobCategory listJob1 = JobCategory.BackEnd;
        JobCategory listJob2 = JobCategory.DataAnalyst;
        JobCategory listJob3 = JobCategory.DataScientist;
        JobCategory listJob4 = JobCategory.Devops;
        JobCategory listJob5 = JobCategory.FrontEnd;
        JobCategory listJob6 = JobCategory.UI;
        JobCategory listJob7 = JobCategory.UX;
        JobCategory listJob8 = JobCategory.WebDeveloper;

        Location location1 = new Location("DKI Jakarta", "Jakarta Timur", "Ondel-ondel");
        Location location2 = new Location("Sumatra Utara", "Medan", "Pika Ambon");
        Location location3 = new Location("Papua", "Ambawarawa", "Kapas Pembesar");

        DatabaseRecruiter.addRecruiter(new Recruiter(1, "Arief", "arief.saferman@gmail.com", "021-81190", location1));
        DatabaseRecruiter.addRecruiter(new Recruiter(2, "Salman", "salman.123@gmail.com", "021-8888", location2));
        DatabaseRecruiter.addRecruiter(new Recruiter(3, "Faran", "farhan.almashur@gmail.com", "021-1111", location3));

        try {
            DatabaseJob.addJob(new Job(1, 10, "Mark", listJob1, DatabaseRecruiter.getRecruiterById(1)));
            DatabaseJob.addJob(new Job(2, 100, "Will", listJob1, DatabaseRecruiter.getRecruiterById(2)));
            DatabaseJob.addJob(new Job(3, 1000, "John", listJob2, DatabaseRecruiter.getRecruiterById(3)));
            DatabaseJob.addJob(new Job(4, 10000, "Tato", listJob3, DatabaseRecruiter.getRecruiterById(3)));
        } catch (RecruiterNotFoundException e) {
            e.getMessage();
        }

        SpringApplication.run(JWork.class, args);


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
//        JobCategory listJob1 = JobCategory.BackEnd;
//        JobCategory listJob2 = JobCategory.DataAnalyst;
//        JobCategory listJob3 = JobCategory.DataScientist;
//        JobCategory listJob4 = JobCategory.Devops;
//        JobCategory listJob5 = JobCategory.FrontEnd;
//        JobCategory listJob6 = JobCategory.UI;
//        JobCategory listJob7 = JobCategory.UX;
//        JobCategory listJob8 = JobCategory.WebDeveloper;

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

        // InvoiceStatus status1 = InvoiceStatus.Cancelled;
        // InvoiceStatus status2 = InvoiceStatus.Finished;
        // InvoiceStatus status3 = InvoiceStatus.OnGoing;
        
        //post test modul 3 
        // Location location = new Location("Depok", "Jawa Barat", "Universitas Indonesia");
        // Recruiter recruiter = new Recruiter(1, "Hansaka", "apaaja", "0811", location);
        // Job job = new Job(1, 100000000, "Senior Designer", JobCategory.WebDeveloper, recruiter);
        // Jobseeker jobseeker = new Jobseeker(1, "Mahasiwa", "tidakpenting@gmail.com", "1234556", "14 juli");
        // Invoice invoice1 = new Invoice(1 ,job.getId(), "23/03/2021", job.getFee(), jobseeker, pay1, status2);

    
        //invoice1.printData(); 
        // CS Modul 5 
        // Jobseeker jobseeker = new Jobseeker(1, "Mahasiwa", "tidakpenting@gmail.com", "1234556", "14 juli");
        // Bonus bonus1 = new Bonus(1, "123", 0, 100000, true);
        // Bonus bonus2 = new Bonus(1, "123", 100000000, 100000, true);
        // Location location = new Location("Depok", "Jawa Barat", "Universitas Indonesia");
        // Recruiter recruiter = new Recruiter(1, "Hansaka", "apaaja", "0811", location);
        // Job job = new Job(1, 100000000, "Senior Designer", JobCategory.WebDeveloper, recruiter);

       
        
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
        // GregorianCalendar calender = new GregorianCalendar(2021, 07, 14);
        // Jobseeker jobseeker = new Jobseeker(1, "Arief Saferman", "..arief@gmail.com", "123", calender);
        // Jobseeker jobseeker2 = new Jobseeker(2, "Salman", "arief.saferman@gmail.com", "Saferman14", 2021, 07, 14);
        // Jobseeker jobseeker3 = new Jobseeker(3, "Aldo", "..arief@gmail.com", "123");

        // EwalletPayment e1 = new EwalletPayment(1, job, jobseeker, status2);
        // EwalletPayment e2 = new EwalletPayment(2, job, jobseeker, bonus1, status2);
        // EwalletPayment e3 = new EwalletPayment(2, job, jobseeker, bonus2, status2);
        // BankPayment b1 = new BankPayment(1, job, jobseeker, status2); 

        // System.out.println(jobseeker.toString()); 
        // System.out.println(jobseeker2.toString()); 
        // System.out.println(jobseeker3.toString()); 

        // jobseeker.setEmail("salman.alfarisi@gmail.com");
        // jobseeker.setPassword("salmanAiueo10");
        // System.out.println(jobseeker.toString());

        // //PT Modul 5 
        // System.out.println(e1.toString());
        // System.out.println(b1.toString());
//        Calendar tanggal = new GregorianCalendar(2021, 07, 14);
//        Jobseeker jobseeker = new Jobseeker(1, "Mahasiwa", "tidakpenting@gmail.com", "1234556", tanggal);
//        Location location = new Location("Depok", "Jawa Barat", "Universitas Indonesia");
//        Recruiter recruiter = new Recruiter(1, "Hansaka", "apaaja", "0811", location);
//        Job job = new Job(1, 10, "Senior Designer", JobCategory.WebDeveloper, recruiter);
//
//        InvoiceStatus status1 = InvoiceStatus.Cancelled;
//        InvoiceStatus status2 = InvoiceStatus.Finished;
//        InvoiceStatus status3 = InvoiceStatus.OnGoing;
//
//        Bonus bonus1 = new Bonus(1, "123", 0, 100000, true);
//        Bonus bonus2 = new Bonus(1, "123", 100000000, 100000, true);
//
//        EwalletPayment e1 = new EwalletPayment(1, job, jobseeker, status2);
//        // EwalletPayment e2 = new EwalletPayment(2, job, jobseeker, bonus1, status2);
//        // EwalletPayment e3 = new EwalletPayment(2, job, jobseeker, bonus2, status2);
//
//        BankPayment b1 = new BankPayment(1, job, jobseeker, status2);
//
//        System.out.println(e1.toString());
//        System.out.println(b1.toString());

//        Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Tanah Abang");
        // DatabaseRecruiter.addRecruiter(new Recruiter(1, "Arief", "arief@example.com", "0218770", location1));
        // DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Arief", "arief@example.com", "SafermanArief14", 2021, 04, 6));
        // DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Arief", "arief@example.com", "SafermanArief14", 2021, 04, 6));
        // DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1 , "Titus Zarek", "titus.zarek@ui.ac.id", "Titus14Zarek", 2021, 04, 6));
        // System.out.println(DatabaseJobseeker.getJobDatabase());
//        DatabaseJob.addJob(new Job(1, "Backend Engineer Solusimas", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
//        DatabaseJob.addJob(new Job(1, "Engineer Backend masSoulsi", DatabaseRecruiter.getRecruiterById(1), 20000, JobCategory.BackEnd));
//        DatabaseJob.addJob(new Job(1, "Frontend Engineer Solusimas", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.FrontEnd));
//        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Arief", "arief@ui.ac.id", "ariefSaferman123", 2021, 03 ,6));
//        System.out.println(DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Arief", "arief@ui.ac.id", "ariefSaferman123", 2021, 03 ,6)));
//        System.out.println(DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Arief", "arief@example.com", "0218770", location1)));
//        System.out.println(DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Arief", "arief@example.com", "SafermanArief14", 2021, 04, 6)));
//        System.out.println(DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1 , "Titus Zarek", "titus.zarek@ui.ac.id", "Titus14Zarek", 2021, 04, 6)));
        // Job job2 = new Job(1, 1000, "Data Analyst", JobCategory.FrontEnd, DatabaseRecruiter.getRecruiterById(1));
        // DatabaseJob.addJob(new Job(1, 1000, "Data Analyst", JobCategory.FrontEnd, DatabaseRecruiter.getRecruiterById(1)));
        // DatabaseJob.addJob(new Job(2, 2000, "Data Scientist", JobCategory.FrontEnd, DatabaseRecruiter.getRecruiterById(1)));
        // DatabaseJob.addJob(new Job(3, 3000, "Software Engineer", JobCategory.FrontEnd, DatabaseRecruiter.getRecruiterById(1)));
        // System.out.println(DatabaseJob.getJobByCategory(JobCategory.FrontEnd));

        // PT Modul 6 
        // DatabaseBonus.addBonus(new Bonus(1, "JKL40", 1000, 500, false));
        // DatabaseBonus.addBonus(new Bonus(2, "JKL40", 1000, 500, true));

        // System.out.println(DatabaseBonus.getBonusById(1));
        // System.out.println(DatabaseBonus.getBonusById(2));

        // ArrayList<Job> job1 = new ArrayList<Job>(); 
        // job1.add(new Job(1, 1000, "Arief", JobCategory.DataScientist, new Recruiter(1, "Titus", "titus@example.com", "021", location1)));
        // ArrayList<Job> job2 = new ArrayList<Job>();
        // job2.add(new Job(2, 2000, "Arief", JobCategory.DataScientist, new Recruiter(1, "Titus", "titus@example.com", "021", location1)));

        // BankPayment b1 = new BankPayment(1, job1, DatabaseJobseeker.getJobseekerById(1));
        
        // CS Modul 7 
//        try {
//            DatabaseJobseeker.addJobseeker(new Jobseeker(1, "Arief",
//                            "arief.saferman@gmail.com", "Arief123", 2021, 04, 22));
//    } catch (EmailAlreadyExistsException e) {
//            System.out.println(e.getMessage());
//    }
//    try {
//            DatabaseJobseeker.addJobseeker(new Jobseeker(2, "Saferman",
//                            "arief.saferman@gmail.com", "Arief123", 2021, 04, 23));
//    } catch (EmailAlreadyExistsException e) {
//            System.out.println(e.getMessage());
//    }
//    try {
//            DatabaseJobseeker.addJobseeker(new Jobseeker(3, "Max",
//                            "Max@ui.ac.id", "LALAs123", 2021, 03, 6));
//    } catch (EmailAlreadyExistsException e) {
//            System.out.println(e.getMessage());
//    }
//    try {
//            DatabaseJobseeker.addJobseeker(new Jobseeker(4, "Fucini",
//                    "Fucini@ui.ac.id", "Facili123", 2021, 03, 6));
//    } catch (EmailAlreadyExistsException e) {
//            System.out.println(e.getMessage());
//    }
//
//    try {
//            DatabaseBonus.addBonus(new Bonus(101, "Mers", 200000, 500000, false));
//    } catch (ReferralCodeAlreadyExistsException e) {
//            System.out.println(e.getMessage());
//    }
//    try {
//            DatabaseBonus.addBonus(new Bonus(101, "Mers", 200000, 500000, true));
//    } catch (ReferralCodeAlreadyExistsException e) {
//            System.out.println(e.getMessage());
//    }
//System.out.println("=========Database JobSeeker============");
//    System.out.println(DatabaseJobseeker.getJobDatabase());
//
//    System.out.println("=========Database Bonus===============");
//    System.out.println(DatabaseBonus.getBonusDatabase());
//
//    //Buat Thread
    Recruiter recruiter = new Recruiter(1, "Hansaka", "apaaja", "0811", location1);
//    Job job1 = new Job(1, 100, "arief", JobCategory.BackEnd, recruiter);
//    try {
//
//        Jobseeker js1 = DatabaseJobseeker.getJobseekerById(1);
//        Jobseeker js2 = DatabaseJobseeker.getJobseekerById(3);
//        Jobseeker js3 = DatabaseJobseeker.getJobseekerById(4);
//
        Location l = new Location("California", "Silicon Valley", "Headquarter");
        Recruiter r = new Recruiter(1, "Mark Zuckerberg", "mark@facebook.com", "0123123", l);
        DatabaseJob.addJob(new Job(1, 1000, "Facebook UI Designer",JobCategory.UI, recruiter));
//
//        DatabaseInvoice.addInvoice(new BankPayment(1, DatabaseJob.getJobDatabase(), js1));
//        DatabaseInvoice.addInvoice(new BankPayment(2, DatabaseJob.getJobDatabase(), js2));
//        DatabaseInvoice.addInvoice(new BankPayment(3, DatabaseJob.getJobDatabase(), js3));
//
//    } catch (JobSeekerNotFoundException e) {
//        System.out.print(e.getMessage());
//        return;
//    }
//    Thread thread1 = new Thread(new FeeCalculator());
//    thread1.start();
    //    try {
    //        DatabaseInvoice.addInvoice(new EwalletPayment(DatabaseInvoice.getLastId() + 1, DatabaseJob.getJobDatabase(), DatabaseJobseeker.getJobseekerById(1)));
    //        DatabaseInvoice.addInvoice(new BankPayment(DatabaseInvoice.getLastId() + 1, DatabaseJob.getJobDatabase(), DatabaseJobseeker.getJobseekerById(2), 3000));
    //        DatabaseInvoice.addInvoice(new EwalletPayment(DatabaseInvoice.getLastId() + 1, DatabaseJob.getJobDatabase(), DatabaseJobseeker.getJobseekerById(3)));
    //        DatabaseInvoice.addInvoice(new EwalletPayment(DatabaseInvoice.getLastId() + 1, DatabaseJob.getJobDatabase(), DatabaseJobseeker.getJobseekerById(3)));
    //    }
    //    catch (JobSeekerNotFoundException e) {
    //        System.out.println(e.getMessage());
    //    }
    //    catch (OngoingInvoiceAlreadyExistsException e){
    //        System.out.println(e.getMessage());
    //    }

        // post test modul 7
//        try {
//            DatabaseJobseeker.addJobseeker(new Jobseeker(1, "asdfasdf", "arief.saferman@gmail.com", "123Asd"));
//            DatabaseInvoice.addInvoice(new BankPayment(DatabaseInvoice.getLastId() + 1, DatabaseJob.getJobDatabase(), DatabaseJobseeker.getJobseekerById(DatabaseJobseeker.getLastId())));
//            DatabaseInvoice.addInvoice(new EwalletPayment(DatabaseInvoice.getLastId() + 1, DatabaseJob.getJobDatabase(), DatabaseJobseeker.getJobseekerById(DatabaseJobseeker.getLastId())));
//        } catch (EmailAlreadyExistsException e) {
//            // TODO Auto-generated catch block
//            System.out.println(e.getMessage());
//        }catch (JobSeekerNotFoundException e) {
//            System.out.println(e.getMessage());
//        } catch (OngoingInvoiceAlreadyExistsException e) {
//            System.out.println(e.getMessage());
//        }
//
//        for(Invoice i : DatabaseInvoice.getInvoiceDatabase()){
//            System.out.println(i);
//        }
    } 
}
