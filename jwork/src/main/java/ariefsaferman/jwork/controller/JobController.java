package ariefsaferman.jwork.controller;

import ariefsaferman.jwork.*;
import ariefsaferman.jwork.database.DatabaseJob;
import ariefsaferman.jwork.database.DatabaseJobseeker;
import ariefsaferman.jwork.database.DatabaseRecruiter;
import ariefsaferman.jwork.database_postgre.DatabaseJobPostgre;
import ariefsaferman.jwork.database_postgre.DatabaseRecruiterPostgre;
import ariefsaferman.jwork.exception.JobNotFoundException;
import ariefsaferman.jwork.exception.RecruiterNotFoundException;
import jdk.jfr.Category;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/job")
@RestController
public class JobController
{
    @RequestMapping("")
    public ArrayList<Job> getAllJob()
    {
//        ArrayList<Job> job = null;
//        job = DatabaseJob.getJobDatabase();
//        return job;
        return DatabaseJobPostgre.getAllJob();
    }

    @RequestMapping("/{id}")
    public Job getJobById(@PathVariable int id)
    {
//        Job job = null;
//        try{
//            job = DatabaseJob.getJobById(id);
//        } catch (JobNotFoundException e){
//            e.getMessage();
//            return null;
//        }
        return DatabaseJobPostgre.getJobById(id);
    }

    @RequestMapping("/recruiter/{recruiterId}")
    public ArrayList<Job> getJobByRecruiter(@PathVariable int recruiterId)
    {
//        ArrayList<Job> job = null;
//        job = DatabaseJob.getJobByRecruiter(recruiterId);

        return DatabaseJobPostgre.getJobByRecruiter(recruiterId);
    }

    @RequestMapping("/category/{category}")
    public ArrayList<Job> getJobByCategory(@PathVariable JobCategory category)
    {
//        ArrayList<Job> job = null;
//        job = DatabaseJob.getJobByCategory(category);
        return DatabaseJobPostgre.getJobByCategory(category);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Job addJob(@RequestParam(value="name") String name,
                      @RequestParam(value="fee") int fee,
                      @RequestParam(value="category") String category,
                      @RequestParam(value="recruiterId") int recruiterId)
    {
//        Job job = null;
//        try {
//            job = new Job(DatabaseJobseeker.getLastId()+1, fee, name, JobCategory.valueOf(category), DatabaseRecruiter.getRecruiterById(recruiterId));
//        } catch (RecruiterNotFoundException e) {
//            e.getMessage();
//        }
//
//        Boolean status = DatabaseJob.addJob(job);
//        if(status == true){
//            return job  ;
//        } else {
//            return null;
//        }
        Job job = new Job(DatabaseJobPostgre.getLastJobId()+1, fee, name, JobCategory.valueOf(category), DatabaseRecruiterPostgre.getRecruiterById(recruiterId));

        return DatabaseJobPostgre.addJob(job);
    }
}
