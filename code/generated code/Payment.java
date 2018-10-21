
import java.util.*;

/**
 * @author Sujay Mahadik
 */
public class Payment {

    public Payment() {
    }

    public static int transactionID;

    public static void makePayment(int amount) {
        Random rnd = new Random();
        transactionID = 1000 + rnd.nextInt(9000);

        System.out.println("\n_________________________\nPayment Successful with:\nTID: " + transactionID + "\nAmount: "
                + amount + "\n_________________________");
    }
}