package SLO.P04;

import java.util.Scanner;

public class Kolokvij1Vaja2A {


    //Napišite program v Javi,
    // ki prebere text (vrstico besedila) in izpiše,
    // koliko besed vsebuje črko 's'.

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vpisi text");
        String line = sc.nextLine();

        String[] tokens = line.split(" ");


        int wordCounter = 0;
        for (String word: tokens){
            for (int i = 0; i < word.length(); i++) {
                if(word.charAt(i) == 's'){
                    wordCounter++;
                    break;
                }
            }
        }
        System.out.println("St besed ki ima crko s: " + wordCounter);

    }


}
