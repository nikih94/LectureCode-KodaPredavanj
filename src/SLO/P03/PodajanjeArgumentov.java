package SLO.P03;

public class PodajanjeArgumentov {


    static void main(String[] args) {
        //prenos po vrednosti - copiramo vrednost v parameter metode
        int x = 12;
        incPrint(x);
        System.out.println(x);

        // prenos po referenci-- se kopira referenca na predmet
        int[] a = {0,1,2,3};
        incPrintArray(a);
        for (int e : a){
            System.out.print(e+ " ");
        }
    }
    public static void incPrint(int x){
        x++;
        System.out.println(x);
    }
    public static void incPrintArray(int[] a){
        a[0] = 1000;
        System.out.println(a[0]);
    }
}
