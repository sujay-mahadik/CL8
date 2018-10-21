import java.util.*;

/**
 * @author Sujay Mahadik
 */
public class Passenger {

    public Passenger() {
    }

    static RailwaySystem sys = new RailwaySystem();
    static Ticket ticket = new Ticket();
    static Payment payment = new Payment();

    private String name;

    private String address;

    private int age;

    private String gender;

    public static int trainNo;
    public static int noOfPassengers;
    public static int amount;

    public static boolean paymentDone;

    public static String searchTrain() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the train number:");
        trainNo = in.nextInt();
        String train;
        train = sys.returnTrain(trainNo);
        return train;
    }

    public static void bookTicket() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of passengers");
        noOfPassengers = in.nextInt();

        Random rnd = new Random();
        int amountSingle = 100 + rnd.nextInt(900);
        paymentDone = false;
        amount = amountSingle * noOfPassengers;
        System.out.println("\nTrain: " + trainNo + "\nNo of Passengers: " + noOfPassengers + "\nAmount of Ticket: "
                + amountSingle + "\nTotal Amount: " + amount);
        System.out.println("\nConfirm ( y / n )");
        String ch;
        ch = in.next();
        if (ch.equals("y")) {
            payment.makePayment(amount);
            paymentDone = true;
        } else {
            System.out.println("Exit");
        }

    }

    public static void cancelTicket() {
        if (paymentDone == true) {
            ticket.deleteTicket(trainNo, amount);
        } else {
            System.out.println("\nTicket not booked");
        }
    }

    /**
     * 
     */
    public static void printTicket() {
        if (paymentDone == true) {
            ticket.printTicket(trainNo, noOfPassengers, amount);
        } else {
            System.out.println("\nPayment incomplete");
        }
    }

    /**
     * 
     */
    public void modifyProfile() {
        // TODO implement here
    }

    public static void main(String[] args) {

        int ch = 0;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n\nEnter your choice:");
            System.out.println("0. Search Train\n1. Book ticket\n2. Print Ticket\n3. Cancel Ticket\n4. Exit");
            ch = in.nextInt();
            switch (ch) {
            case 0:
                String train = searchTrain();
                System.out.println(train);
                break;
            case 1:
                bookTicket();
                break;
            case 2:
                printTicket();
                break;
            case 3:
                cancelTicket();
                break;
            }

        } while (ch < 4);
    }
}