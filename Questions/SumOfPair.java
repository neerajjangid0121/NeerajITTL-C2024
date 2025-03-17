package Questions;

import java.util.*;
public class SumOfPair {
    static int[] inputArray1 = new int[7];

    public static void main(String[] args) {
        takeInput();
        findPairs();
        displayResult();
    }

    static void takeInput(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Elements of Array1\n");
        for (int i = 0; i < inputArray1.length; i++) {
            System.out.println("Enter "+(i+1)+"th Value");
            int inputNumber = scan.nextInt();
            inputArray1[i] = inputNumber;
        }
    }

    static void findPairs(){
        for (int i = 0; i < inputArray1.length; i++) {
            for (int j = i+1; j < inputArray1.length; j++) {
                if (inputArray1[i]+inputArray1[j]==10) {
                    System.out.println("{"+inputArray1[i]+","+inputArray1[j]+"}");
                    break;
                }
            }
        }
    }

    static void displayResult(){
        System.out.println("First---------");
        for (int i = 0; i < inputArray1.length; i++) {
            System.out.println(inputArray1[i]);
        }
    }
}
