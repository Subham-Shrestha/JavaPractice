//import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        Scanner takeInput = new Scanner(System.in);
//
//        int num1 = 3;
////        System.out.println("Enter a number : ");
////        num1 = takeInput.nextInt();
//        if (num1 % 2 == 0){
//            System.out.println("The number is even.");
//        }
//        else {
//            System.out.println("The number is odd.");
//        }
//
//        int age = 12;
////        System.out.println("Enter the age : ");
////        age = takeInput.nextInt();
//        if (age > 18){
//            System.out.println("You are allowed to vote.");
//        }
//        else{
//            System.out.println("You are not allowed to vote.");
//        }

//        int num = 12;
//        if (num % 3 == 0 && num % 5 == 0){
//            System.out.println("FizzBuzz");
//        } else if (num % 3 == 0) {
//            System.out.println("Fizz");
//        } else if (num % 5 == 0) {
//            System.out.println("Buzz");
//        } else{
//            System.out.println(num);
//        }

        int note = 5978, div;
            if(note >= 1000){
                div = note / 1000;
                System.out.println("1000" + " X " + div);
                note = note % 1000;
            }
            if(note >= 500 && note <1000){
                div = note / 500;
                System.out.println("500" + " X " + div);
                note = note % 500;
            }
            if(note >= 100 && note < 500){
                div = note / 100;
                System.out.println("100" + " X " + div);
                note = note % 100;
            }
            if(note >= 50 && note < 100){
                div = note / 50;
                System.out.println("50" + " X " + div);
                note = note % 50;
            }
            if(note >= 20 && note < 50){
                div = note / 20;
                System.out.println("20" + " X " + div);
                note = note % 20;
            }
            if(note >= 10 && note < 20){
                div = note / 10;
                System.out.println("10" + " X " + div);
                note = note % 10;
            }
            if(note >= 5 && note < 10){
                div = note / 5;
                System.out.println("5" + " X " + div);
                note = note % 5;
            }
            if(note >=1 && note <5){
                div = note / 1;
                System.out.println("1" + " X " + div);
            }

        }
    }