package SLO.P04;

import java.util.Scanner;

public class Kolokvij1Vaja2 {

    //2. Napišite program v Javi, ki prebere pozitivno celo število
    // in izpiše vsoto vseh pozitivnih celih števil,
    // ki so deljiva s 5 in so manjša ali enaka podanemu številu.

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vnesi pozitivno celo stevilo: ");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            if( i % 5 == 0 ){
                sum+=i;
            }
        }
        System.out.println("Vsota stevil deljivih s 5: " + sum);

        int n = a / 5;
        System.out.println("Vsota stevil: "+ 5*(n*(n+1)/2));


    }
}
