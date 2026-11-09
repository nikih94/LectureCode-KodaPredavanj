package EN.P04;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Midterm1Task2 {

    //2. Write a program in Java that reads a positive integer and prints
    // the sum of all positive integers divisible by 5
    // that are less than or equal to the given number.

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pls enter a positive integer: ");
        int n = sc.nextInt();
        alternativeSolution(n);
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 5 == 0){
                sum+=i;
            }
        }
        System.out.println("Result: "+ sum);
    }

    public static void alternativeSolution(int n){
        int a = n/5;
        System.out.println("Alternative result: " + 5*(a*(a+1)/2));
    }

}
