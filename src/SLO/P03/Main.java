package SLO.P03;

public class Main {

    static void main(String[] args) {
        Trikotnik ena = new Trikotnik(1,2,3,"modra");
        System.out.println("Obseg: " + ena.obseg());
        // ena.a = 5; private
        Trikotnik dva = new Trikotnik(2,2,9,"rumena");
        System.out.println("Obseg: " + dva.obseg());

        System.out.println("stevilo trikotnikov: "+ Trikotnik.getStTrikotnikov());

    }
}
