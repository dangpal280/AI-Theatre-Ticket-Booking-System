
import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookSeat {

    public static void main(String[] args) {

        try {

            Connection con = DBconnection.getConnection();

            con.setAutoCommit(false);

            PreparedStatement seat =
            con.prepareStatement(
            "UPDATE seats SET status='BOOKED' WHERE seat_id=1");

            seat.executeUpdate();

            PreparedStatement booking =
            con.prepareStatement(
            "INSERT INTO bookings(user_id,seat_id,movie_id) VALUES(1,1,1)");

            booking.executeUpdate();

            con.commit();

            System.out.println("Seat booked successfully!");

        }

        catch(Exception e){
            e.printStackTrace();
        }

    }
}