package EN.P03;

public class ArgumentPassing {

    static void main() {
        System.out.println("call by value");
        int x = 12;
        incPrint(x);
        System.out.println(x);

        System.out.println("Call by reference");
        int[] arr = {0,1,2};
        incPrintArr(arr);
        System.out.println(arr[0]);
    }

    public static void incPrintArr(int[] arr){
        arr[0] = 100;
        System.out.println(arr[0]);
    }

    public static void incPrint(int x){
        ++x;
        System.out.println(x);
    }

}
