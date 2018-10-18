import java.util.*;

public class sequenceCode {
    Scanner sc = new Scanner(System.in);
    static public String trainNumber;
    static public String sourceEntered;
    static public String destinationEntered;
    static public String nameOfPassenger;

    static public void login() {
        System.out.println("Login Successful");
    }

    static public void createAccount() {
        System.out.println("Entering details......");
        System.out.println("Submitting Details....");
        System.out.println("Validating details....");
        int a = 1;

        if (a == 1) {
            System.out.println("Details Valid!!");
            System.out.println("Account created");
        } else {
            System.out.println("Details are Invalid!!");
            System.out.println("Account not created");
        }

    }

    static public void RequestTicketBookingForm() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter train number");
        trainNumber = sc.nextLine();

        System.out.println("Enter source");
        sourceEntered = sc.nextLine();

        System.out.println("Enter destiantion");
        destinationEntered = sc.nextLine();

        System.out.println("Enter name of the passenger");
        nameOfPassenger = sc.nextLine();

    }

    static public void confirm() {
        System.out.println("Train number: " + trainNumber + "\nSource: " + sourceEntered + "\nDestination: "
                + destinationEntered + "\nName of the Passenger: " + nameOfPassenger);
    }

    static public void payment() {
        System.out.println("Payment successful");
    }

    static public void printTicket() {
        System.out.println("Printing initiated\nPrinted started\nPrinting Done...");
    }

    public static void main(String args[]) {
        int ch = 0;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n\nEnter your choice:");
            System.out.println(
                    "0. Login\n1. Create account\n2. Request Ticket booking form\n3. Confirm\n4. Payment\n5. Print Ticket\n6. Exit");
            ch = in.nextInt();
            switch (ch) {
            case 0:
                login();
                break;
            case 1:
                createAccount();
                break;
            case 2:
                RequestTicketBookingForm();
                break;
            case 3:
                confirm();
                break;
            case 4:
                payment();
                break;
            case 5:
                printTicket();
                break;
            }

        } while (ch < 6);
    }

}