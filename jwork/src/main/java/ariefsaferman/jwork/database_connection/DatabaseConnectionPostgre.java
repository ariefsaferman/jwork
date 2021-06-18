package ariefsaferman.jwork.database_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 *
 *
 * @author Arief Saferman
 * @version  18 Juni 2021
 *
 */
public class DatabaseConnectionPostgre
{

    /**
     * method yang digunakan untuk membangun koneksi ke database postgreSQL
     * @return Connection koneksi ke database
     */
    public static Connection connection()
    {
        Connection c = null;
        Statement stmt = null;
        String db_name = "jwork";
        String db_user = "postgres";
        String db_password = "saferman14";
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + db_name, db_user, db_password);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return c;
    }
}
