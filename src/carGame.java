import java.util.Scanner;

public class carGame {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        boolean carStarted = false;

        while (true) {
            System.out.println("Enter a Command (start, stop, quit): ");
            String command = takeInput.nextLine().toLowerCase();

            if (command.equals("start")) {
                if (carStarted) {
                    System.out.println("Car is started.");
                } else {
                    carStarted = true;
                    System.out.println("Car is already started!");
                }
            } else if (command.equals("stop")) {
                if (carStarted) {
                    carStarted = false;
                    System.out.println("Car has stopped.");
                } else {
                    System.out.println("Car is already stopped.");
                }
            } else if (command.equals("quit")) {
                System.out.println("Thank you for using the car!");
                break;
            } else {
                System.out.println("Invalid Command.");
            }

            if (command.equals("quit")) {
                break;
            }
        }

    }
}