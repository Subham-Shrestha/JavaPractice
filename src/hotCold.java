import java.util.Scanner;

public class hotCold {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);

        System.out.println("Enter the number : ");
        Integer number = takeInput.nextInt();
//      Code for clearing the screen.
        for(int i = 0; i <= 1000; i++){
            System.out.println("Guess the number : ");
            Integer guess = takeInput.nextInt();
            if(guess < number){
                System.out.println("Cold");
            }
            else if(guess > number){
                System.out.println("Hot");
            }
            else{
                System.out.println("The guess is correct.");
                break;
            }
        }
    }
}