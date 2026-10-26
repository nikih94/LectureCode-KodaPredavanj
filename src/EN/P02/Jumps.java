package EN.P02;

public class Jumps {

    public static void main(String[] args) {
        int[] array = {32, 87, 3, 589, 12, 1076, 2000, 12, 622, 127};
        int target = 12;
        boolean found = false;

        for (int index = 0; index < array.length; index++) {
            if (array[index] == target) {
                array[index] = 0;
                //break;
                continue;
            }
            System.out.println(array[index] + " not matching target: " + target );
        }
        for(int num : array){
            System.out.print(num+" ");
        }
        int area = calcArea(5,7);
        System.out.println();
        System.out.println("Rectangle area: " + area);
        System.out.println("Rectangle area: " + calcArea(3,4));
        System.out.println("Rectangle area: " + calcArea(5,5));
    }

    public static int calcArea(int width, int height){
        int area;
        area= width * height;
        return area;
    }

}
