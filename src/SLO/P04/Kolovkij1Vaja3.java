package SLO.P04;

import java.util.Scanner;

public class Kolovkij1Vaja3 {

    //3. Napišite program v Javi, ki prebere polje celih števil.
    // Program naj:
    //
    //Izpiše vsa soda števila v polju.
    //Prešteje in izpiše število negativnih števil v polju.
    //Izračuna in izpiše produkt vseh števil na lihih indeksih v polju.

    static void main(String[] args) {
        alternativaBranjePolja();
        Scanner sc = new Scanner(System.in);
        System.out.println("Povej mi koliko stevil bos vnesel");
        int n = sc.nextInt();
        int[] polje = new int[n];

        for (int i = 0; i < n; i++) {
            polje[i] = sc.nextInt();
        }

        for (int st : polje){
            System.out.print(st+ " ");
        }
        System.out.println();

        System.out.println("soda stevila:");
        for (int st : polje){
            if(st % 2 == 0) {
                System.out.print(st + " ");
            }
        }
        System.out.println();
        int stNeg = 0;
        for (int i = 0; i < polje.length; i++) {
            if(polje[i] < 0){
                stNeg++;
            }
        }
        System.out.println("St negativnih: "+stNeg);
        int produkt = 1;
        for (int i = 0; i < polje.length; i++) {
            if(i % 2 == 1){
                produkt*=polje[i];
            }
        }
        System.out.println("Produkt: "+produkt);
        produkt =1;
        for (int i = 1; i < polje.length; i+=2) { // varianta
            produkt*=polje[i];
        }
        System.out.println("Produkt: "+produkt);

    }

    public static void alternativaBranjePolja(){
        System.out.println("Vnesi poljubno celih stevil " +
                "v eni vrstici, stevila naj bodo delimitirana s presledkom");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(line);

        String[] tokens = line.split(" ");
        int[] polje = new int[tokens.length];

        for (int i = 0; i < polje.length; i++) {
            polje[i] = Integer.parseInt(tokens[i]); // pretvori string v int
        }

        System.out.println("vnesena stevila");
        for (int num: polje) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
