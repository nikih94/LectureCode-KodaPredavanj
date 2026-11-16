package EN.P04;

public class StingExamples {


    static void main(String[] args) {
        //string literal
        String str = "abc";

        //string empty
        String stra = "";
        String str2 = new String();

        char[] arr = { 'H', 'e','l','l','o'};
        String hello = new String(arr);
        System.out.println(hello);

        String s2 = new String(hello);
        System.out.println(s2);

        // concatenation
        int age = 9;
        String s = "He is " + age + " years old.";
        System.out.println(s + " length of the string: "+ s.length()); // output: He is 9 years old.

        String s3 = "Extra super xXX";
        System.out.println("Number of occurrences of x in the string "+ s3 +" number: "+countX(s3));

        String sa = "Hello";
        String sb = "Hello";
        String sc = new String("Hello");
        System.out.println(sa == sb);
        System.out.println(sa == sc);

        sc = sc.intern();
        System.out.println(sa == sc);

        sb = sb + "x";
        System.out.println(sa);
        System.out.println(sb);
        //compare the actual content
        System.out.println(sa.equals(sc));

        //substring
        System.out.println(s);
        String years = s.substring(8,13);//begin index inclusive, end is exclusive
        System.out.println(years);

        //split a string by words
        String[] words = s.split(" ");
        for (String w : words){
            System.out.println("Word: "+ w);
        }

    }

    public static int countX(String str){
        str = str.toLowerCase();
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'x'){
               c++;
            }
        }
        return c;
    }

}
