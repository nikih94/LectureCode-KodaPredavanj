package EN.P04;

import java.util.Scanner;

public class Midterm1Task1 {

    //1. Write a program in Java that reads two integers and prints their product.

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert one integer");
        int a = sc.nextInt();
        System.out.println("Please insert one integer");
        int b = sc.nextInt();
        System.out.println("Product of the two integers: "+ a*b);

    }
}
