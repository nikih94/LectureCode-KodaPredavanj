package SLO.P03;

public class Main {

    static void main(String[] args) {
        Trikotnik ena = new Trikotnik(1,2,3,"modra");
        System.out.println("Obseg: " + ena.obseg());
        // ena.a = 5; private
        Trikotnik dva = new Trikotnik(2,2,9,"rumena");
        System.out.println("Obseg: " + dva.obseg());

        System.out.println("stevilo trikotnikov: "+ Trikotnik.getStTrikotnikov());

        //getters & setters
        // System.out.println("Stranica a trik dva: "+ dva.a); a je private
        System.out.println("Stranica a trik dva: "+ dva.getA());
        //dva.a = 5;
        dva.setA(5);
        System.out.println("Stranica a trik dva: "+ dva.getA());

        Trikotnik vecji = ena.vecjiObseg(dva);
        System.out.println(vecji.getBarva());
        System.out.println(vecji.getA());
        dva.setA(100);
        System.out.println(vecji.getA());
        Trikotnik treti = dva.clone();
        System.out.println(treti.getBarva());
        System.out.println(treti.getA());

        //premerjali reference
        System.out.println(dva == vecji);
        System.out.println(ena == dva);
        System.out.println(dva == treti);

        //enakost stanja predmeta
        System.out.println(dva.enak(vecji));
        System.out.println(ena.enak(dva));
        System.out.println(dva.enak(treti));




    }
}
