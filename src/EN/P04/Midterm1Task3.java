package EN.P04;

import java.util.Scanner;

public class Midterm1Task3 {

    //Write a program in Java that reads an array of integers. The program should:

    //Print all even numbers in the array.
    //Count and print the number of negative numbers in the array.
    //Compute and print the product of all numbers at odd indexes in the array.

    static void main() {
       // System.out.println("Enter the number of integers that yhou want to input");
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //int[] a = new int[n];
        //for (int i = 0; i < n; i++) {
        //    System.out.println("Enter the "+i+"th integer");
        //    a[i] = sc.nextInt();
        //}
        System.out.println("Enter integers delimited by space");
        String line = sc.nextLine();
        String[] tokens = line.split(" ");
        int[] a = new int[tokens.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(tokens[i]);
        }

        for (int num : a){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("all even numbers in the array");
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0){
                System.out.print(a[i]+ " ");
            }
        }
        System.out.println();
        int countOfNegatives = 0;
        for (int el:a){
            if(el<0){
                countOfNegatives++;
            }
        }
        System.out.println("Count of negative numbers: "+countOfNegatives);

        int product = 1;
        for (int i = 0; i < a.length; i++) {
            if(i % 2 == 1){
                product*=a[i];
            }
        }
        System.out.println("Product of numbers at odd indexes: "+product );
        product =1;
        for (int i = 1; i < a.length; i+=2) {
            product*=a[i];
        }
        System.out.println("Product of numbers at odd indexes: "+product );

    }


}
