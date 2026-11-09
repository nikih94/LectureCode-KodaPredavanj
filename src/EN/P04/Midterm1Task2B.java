package EN.P04;

import java.util.Locale;
import java.util.Scanner;

public class Midterm1Task2B {

    //Write a program in Java that reads a line of text
    // and prints how many words contain the letter 's'.

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text");
        String line = sc.nextLine();

        System.out.println("Text read: " +line);
        String[] tokens = line.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
        int countWords = 0;
        for (String word: tokens){
            word = word.toLowerCase();
            for (int i = 0; i < word.length(); i++) {
                if( word.charAt(i) =='s'){
                    countWords++;
                    break;
                }
            }
        }
        System.out.println("Number of words containing s: "+countWords);

    }

}
