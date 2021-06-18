package ariefsaferman.jwork.database_postgre;

import ariefsaferman.jwork.*;
import ariefsaferman.jwork.database_connection.DatabaseConnectionPostgre;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.stream.Collectors;
/**
 *
 *
 * @author Arief Saferman
 * @version  18 Juni 2021
 *
 */
public class DatabaseInvoicePostgre extends DatabaseConnectionPostgre
{
    /**
     * method yang digunakan untuk menambah invoice
     * @return boolean
     * @param invoice object invoice
     */
    public static boolean addInvoice(Invoice invoice) throws SQLException {
        Connection c = connection();
        PreparedStatement stmt;

        Statement statement = c.createStatement();
        String sql = "SELECT COUNT(invoicestatus) FROM invoice WHERE jobseeker = "+invoice.getJobseeker().getId() +" AND invoicestatus = 'OnGoing';";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            if (resultSet.getInt("count") > 0) {
                return false;
            } else {
                break;
            }

        }

        sql = "INSERT INTO invoice( jobseeker,  totalfee, adminfee, bonus, invoicestatus, payment, jobs) VALUES (?,?,?,?,?::invoicestat,?::payment_type,?::integer[]);";
        stmt = c.prepareStatement(sql);
        stmt.setInt(1, invoice.getJobseeker().getId());
        stmt.setInt(2, invoice.getTotalFee());
        stmt.setString(5, invoice.getStatus().toString());
        stmt.setString(6, invoice.getPaymentType().toString());
        stmt.setString(7, Arrays.toString(invoice.getJobs().stream().map(job -> job.getId()).toArray()).replace("[" , "{").replace("]", "}") );
        if (invoice.getPaymentType() == PaymentType.EwalletPayment) {
            EwalletPayment ewalletPayment = (EwalletPayment) invoice;
            stmt.setInt(4, ewalletPayment.getId());
            stmt.setNull(3, Types.INTEGER);
        }
        else {
            BankPayment bankPayment = (BankPayment) invoice;
            stmt.setInt(3, bankPayment.getAdminFee());
            stmt.setNull(4, Types.INTEGER);
        }

        return stmt.executeUpdate() != 0 ? true:false;
    }

    /**
     * method yang digunakan untuk mendapatkan invoice berdasarkan id
     * @return Invoice
     * @param id int id dari invoice
     */
    public static Invoice getInvoiceById(int id) throws SQLException {
        Connection c = connection();
        PreparedStatement stmt;

       Invoice invoice = null;


        Statement statement = c.createStatement();
        String sql = "SELECT * FROM invoice WHERE id = "+ id + ";";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int id_invoice = resultSet.getInt("id");
            Jobseeker jobseeker = DatabaseJobseekerPostgre.getJobseeker(resultSet.getInt("jobseeker"));
            String dateStr = resultSet.getString("invoicedate");
            Date invoiceDate = Date.valueOf(dateStr);
            int totalfee = resultSet.getInt("totalfee");
            String invoiceStatus = resultSet.getString("invoicestatus");
            InvoiceStatus status = InvoiceStatus.valueOf(invoiceStatus);
            PaymentType paymentType = PaymentType.valueOf(resultSet.getString("payment"));
            ArrayList<Job> jobs = Arrays.stream(((Integer[]) resultSet.getArray("jobs").getArray())).map(integer -> DatabaseJobPostgre.getJobById(integer)).collect(Collectors.toCollection(ArrayList::new));
            if (paymentType == PaymentType.EwalletPayment) {
                invoice = new EwalletPayment(id_invoice, jobs, jobseeker, DatabaseBonusPostgre.getBonusById(resultSet.getInt("bonus")) );
            } else {

                invoice = new BankPayment(id_invoice, jobs, jobseeker, resultSet.getInt("adminfee"));
            }
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(invoiceDate);
            invoice.setDate(calendar);

            invoice.setTotalFee(totalfee);
            invoice.setInvoiceStatus(status);
        }
        return invoice;
    }

    /**
     * method yang digunakan untuk mendapatkan invoice berdasarkan jobseeker
     * @return ArrayList invoice
     * @param jobseekerId id dari jobseeker
     */
    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerId) throws SQLException {
        Connection c = connection();
        PreparedStatement stmt;

        ArrayList<Invoice> invoices = new ArrayList<>();



        Statement statement = c.createStatement();
        String sql = "SELECT * FROM invoice WHERE jobseeker = "+ jobseekerId + ";";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            Invoice invoice = null;
            int id_invoice = resultSet.getInt("id");
            Jobseeker jobseeker = DatabaseJobseekerPostgre.getJobseeker(resultSet.getInt("jobseeker"));
            String dateStr = resultSet.getString("invoicedate");
            Date invoiceDate = Date.valueOf(dateStr);
            int totalfee = resultSet.getInt("totalfee");
            String invoiceStatus = resultSet.getString("invoicestatus");
            InvoiceStatus status = InvoiceStatus.valueOf(invoiceStatus);
            PaymentType paymentType = PaymentType.valueOf(resultSet.getString("payment"));
            ArrayList<Job> jobs = Arrays.stream(((Integer[]) resultSet.getArray("jobs").getArray())).map(integer -> DatabaseJobPostgre.getJobById(integer)).collect(Collectors.toCollection(ArrayList::new));
            if (paymentType == PaymentType.EwalletPayment) {
                invoice = new EwalletPayment(id_invoice, jobs, jobseeker, DatabaseBonusPostgre.getBonusById(resultSet.getInt("bonus")) );
            } else {

                invoice = new BankPayment(id_invoice, jobs, jobseeker, resultSet.getInt("adminfee"));
            }
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(invoiceDate);
            invoice.setDate(calendar);

            invoice.setTotalFee(totalfee);
            invoice.setInvoiceStatus(status);
            invoices.add(invoice);
        }
        return invoices;
    }

    /**
     * method yang digunakan untuk mengubah invoice
     * @return boolean
     * @param invoice object invoice
     */
    public static boolean changeInvoice(Invoice invoice) throws SQLException {
        Connection c = connection();

        Statement statement = c.createStatement();
        String sql = "UPDATE  invoice SET invoicestatus = '" + invoice.getStatus().toString() + "' WHERE id =  " + invoice.getId() + ";";

        return statement.executeUpdate(sql) != 0 ? true:false;
    }
}
