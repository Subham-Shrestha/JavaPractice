import java.util.Scanner;

public class phonePinCheck {
    public static void main(String[] args) {
        Scanner takePin = new Scanner(System.in);
        int i = 0;

        System.out.println("Enter to set your pin : ");
        Integer pin = takePin.nextInt();
        for(i = 0; i <= 5; i++){
            System.out.println("Enter pin of your phone : ");
            Integer input = takePin.nextInt();
            if (pin != input) {
                System.out.println("Try again");
            } else if (pin == input){
                System.out.println("Your device is unlocked.");
                break;
            }
        }
        if(i < 5){
            System.out.println("Device is locked.");
        }
    }
}