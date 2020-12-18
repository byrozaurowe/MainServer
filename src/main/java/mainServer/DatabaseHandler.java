package mainServer;




import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DatabaseHandler {

    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://34.107.65.104:3306/pz";
    private static final String user = "backend";
    private static final String password = "backendpz2020";

    private static DatabaseHandler DATABASE_HANDLER;

    public static DatabaseHandler getInstance() {
        if(DATABASE_HANDLER == null) {
            DATABASE_HANDLER = new DatabaseHandler();
        }
        return DATABASE_HANDLER;
    }

    private DatabaseHandler() {
        if(DATABASE_HANDLER == null) {
            try {
                Properties props = new Properties();
                // opening database connection to MySQL server*/
                props.clear();
                props.setProperty("user", user);
                props.setProperty("password", password);
                props.setProperty("useSSL", "true");
                props.setProperty("requireSSL", "true");
                props.setProperty("verifyServerCertificate", "true");

                System.setProperty("javax.net.ssl.trustStoreType", "JKS");
                System.setProperty("javax.net.ssl.trustStore", "src\\main\\resources\\truststore.jks");
                //System.setProperty("javax.net.ssl.trustStorePassword", "changeit");

                System.setProperty("javax.net.ssl.keyStoreType", "JKS");
                System.setProperty("javax.net.ssl.keyStore", "src\\main\\resources\\keystore.jks");
                System.setProperty("javax.net.ssl.keyStorePassword", "password");

                con = DriverManager.getConnection(url, props);
                // getting Statement object to execute query
                stmt = con.createStatement();
            } catch (SQLException sqlEx) {
                sqlEx.printStackTrace();
            }
        }
    }

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    void closeConnection() {
        try {
            con.close();
        } catch (SQLException se) { /*can't do anything */ }
        try {
            stmt.close();
        } catch (SQLException se) { /*can't do anything */ }
    }

    public Object loggIn(String login, String haslo) throws SQLException {
//        String query = "insert into main (login, password, mail, date_reg) VALUES ('test', 'test', 'test', '2020-11-19')";
        // exist
        //String account_login_1 = "zxcv";
        //String account_pass_1 = "123456";

        String query_loggin = "SELECT count(id) FROM user_details WHERE login='" + login + "'AND password='" + haslo + "'";
        ResultSet rs = stmt.executeQuery(query_loggin);
        rs.next();
        return rs.getObject(1);
    }

}