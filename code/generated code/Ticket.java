
import java.util.*;

/**
 * @author Sujay Mahadik
 */
public class Ticket {

    public Ticket() {
    }

    public static int pnrNo;

    public static String status;

    public static String trainName;

    public static int noOfPassengers;

    public void newTicket(int trainNo, int pass) {
        Random rnd = new Random();
        int n = 100000 + rnd.nextInt(900000);

        System.out.println();
    }

    public void printTicket(int t, int p, int a) {
        System.out.println("\n_________________________\nTicket\n_________________________\nTrain no: " + t
                + "\nNo of passengers: " + p + "\nAmout: " + a + "\n_________________________");
    }

    public void deleteTicket(int t, int a) {
        System.out.println("\n_________________________\nCancelled ticket\n_________________________\nTrain no: " + t
                + "\nAmout refund: " + a + "\n_________________________");
    }

}