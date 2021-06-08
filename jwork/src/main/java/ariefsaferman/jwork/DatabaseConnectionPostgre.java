package ariefsaferman.jwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseConnectionPostgre
{

    public static Connection connection()
    {
        Connection c = null;
        Statement stmt = null;
        String db_name = "jwork";
        String db_user = "postgres";
        String db_password = "saferman14";
        try {
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return c;
    }
}
