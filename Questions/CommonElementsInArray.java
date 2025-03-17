package Questions;

import java.util.*;
public class CommonElementsInArray {

    static int[] inputArray1 = new int[5];
    static int[] inputArray2 = new int[5];
    static int[] inputArray3 = new int[5];
    static int[] result = new int[5];
    public static void main(String[] args) {
        takeInput();
        findCommon();
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
        System.out.println("Please Enter Elements of Array2\n");
        for (int i = 0; i < inputArray2.length; i++) {
            System.out.println("Enter "+(i+1)+"th Value");
            int inputNumber = scan.nextInt();
            inputArray2[i] = inputNumber;
        }
        System.out.println("Please Enter Elements of Array3\n");
        for (int i = 0; i < inputArray3.length; i++) {
            System.out.println("Enter "+(i+1)+"th Value");
            int inputNumber = scan.nextInt();
            inputArray3[i] = inputNumber;
        }
    }

    static void displayResult(){
        System.out.println("First---------");
        for (int i = 0; i < inputArray1.length; i++) {
            System.out.println(inputArray1[i]);
        }
        System.out.println("Second---------");
        for (int i = 0; i < inputArray2.length; i++) {
            System.out.println(inputArray2[i]);
        }
        System.out.println("Third---------");
        for (int i = 0; i < inputArray3.length; i++) {
            System.out.println(inputArray3[i]);
        }
        System.out.println("Final---------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    static void findCommon(){
        int iterator =0 ;
        for (int i = 0; i < inputArray1.length; i++) {
            if (findInArray2(inputArray1[i])) {
                if (findInArray3(inputArray1[i])) {
                    result[iterator] = inputArray1[i];
                    iterator++;
                }
            }
        }
    }

    static boolean findInArray2(int number){
        for (int i = 0; i < inputArray2.length; i++) {
            if (number==inputArray2[i]) {
                return true;
            }
        }
        return false;
    }

    static boolean findInArray3(int number){
        for (int i = 0; i < inputArray3.length; i++) {
            if (number==inputArray3[i]) {
                return true;
            }
        }
        return false;
    }


}
