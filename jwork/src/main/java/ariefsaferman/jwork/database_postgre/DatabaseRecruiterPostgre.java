package ariefsaferman.jwork.database_postgre;

import ariefsaferman.jwork.database_connection.DatabaseConnectionPostgre;
import ariefsaferman.jwork.Location;
import ariefsaferman.jwork.Recruiter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 *
 * @author Arief Saferman
 * @version  18 Juni 2021
 *
 */

public class DatabaseRecruiterPostgre extends DatabaseConnectionPostgre
{
    /**
     * method yang digunakan untuk mendapatkan database recruiter
     * @return arraylist recruiter
     */
    public static ArrayList<Recruiter> getRecruiterDatabase()
    {
        Connection c = connection();
        PreparedStatement stmt;

        ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<>();
        int id = 0;
        String name = null;
        String email = null;
        String phoneNumber = null;
        String province = null;
        String city = null;
        String description = null;
        Recruiter recruiter = null;
        try {
            String sql = "SELECT id, name, email, phonenumber, (location).province, (location).city, (location).description FROM recruiter;";
            stmt = c.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                id = resultSet.getInt("id");
                name = resultSet.getString("name");
                email = resultSet.getString("email");
                phoneNumber = resultSet.getString("phonenumber");
                province = resultSet.getString("province");
                city = resultSet.getString("city");
                description = resultSet.getString("description");

                Location location = new Location(province, city, description);
                recruiter = new Recruiter(id, name, email, phoneNumber, location);
                RECRUITER_DATABASE.add(recruiter);
            }
            stmt.close();
            c.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return RECRUITER_DATABASE;
    }

    /**
     * method yang digunakan untuk menambahkan recruiter database
     * @return Recruiter
     * @param recruiter objek recruiter
     */
    public static Recruiter addRecruiter(Recruiter recruiter)
    {
        Connection c = connection();
        PreparedStatement stmt;
        String name = recruiter.getName();
        String email = recruiter.getEmail();
        String phoneNumber = recruiter.getPhoneNumber();
        String province = recruiter.getLocation().getProvince();
        String description = recruiter.getLocation().getDescription();
        String city = recruiter.getLocation().getCity();
        Location location = new Location(province, description, city);

        try {
            String sql = "INSERT INTO recruiter(name, email, phonenumber, location) VALUES (?, ?, ?, ROW(?,?,?)) RETURNING id;";
            stmt = c.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2,email);
            stmt.setString(3,phoneNumber);
            stmt.setString(4, location.getProvince());
            stmt.setString(5, location.getDescription());
            stmt.setString(6, location.getCity());
            ResultSet resultSet = stmt.executeQuery();
            int id = 1;
            while (resultSet.next()) {
                id = resultSet.getInt(1);
            }
            recruiter = new Recruiter(id, name, email, phoneNumber,location);
            stmt.close();
            c.close();
            return recruiter;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return recruiter;
    }

    /**
     * method yang digunakan untuk mendapatkan recruiter berdasarkan id
     * @return Recruiter
     * @param id_recruiter id recruiter yang ingin di dapatkan
     */
    public static Recruiter getRecruiterById(int id_recruiter)
    {
        Connection c = connection();
        PreparedStatement stmt;

        int id = 0;
        String name = null;
        String email = null;
        String phoneNumber = null;
        String province = null;
        String city = null;
        String description = null;
        Location location = null;
        Recruiter recruiter = null;

        try {
            String sql = "SELECT id, name, email, phonenumber, (location).province, (location).city, (location).description FROM recruiter WHERE id = ?;";
            stmt = c.prepareStatement(sql);
            stmt.setInt(1, id_recruiter);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                id = resultSet.getInt("id");
                name = resultSet.getString("name");
                email = resultSet.getString("email");
                phoneNumber = resultSet.getString("phonenumber");
                province = resultSet.getString("province");
                city = resultSet.getString("city");
                description = resultSet.getString("description");

                location = new Location(province, city, description);
            }
            stmt.close();
            c.close();
            recruiter = new Recruiter(id, name, email, phoneNumber, location);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return recruiter;
    }

}
