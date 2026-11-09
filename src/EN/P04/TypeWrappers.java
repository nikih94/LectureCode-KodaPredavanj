package EN.P04;

public class TypeWrappers {

    static void main(String[] args) {


        char[] carArray = {'A', '5', 'B', '3', '9', 'Z', '1'};
        int sum = 0;

        for (int i = 0; i < carArray.length; i++) {

            if (Character.isDigit(carArray[i])) {  // check if digit
                sum += Character.getNumericValue( carArray[i]); //convert digit to int
            } else {
                System.out.println(carArray[i] + " is not a digit.");
            }
        }
        System.out.println("Sum of digits: " + sum);

        System.out.println("hello\tbanana");
        System.out.println("hello\nbanana");
        System.out.println("hello\bbanana");
        System.out.println("hellohello\rbanana");
        System.out.println("hello\fbanana");

        System.out.println();

        String input = "TRUE";
        if (Boolean.valueOf(input)) {
            System.out.println("The condition is true.");
        } else {
            System.out.println("The condition is false.");
        }


        Integer iOb = Integer.valueOf(100);
        int i = iOb.intValue();

        System.out.println("Value: "+i);

        //autoboxing
        Integer ioooB = i; // conversion into Integer Object
        int v = ioooB; // conversion from object to primitive type
        System.out.println("value: "+v);
    }
}
