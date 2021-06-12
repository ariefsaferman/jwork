package ariefsaferman.jwork.database_postgre;

import ariefsaferman.jwork.Job;
import ariefsaferman.jwork.JobCategory;
import ariefsaferman.jwork.Recruiter;
import ariefsaferman.jwork.database_connection.DatabaseConnectionPostgre;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class DatabaseJobPostgre extends DatabaseConnectionPostgre
{
    public static ArrayList<Job> getAllJob()
    {
        Connection c = connection();
        PreparedStatement stmt;

        ArrayList<Job> JOB_DATABASE = new ArrayList<>();
        int id = 0;
        int fee = 0;
        int recruiter_id = 0;
        String name = null;
        String category = null;
        JobCategory jobCategory = null;
        Recruiter recruiter = null;

        try {
            String sql = "SELECT * FROM job;";
            stmt = c.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                id = resultSet.getInt("id");
                fee = resultSet.getInt("fee");
                recruiter_id = resultSet.getInt("recruiter");
                name = resultSet.getString("name");
                category = resultSet.getString("category");
                jobCategory = JobCategory.valueOf(category);
                recruiter = DatabaseRecruiterPostgre.getRecruiterById(recruiter_id);

                Job job = new Job(id, fee, name, jobCategory, recruiter);
                JOB_DATABASE.add(job);
            }
            stmt.close();
            c.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return JOB_DATABASE;

    }

    public static int getLastJobId()
    {
        Connection c = connection();
        PreparedStatement stmt;
        int id = 0;

        try {
            String sql = "SELECT id FROM job ORDER BY id DESC LIMIT 1";
            stmt = c.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                id = resultSet.getInt(1);
            }
            stmt.close();
            c.close();
            return id;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return id;
    }

    public static Job addJob(Job job)
    {
        Connection c = connection();
        PreparedStatement stmt;
        Job jobs = null;
        int fee = job.getFee();
        String name = job.getName();
        JobCategory category = job.getCategory();
        Recruiter recruiter = job.getRecruiter();


        try {
            String sql = "INSERT INTO job(fee, name, category, recruiter) VALUES (?,?,?::job_category,?);";
            stmt = c.prepareStatement(sql);
            stmt.setInt(1,fee);
            stmt.setString(2, name);
            stmt.setString(3, category.name());
            stmt.setInt(4, recruiter.getId());
            int update = stmt.executeUpdate();
            ResultSet resultSet = stmt.getGeneratedKeys();
            int id = 1;
            while (resultSet.next()) {
                id = resultSet.getInt(1);
            }
            job = new Job(id, fee, name, category, recruiter);
            stmt.close();
            c.close();
            return job;

        } catch (SQLException throwables) {
            System.out.println("addjob");
            throwables.printStackTrace();
        }
        return job;
    }

    public static ArrayList<Job> getJobByCategory(JobCategory category)
    {
        Connection c = connection();
        PreparedStatement stmt;
        ArrayList<Job> job = new ArrayList<>();

        try {
            String sql = "SELECT * FROM job WHERE category = ?;";
            stmt = c.prepareStatement(sql);
            stmt.setString(1, category.name());
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int recruiterId = resultSet.getInt("recruiter");
                int fee = resultSet.getInt("fee");
                String job_category = resultSet.getString("category");
                JobCategory  jobCategory = JobCategory.valueOf(job_category);
                Recruiter recruiter = DatabaseRecruiterPostgre.getRecruiterById(recruiterId);

                Job job1 = new Job(id, fee, name, jobCategory, recruiter);
                job.add(job1);
            }
            stmt.close();
            c.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return job;
    }

    public static ArrayList<Job> getJobByRecruiter(int recruiterId)
    {
        Connection c = connection();
        PreparedStatement stmt;
        ArrayList<Job> job = new ArrayList<>();

        try {
            String sql = "SELECT * FROM job WHERE recruiter = ?;";
            stmt = c.prepareStatement(sql);
            stmt.setInt(1, recruiterId);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int fee = resultSet.getInt("fee");
                String name = resultSet.getString("name");
                String category_string = resultSet.getString("category");
                JobCategory category = JobCategory.valueOf(category_string);
                recruiterId = resultSet.getInt("recruiter");
                Recruiter recruiter = DatabaseRecruiterPostgre.getRecruiterById(recruiterId);

                Job job1 = new Job(id, fee, name, category, recruiter);
                job.add(job1);
            }
            stmt.close();
            c.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return job;
    }

    public static boolean removeJob(int id)
    {
        Connection c = connection();
        PreparedStatement stmt;

        try {
            String sql = "DELETE FROM job WHERE id = ?;";
            stmt = c.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();
            stmt.close();
            c.close();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    public static Job getJobById(int jobId)
    {
        Connection c = connection();
        PreparedStatement stmt;
        int id = 0;
        int fee = 0;
        String name = null;
        JobCategory category = null;
        Recruiter recruiter = null;
        Job job1 = null;
        try {
            String sql = "SELECT * FROM job WHERE id = ?;";
            stmt = c.prepareStatement(sql);
            stmt.setInt(1, jobId);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                id = resultSet.getInt("id");
                fee = resultSet.getInt("fee");
                name = resultSet.getString("name");
                String category_string = resultSet.getString("category");
                category = JobCategory.valueOf(category_string);
                int recruiterId = resultSet.getInt("recruiter");
                recruiter = DatabaseRecruiterPostgre.getRecruiterById(recruiterId);

                job1 = new Job(id, fee, name, category, recruiter);
                stmt.close();
                c.close();
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return job1;
    }
}
