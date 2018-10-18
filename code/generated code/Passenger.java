
import java.util.*;

/**
 * @author Sujay Mahadik
 */
public class Passenger {

    /**
     * Default constructor
     */
    public Passenger() {
    }

    static RailwaySystem sys = new RailwaySystem();
    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String address;

    /**
     * 
     */
    private int age;

    /**
     * 
     */
    private String gender;

    /**
     * 
     */
    public static String searchTrain() {
        // TODO implement here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the train number:");
        int trainNo;
        trainNo = in.nextInt();
        String train;
        train = sys.returnTrain(trainNo);
        return train;
    }

    /**
     * 
     */
    public void bookTicket() {
        // TODO implement here
    }

    /**
     * 
     */
    public void cancelTicket() {
        // TODO implement here
    }

    /**
     * 
     */
    public void payCharges() {
        // TODO implement here
    }

    /**
     * 
     */
    public void modifyProfile() {
        // TODO implement here
    }

    public static void main(String[] args) {

        String train = searchTrain();
        System.out.println(train);
    }
}