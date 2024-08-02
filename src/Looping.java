// WAP to print number from 1 to 100.
// WAP to print even number from 1 to 100.
// WAP to print odd number from 1 to 100.
// WAP to print "Ram" user given time.

import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }

        System.out.println(" ");
        for(int i = 2; i <= 100; i = i +2){
            System.out.println(i);
        }

        System.out.println(" ");
        for(int loop = 1; loop <= 100; loop = loop + 2){
            System.out.println(loop);
        }

        System.out.println(" ");
        System.out.println("Enter number of times to print Ram : ");
        Integer times = takeInput.nextInt();
        for(int loop = 0; loop <= times; loop++){
            System.out.println("Ram");
        }


        int i = 0;
        while(i < 100){
            System.out.println(i);
            i ++;
        }

        int j = 0;
        while(j < 100){
            System.out.println(j);
            j = j + 2;
        }

        int k = 1;
        while(k < 100){
            System.out.println(k);
            i = i +2;
        }

        System.out.println("Enter the number of times to print Ram : ");
        Integer number = takeInput.nextInt();
        int l = 0;
        while(l < number){
            System.out.println("Ram");
            l++;
        }


        for(int iter = 0; iter <= 100; iter++){
            if(iter % 3 == 0 && iter % 5 ==0){
                System.out.println("Fizzbuzz");
            } else if (iter % 3 == 0) {
                System.out.println("Fizz");
            } else if (iter % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(iter);
            }
        }
    }
}