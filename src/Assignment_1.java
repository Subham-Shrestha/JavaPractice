import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);

        System.out.println("Enter the text you want to print : ");
        String wordInput = takeInput.nextLine();
        System.out.println(wordInput);

        System.out.println("Enter first number : ");
        Integer number1 = takeInput.nextInt();
        System.out.println("Enter second number : ");
        Integer number2 = takeInput.nextInt();
        int sum = number1 + number2;
        System.out.println("The sum of the numbers is : " + sum);

        float principle, rate, time;
        System.out.println("Enter principle : ");
        principle = takeInput.nextFloat();
        System.out.println("Enter rate : ");
        rate = takeInput.nextFloat();
        System.out.println("Enter time : ");
        time = takeInput.nextFloat();
        double SI = (principle * rate * time)/100;
        System.out.println("The simple interest is : " + SI);

        System.out.println("Enter length of rectangle : ");
        Integer length = takeInput.nextInt();
        System.out.println("Enter breadth of rectangle : ");
        Integer breadth = takeInput.nextInt();
        float area = length * breadth;
        System.out.println("The area of the rectangle is  : " + area);

    }
}