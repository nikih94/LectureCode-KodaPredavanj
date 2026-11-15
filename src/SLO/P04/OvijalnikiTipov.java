package SLO.P04;

public class OvijalnikiTipov {

    static void main(String[] args) {

        char[] carArray = {'A', '5', 'B', '3', '9', 'Z', '1'};
        int sum = 0;

        for (int i = 0; i < carArray.length; i++) {

            if (Character.isDigit(carArray[i])) {  // check if digit
                sum += Character.getNumericValue(carArray[i]); //convert digit to int
            } else {
                System.out.println(carArray[i] + " is not a digit.");
            }
        }
        System.out.println("Sum of digits: " + sum);


        System.out.println("hello\thello");
        System.out.println("hello\nhello");
        System.out.println("hello\bhello");
        System.out.println("hello\rhello");


        Integer iOb = 100; // autobox an int
        int i = iOb; // auto-unbox
        System.out.println(i);

        int[] a = {1,2,3,5,6};
        System.out.println(prvoNegativno(a));
    }

    public static Integer prvoNegativno(int[] a ){
        for (int j = 0; j < a.length; j++) {
            if(a[j]<0){
                return a[j];
            }
        }
        return null;
    }
}
