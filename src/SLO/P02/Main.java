package SLO.P02;

public class Main {
    //To-Do

    static void main(String[] args) {

        int stevilo = 14;

        int ostanek = stevilo % 2;

        System.out.println("Stevilo je sodo: " + (ostanek == 0) );
        System.out.println("Stevilo je liho: " + (ostanek == 1));

        //ternarni operator
        System.out.println( "Stevilo je: "+ ( (stevilo % 2 == 0) ? "sodo": "liho")  );

        //blok
        {
            int a = 5;
            System.out.println("spremenljivka a: " + a);
        }
        // pazi na celostevilsko deljenje
        double a = 22/7;
        double b = 22 / 7.0;
        float f = 22 / 7.f;
        System.out.println( a );
        System.out.println(b);
        System.out.println( f );


        // vejitve
        int x = 6;
        if (x > 0) { // true
            System.out.println("Pozitivno število"); // pogoj RESNIČEN
        } else if( x < 0 ) { // negativno
            System.out.println("Negativno število"); // pogoj NE-RESNIČEN
        } else{ // false -- 0
            System.out.println("Stevilo je 0");
        }
        System.out.println("Konec!");


        int ura = 100 ;
        ura %= 24;
        if( (5 < ura) && (ura <= 12)){
            System.out.println("jutro");
        } else if ( 12 < ura && ura < 18) {
            System.out.println("popoldne");
        } else if( ura > 0 && ura <= 5 ) {
            System.out.println("noc");
        }else if(ura < 24){
            System.out.println("vecer");
        }else{
            System.out.println("Neveljaven vnos!!");
        }

        //switch-case
        int dan = 3;

        switch (dan) {
            case 1:  System.out.println("Ponedeljek"); break;
            case 2:  System.out.println("Torek"); break;
            case 3:  System.out.println("Sreda"); break;
            case 4:  System.out.println("Četrtek"); break;
            case 5:  System.out.println("Petek"); break;
            case 6:  System.out.println("Sobota"); break;
            case 7:  System.out.println("Nedelja"); break;
            default:  System.out.println("Neveljaven dan");
        }

        // zanke

        int stevec = 7;
        while (stevec <= 5) {
            System.out.println("Štetje: " + stevec);
            stevec++;
        }

        stevec = 7;
        do {
            System.out.println("Štetje: " + stevec);
            stevec++;
        } while (stevec <= 5);

        for (int i = 1; i <=50 ; i+=2) {
            System.out.println("Steje: " + i);
        }

        int[] array = {1,2,3,1,1,1,4,5,6,7,8,8,8,555,9,100,-300,2,1,42,555,3,8};
        System.out.println(array[0]);
        System.out.println(array[1]);
        //...
        System.out.println(array[array.length-1]);
        //izpis vseh elementov arraya
        System.out.println("index");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(i +" ");
        }
        System.out.println();
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[ i ]+" ");
        }
        System.out.println();
        for (int vrednost : array){
            System.out.print(vrednost+" ");
        }
        System.out.println();

        int[] array2 = {-1,-2,-3,-4,-55};

        //najvecje
        int max = Integer.MIN_VALUE;
        System.out.println(max);
        for (int i = 0; i < array2.length; i++) {
            int el = array2[i];
            if( el > max ){
                max = el;
            }
        }
        System.out.println("Najvecje stevilo je: " + max );

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            int el = array[i];
            if( el < min ){
                min = el;
            }
        }
        System.out.println("Najmanjse stevilo je: " + min );


        //int overflow
        int maxValue = 2_147_483_647; //Integer.MAX_VALUE; // 2,147,483,647
        System.out.println(maxValue);
        int result = maxValue + 1;        // -2,147,483,648 (overflow)
        System.out.println(result);



        long maxValue2 = 2_147_483_647; //Integer.MAX_VALUE; // 2,147,483,647
        System.out.println(maxValue2);
        long result2 = maxValue2 + 1;        // -2,147,483,648 (overflow)
        System.out.println(result2);

        for (long i = 0; true ; i+=1_000_000) {
            System.out.println(i);
        }

    }


}
