package SLO.P03;

import EN.P03.Triangle;

public class Trikotnik {

    private int a, b, c;
    private final String barva;

    //metoda instance, ki sprejme trikotnik in vrne vecjega po obsegu
    public Trikotnik vecjiObseg(Trikotnik drugi){
        if(drugi.obseg() > this.obseg()){
            return drugi;
        }
        return this;
    }
    //kloniraj predmet
    public Trikotnik clone(){
        return new Trikotnik(this.a,this.b,this.c,this.barva);
    }

    public boolean enak(Trikotnik drugi){
        if(this.a != drugi.a) return false;
        if(this.b != drugi.b) return false;
        if(this.c != drugi.c) return false;
        return true;
    }


    //getter
    public int getA(){
        return a;
    }
    //setter
    public void setA(int a){
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public String getBarva() {
        return barva;
    }

    private static int stTrikotnikov = 0; // static stevec ki steje koliko trik smo ustvarili

    public static int getStTrikotnikov(){
        return stTrikotnikov;
    }

    public int obseg(){
        return a + b + c;
    }

    public static int obsegTrik(int a, int b, int c){
        return a + b + c;
    }

    Trikotnik(){
        stTrikotnikov++;
        System.out.println("Ustvarjam trikotnik!");
        a=5;
        b=6;
        c=7;
        barva = "rdeca";
    }

    //parametriziran konstruktor
    Trikotnik(int a, int strB, int strC){
        stTrikotnikov++;
        this.a = a;
        b = strB;
        c = strC;
        barva = "rumena";
    }

    Trikotnik(int a, int b,int c, String barva){
        stTrikotnikov++;
        this.a = a;
        this.b = b;
        this.c = c;
        this.barva = barva;
    }

    static void main() {
        Trikotnik tri = new Trikotnik();
        //tri.barva = "zelena"; ne smemo spremenit, ker barva je final
        System.out.println("barva: " +tri.barva);
        System.out.println("a: "+ tri.a);
        tri.b =5 ;
        System.out.println("b: "+tri.b);

        Trikotnik dva = new Trikotnik();
        System.out.println(dva.barva);
        System.out.println(dva.b);

        System.out.println("stevilo trikotnikov: "+ stTrikotnikov);
        Trikotnik novi = new Trikotnik(10,3,6);
        System.out.println("a: " +novi.a);
        System.out.println("c: "+ novi.c);
        System.out.println("parametriziran konstruktor, ki uporablja this");
        System.out.println("Obseg: "+ novi.obseg());

        Trikotnik peti = new Trikotnik(1,2,3,"bela");
        System.out.println("a: " +peti.a);
        System.out.println("c: "+ peti.c);
        System.out.println("barva: "+ peti.barva);
        System.out.println("Obseg: "+ peti.obseg());

        System.out.println("stevilo trikotnikov: "+ stTrikotnikov);

        peti.obseg(); // pripada instanci razreda
        obsegTrik(1,2,3); // pripada razredu

        //peti.barva = "modra"; final!!
    }

}
