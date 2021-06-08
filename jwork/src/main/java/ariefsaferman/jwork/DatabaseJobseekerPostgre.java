package ariefsaferman.jwork;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseJobseekerPostgre
{
    public static Connection insertJobSeeker()
    {
        Connection c = null;
        Statement stmt = null;

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://5432/jwork", "postgresql", "saferman14");
            c.setAutoCommit(false);
            System.out.println("Opened Database Succesfuly");

            stmt = c.createStatement();
            String sql = "INSERT INTO jobseeker(id, nama, email, tanggal, bulan, tahun, password)"
                    + "VALUES (1, `Arief`, `arief.saferman@gmail.com`, 14, 07, 2000, `Saferman14`);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO jobseeker(id, nama, email, tanggal, bulan, tahun, password)"
                    + "VALUES (2, `kevin`, `kevin.darmawan@gmail.com`, 12, 12, 2012, `Kevin14`);";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        return c;
    }

    public static Connection getLastJobseekerId()
    {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jwork", "postgresql", "saferman14");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT id FROM jobseeker ORDER BY id DESC LIMIT 1");
            while ( rs.next() ) {
                int id = rs.getInt("id");
                System.out.println("ID = " + id);
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        return c;
    }

    public static Connection getJobseeker()
    {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jwork", "postgresql", "saferman14");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM jobseeker;");
            while ( rs.next() ) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                int tanggal = rs.getInt("tanggal");
                int bulan = rs.getInt("bulan");
                int tahun = rs.getInt("tahun");
                String password = rs.getString("password");
                System.out.println("ID = " + id);
                System.out.println( "NAME = " + name );
                System.out.println( "EMAIL = " + email );
                System.out.println( "TANGGAL = " + tanggal );
                System.out.println( "BULAN = " + bulan );
                System.out.println( "TAHUN = " + tahun );
                System.out.println(" PASSWORD = " + password);
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        return c;
    }

    public  static Connection removeJobseeker()
    {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jwork", "postgresql", "saferman14");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "DELETE FROM jobseeker;";
            stmt.executeUpdate(sql);
            c.commit();

            ResultSet rs = stmt.executeQuery("SELECT * FROM jobseeker;");
            while ( rs.next() ) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                int tanggal = rs.getInt("tanggal");
                int bulan = rs.getInt("bulan");
                int tahun = rs.getInt("tahun");
                String password = rs.getString("password");
                System.out.println("ID = " + id);
                System.out.println( "NAME = " + name );
                System.out.println( "EMAIL = " + email );
                System.out.println( "TANGGAL = " + tanggal );
                System.out.println( "BULAN = " + bulan );
                System.out.println( "TAHUN = " + tahun );
                System.out.println(" PASSWORD = " + password);
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        return c;
    }
}
