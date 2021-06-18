package ariefsaferman.jwork.database_postgre;

import ariefsaferman.jwork.Bonus;
import ariefsaferman.jwork.database_connection.DatabaseConnectionPostgre;

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
public class DatabaseBonusPostgre extends DatabaseConnectionPostgre
{
    private static ArrayList<Bonus> DATABASE_BONUS = new ArrayList<>();

    /**
     * method yang digunakan untuk mendapatkan database bonus
     * @return ArrayList mengebalikan arraylist bonus
     */
    public static ArrayList<Bonus> getDatabaseBonus()
    {
        Connection c = connection();
        PreparedStatement stmt;
        int id = 0;
        String referralCode = null;
        int extraFee = 0;
        int minTotalFee = 0;
        boolean active = false;
        Bonus bonus = null;

        try {
            String sql = "SELECT * FROM bonus;";
            stmt = c.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                id = resultSet.getInt("id");
                referralCode = resultSet.getString("referralcode");
                extraFee = resultSet.getInt("extrafee");
                minTotalFee = resultSet.getInt("mintotalfee");
                active = resultSet.getBoolean("active");
                bonus = new Bonus(id, referralCode, extraFee, minTotalFee, active);
                DATABASE_BONUS.add(bonus);
            }
            stmt.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DATABASE_BONUS;
    }

    /**
     * method yang digunakan untuk menambah item ke database bonus
     * @return Bonus mengebalikan bonus
     * @param referralCode string referral
     * @param extraFee int extraFee
     * @param minTotalFee int minimal total fee
     * @param active boolean bonus true/false
     */
    public static Bonus addBonus(String referralCode, int extraFee, int minTotalFee, Boolean active)
    {
        Connection c = connection();
        PreparedStatement stmt;
        Bonus bonus = null;

        try {
            String sql = "INSERT INTO bonus(referralcode, extrafee, mintotalfee, active) VALUES (?, ?, ?, ?) RETURNING id;";
            stmt = c.prepareStatement(sql);
            stmt.setString(1, referralCode);
            stmt.setInt(2, extraFee);
            stmt.setInt(3, minTotalFee);
            stmt.setBoolean(4, active);
            ResultSet resultSet = stmt.executeQuery();

            int id = 1;
            while (resultSet.next()) {
                id = resultSet.getInt(1);
            }
            bonus = new Bonus(id, referralCode, extraFee, minTotalFee, active);
            stmt.close();
            c.close();
            return bonus;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bonus;
    }

    /**
     * method yang digunakan untuk mendapatkan bonus berdasarkan referralCode
     * @return Bonus mengembalikkan bonus
     * @param referralCode String referral
     */
    public static Bonus getBonusByReferralCode(String referralCode)
    {
        Connection c = connection();
        PreparedStatement stmt;
        int id = 0;
        String codeReferral = null;
        int extraFee = 0;
        int minTotalFee = 0;
        boolean active = false;
        Bonus bonus = null;

        try {
            String sql = "SELECT * FROM bonus WHERE referralCode = ?;";
            stmt = c.prepareStatement(sql);
            stmt.setString(1, referralCode);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                id = resultSet.getInt("id");
                codeReferral = resultSet.getString("referralcode");
                extraFee = resultSet.getInt("extrafee");
                minTotalFee = resultSet.getInt("mintotalfee");
                active = resultSet.getBoolean("active");
            }
            stmt.close();
            c.close();
            bonus = new Bonus(id, codeReferral, extraFee, minTotalFee, active);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bonus;
    }

    /**
     * method yang digunakan untuk mendapatkan bonus berdasarkan id
     * @return Bonus bonus
     * @param bonusId int id bonus
     */
    public static Bonus getBonusById(int bonusId)
    {
        Connection c = connection();
        PreparedStatement stmt;
        int id = 0;
        String codeReferral = null;
        int extraFee = 0;
        int minTotalFee = 0;
        boolean active = false;
        Bonus bonus = null;

        try {
            String sql = "SELECT * FROM bonus WHERE id = ?;";
            stmt = c.prepareStatement(sql);
            stmt.setInt(1, bonusId);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                id = resultSet.getInt("id");
                codeReferral = resultSet.getString("referralcode");
                extraFee = resultSet.getInt("extrafee");
                minTotalFee = resultSet.getInt("mintotalfee");
                active = resultSet.getBoolean("active");
            }
            stmt.close();
            c.close();
            bonus = new Bonus(id, codeReferral, extraFee, minTotalFee, active);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bonus;
    }

}
