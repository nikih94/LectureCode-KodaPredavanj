package SLO.P04;

import java.util.Scanner;

public class KolokvijVaja1 {


    //1. Napišite program v Javi, ki prebere dve celi števili in izpiše njun produkt.

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vnesi prvo stevilo:");
        int a = sc.nextInt();
        System.out.println("Vnesi drugo stevilo:");
        int b = sc.nextInt();
        System.out.println("Produkt: " + a * b);
    }
}
