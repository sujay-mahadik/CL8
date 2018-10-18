
enum States {
    WAITING_FOR_LOGIN, LOGGING_IN, VALIDATING, CHECKING_AVAILIBILTY, BOOKING, PAYING_CHARGES, PRINTING
}

class railway {

    private States st = States.WAITING_FOR_LOGIN;

    public void login() {
        if (this.st.equals(st.WAITING_FOR_LOGIN)) {
            System.out.println("Logging in ");
            setState(st.LOGGING_IN);
        }
    }

    public void validate(boolean done) {
        // validate password
        if (this.st.equals(st.LOGGING_IN)) {
            if (done) {
                System.out.println("Password is correct: Logged into ");
                System.out.println("\nDisplaying HomePage\n");
                setState(st.CHECKING_AVAILIBILTY);
            } else {
                System.out.println("\nPassword is incorrect!!\n");
                setState(st.WAITING_FOR_LOGIN);
            }
        } else {
            System.out.println(" Server is down!");
        }

    }

    public void checkTrain(boolean done) {
        // search resto
        if (this.st.equals(st.CHECKING_AVAILIBILTY)) {

            if (done) {
                System.out.println("Showing train");
                setState(st.BOOKING);
                System.out.println("Selecting train....");

            } else {
                System.out.println("no train avaliable!\n");

            }
        } else {
            System.out.println("is not available for search!!");
        }
    }

    public void book(boolean done) {
        if (this.st.equals(st.BOOKING)) {
            if (done) {
                System.out.println("\nBooking train\n");
                setState(st.PAYING_CHARGES);
                System.out.println("\npaying charges\n");
            } else {
                System.out.println("\nCannot book train!");
            }

        } else {
            System.out.println("");
        }
    }

    public void printing(boolean done) {
        // check stock
        if (this.st.equals(st.PRINTING)) {
            if (done) {
                System.out.println("\nprinting ticket\n");

            } else {
                System.out.println("\nlooks like payement failed");

            }

        } else {
            System.out.println();
        }
    }

    public void pay(boolean done) {
        if (this.st.equals(st.PAYING_CHARGES)) {
            if (done) {
                System.out.println("\nProcessing Payment!!\n");
                setState(st.PRINTING);
                System.out.println("\nPayment received!!\n");
            } else {
                System.out.println("\nPayment not received!!");
            }

        } else {
            System.out.println("is not available for processing payment!!");
        }
    }

    public void setState(States state) {
        this.st = state;
    }

    public static void main(String args[]) {
        railway obj1 = new railway();
        obj1.login();
        obj1.validate(true);
        obj1.checkTrain(false);
        obj1.book(true);
        obj1.pay(true);
        obj1.printing(true);

        System.out.println("----------------------------------------------------");

        railway obj2 = new railway();
        obj2.login();
        obj2.validate(true);
        obj2.checkTrain(false);
        obj2.book(true);
        obj2.pay(true);
        obj2.printing(true);

        System.out.println("----------------------------------------------------");

        railway obj3 = new railway();

        obj3.login();
        obj3.validate(true);
        obj3.checkTrain(true);
        obj3.book(true);
        obj3.pay(true);
        obj3.printing(true);
    }

}
