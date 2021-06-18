package ariefsaferman.jwork.database_postgre;

import ariefsaferman.jwork.Jobseeker;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 *
 * @author Arief Saferman
 * @version  18 Juni 2021
 *
 */

import static ariefsaferman.jwork.database_connection.DatabaseConnectionPostgre.connection;
public class DatabaseJobseekerPostgre
{
    /**
     * method yang digunakan untuk menambahkan jobseeker
     * @return Jobseeker
     * @param name string nama jobseeker
     * @param email strign email jobseeker
     * @param password string password jobseeker
     */
    public static Jobseeker insertJobSeeker(String name, String email, String password)
    {
        // Cek Email
        Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z[0-9]]{6,}$");
        Matcher matcher = p.matcher(password);
        if(!matcher.matches()){
            return null;
        }

        // Cek password
        p = Pattern.compile("(?!.*\\.{2,})(?!\\.)[0-9A-z.&*_~]+@(?!-)[0-9A-z&*_~.-]+");
        matcher = p.matcher(email);
        if(!matcher.matches()){
            return null;
        }

        Connection c = connection();
        PreparedStatement stmt;
        Jobseeker jobseeker = null;
        try {
            String sql = "INSERT INTO jobseeker(name, email, password) VALUES (?,?,?) RETURNING id;";
            stmt = c.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, password);
            ResultSet resultSet = stmt.executeQuery();
            int id = 1;
            while (resultSet.next()) {
                id = resultSet.getInt(1);
            }
            jobseeker = new Jobseeker(id, name, email, password);
            stmt.close();
            c.close();
            return jobseeker;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jobseeker;
    }

    /**
     * method yang digunakan untuk mendapatkan id terakhir jobseeker
     * @return int id jobseeker terakhir
     */
    public static int getLastJobseekerId()
    {
        Connection c = connection();
        PreparedStatement stmt;
        int id = 0;
        try {
            String sql = "SELECT id FROM jobseeker ORDER BY id DESC LIMIT 1;";
            stmt = c.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                id = resultSet.getInt(1);
            }
            stmt.close();
            c.close();
            return id;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    /**
     * method yang digunakan untuk mendapatkan database jobseeker
     * @return arraylist jobnseeker
     */
    public static ArrayList<Jobseeker> getDatabaseJobseeker()
    {
        Connection c = connection();
        PreparedStatement stmt = null;

        ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
        int id = 0;
        String name = null;
        String email = null;
        String password = null;
        Jobseeker jobseeker = null;
        try {
            String sql = "SELECT * FROM jobseeker;";
            stmt = c.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                id = resultSet.getInt("id");
                name = resultSet.getString("name");
                email = resultSet.getString("email");
                password = resultSet.getString("password");
                jobseeker = new Jobseeker(id, name, email, password);
                JOBSEEKER_DATABASE.add(jobseeker);
            }
            stmt.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return JOBSEEKER_DATABASE;
    }

    /**
     * method yang digunakan untuk menghapus jobseeker dari databse jobseeker
     * @return Boolean
     * @param id id jobseeker yang ingin dihapus
     */
    public static Boolean removeJobseeker(int id)
    {
        Connection c = connection();
        PreparedStatement stmt;
        try {
            String sql = "DELETE FROM jobseeker WHERE id = ?;";
            stmt = c.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            stmt.close();
            c.close();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    /**
     * method yang digunakan untuk mendapatkan jobseeker
     * @return Jobseeker
     * @param email2 email jobseeker
     * @param password2 password jobseeker
     */
    public static Jobseeker getJobseeker(String email2, String password2)
    {
        Connection c = connection();
        PreparedStatement stmt;
        Calendar joinDate = new GregorianCalendar();
        Jobseeker jobseeker = null;

        try {
            String sql = "SELECT id, name, email, password, joinDate FROM jobseeker WHERE email =? AND password = ?;";
            stmt = c.prepareStatement(sql);
            stmt.setString(1, email2);
            stmt.setString(2, password2);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                Date tanggal = resultSet.getDate("joinDate");
                jobseeker = new Jobseeker(id, name, email, password);

                joinDate.setTime(tanggal);
                jobseeker.setJoinDate(joinDate);
            }
            stmt.close();
            c.close();
            return jobseeker;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return jobseeker;
    }

    /**
     * method yang digunakan untuk mendapatkan jobseeker berdasarkan id nya
     * @return Jobseeker
     * @param id_jobseeker id jobseeker
     */
    public static Jobseeker getJobseeker(int id_jobseeker)
    {
        Connection c = connection();
        PreparedStatement stmt;
        int id = 0;
        String name = null;
        String email = null;
        String password = null;
        Jobseeker jobseeker = null;

        try {
            String sql = "SELECT * FROM jobseeker WHERE id = ?;";
            stmt = c.prepareStatement(sql);
            stmt.setInt(1, id_jobseeker);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                id = resultSet.getInt("id");
                name = resultSet.getString("name");
                email = resultSet.getString("email");
                password = resultSet.getString("password");
            }
            stmt.close();
            c.close();
            jobseeker = new Jobseeker(id, name, email, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jobseeker;
    }
}
