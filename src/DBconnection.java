
import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {

    public static Connection getConnection() {

        Connection con = null;

        try {

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/theatre_booking",
                "root",
                "root@123"
            );

            System.out.println("Connected to MySQL!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}