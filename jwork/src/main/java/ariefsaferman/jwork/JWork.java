package ariefsaferman.jwork;

import ariefsaferman.jwork.database.DatabaseJob;
import ariefsaferman.jwork.database.DatabaseRecruiter;
import ariefsaferman.jwork.database_postgre.DatabaseJobPostgre;
import ariefsaferman.jwork.database_postgre.DatabaseRecruiterPostgre;
import ariefsaferman.jwork.exception.RecruiterNotFoundException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

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

//        DatabaseRecruiter.addRecruiter(new Recruiter(1, "Arief", "arief.saferman@gmail.com", "021-81190", location1));
//        DatabaseRecruiter.addRecruiter(new Recruiter(2, "Salman", "salman.123@gmail.com", "021-8888", location2));
//        DatabaseRecruiter.addRecruiter(new Recruiter(3, "Faran", "farhan.almashur@gmail.com", "021-1111", location3));

//        try {
//            DatabaseJob.addJob(new Job(1, 10, "Mark", listJob1, DatabaseRecruiter.getRecruiterById(1)));
//            DatabaseJob.addJob(new Job(2, 100, "Will", listJob1, DatabaseRecruiter.getRecruiterById(2)));
//            DatabaseJob.addJob(new Job(3, 1000, "John", listJob2, DatabaseRecruiter.getRecruiterById(3)));
//            DatabaseJob.addJob(new Job(4, 10000, "Tato", listJob3, DatabaseRecruiter.getRecruiterById(3)));
//        } catch (RecruiterNotFoundException e) {
//            e.getMessage();
//        }


        DatabaseRecruiterPostgre.addRecruiter(new Recruiter(1, "Mark Zuckerberg", "mark.zuckerbeg@gmail.com", "021-123", location1));
        DatabaseJobPostgre.addJob(new Job(1, 1000, "DataScientist", listJob1, DatabaseRecruiterPostgre.getRecruiterById(1)));
        DatabaseJobPostgre.addJob(new Job(2, 2000, "Software Engineer", listJob2, DatabaseRecruiterPostgre.getRecruiterById(1)));

        SpringApplication.run(JWork.class, args);
    } 
}
