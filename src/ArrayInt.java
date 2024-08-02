import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInt {
    public static void main(String[] args) {
        int[] integer = new int[3];
        integer[0] = 12;
        integer[1] = 23;
        integer[2] = 34;
        System.out.println(Arrays.toString(integer));

        Scanner takeData = new Scanner(System.in);
        System.out.println("Enter n value : ");
        Integer nValue = takeData.nextInt();
        System.out.println("The n value is " + nValue);
        int [] length = new int[nValue];
        for(int i = 0; i < nValue; i++){
            System.out.println("Enter the length : ");
            length[i] = takeData.nextInt();
        }
        for(int i = 0; i < nValue; i++){
            System.out.println("The value of length is " + length[i]);
        }

        ArrayList <Integer> arrayLisst = new ArrayList<Integer>();
        arrayLisst.add(1);
        arrayLisst.add(2);
        arrayLisst.add(3);
        arrayLisst.add(0,3);
        arrayLisst.remove(2);
        for(Integer variable : arrayLisst){
            System.out.println(variable);
        }
        ArrayList <Integer> oddNum = new ArrayList<Integer>(10);
        oddNum.add(1);
        oddNum.add(2);
        oddNum.add(3);
        oddNum.add(4);
        oddNum.add(5);
        oddNum.add(6);
        oddNum.add(7);
        oddNum.add(8);
        oddNum.add(9);
        oddNum.add(10);
        for(Integer checkOdd : oddNum){
//            if(oddNum % 2 == 0){
                System.out.println("It is even.");
//            }
//            else{
                System.out.println("It is odd.");
//            }
        }
    }
}
//How to remove and replace from array.....