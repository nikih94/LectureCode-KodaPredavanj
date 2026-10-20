package EN.P02;

public class Main {

    static void main(String[] args) {
        int a = 22/7;
        System.out.println(a);

        {
            double c = a / 7;
            System.out.println(c);
        }

        double c = 22 / 7.0;
        System.out.println(c);

        int x = 3;

        if (x > 0) {
            System.out.println("Positive number"); // condition TRUE
            x *= 5;
        } else {
            System.out.println("Non-positive number"); // condition FALSE
            x += 5;
        }
        System.out.println(x);

        int hour = 40 % 24;
        if(6<= hour && hour <= 12){
            System.out.println("morning");
        } else if ( 12 < hour && hour < 20) {
            System.out.println("afternoon");
        }else if(20<= hour && hour <= 24){
            System.out.println("evening");
        } else {
            System.out.println("Night");
        }

        int day = ( 66 % 7 ) + 1;

        switch (day) {
            case 1:  System.out.println("Monday"); break;
            case 2:  System.out.println("Tuesday"); break;
            case 3:  System.out.println("Wednesday"); break;
            case 4:  System.out.println("Thursday"); break;
            case 5:  System.out.println("Friday"); break;
            case 6:  System.out.println("Saturday"); break;
            case 7:  System.out.println("Sunday"); break;
            default:  System.out.println("Invalid day");
        }

        int[] array = new int[5];
        System.out.println(array[1]);

        array[0] = 2;
        array[1] = 4;
        array[2] = 8;
        array[3] = 10;
        array[4] = 12;

        System.out.println(array[3]);
        array[2] = 100;
        System.out.println(array[2]);

        System.out.println("Lenght of the array " + array.length );

        System.out.println("Looops----------------------");
        int counter = 10;
        while (counter <= 5) {
            System.out.println("Counting: " + counter++);
        }

        counter = 10;
        do {
            System.out.println("Counting: " + counter++);
        } while (counter <= 5);

        int i = 0;
        int max = array[0];
        while( i < array.length ){
            if(array[i] > max){
                max = array[i];
            }
            i++;
        }
        System.out.println("Largest value in the array is: "+max);

        System.out.println("foor loop");
        for (int j = 1; j < 11; j++) {
            System.out.println("Counted to: " + j);
        }

        array[1]=-100;
        int min = array[0];
        for(int z = 0; z < array.length ; z++){
            if(array[z] < min){
               min = array[z];
            }
        }
        System.out.println("Smallest value: "+min);

        int[] largeA = new int[1000];
        for (int j = 0; j < 1000; j++) {
            largeA[j] = j;
        }

        for (int num : largeA){
            System.out.print(num+ " ");
        }
        System.out.println();
        for (int j = 0; j < largeA.length ; j += 10) {
            System.out.print(largeA[j]+ " ");
        }

        long res = 0;
        while(true){
            res += 1000;
            System.out.println(res);
        }


    }

}
