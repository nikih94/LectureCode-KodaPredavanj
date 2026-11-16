package EN.P04;

public class ArraysExamples {


    static void main(String[] args) {

        int[] numbers = {10, 2, 44, 5, 23, 100, 13, 88, 16, 89};
        int target = 1;
        search(numbers,target);
        bubblesort(numbers);

        for (int el : numbers){
            System.out.print(el+" ");
        }
        System.out.println();

        int[] nums = {10, 2, 44, 5, 23, 100, 13, 88, 16, 89};
        insertionSort(nums);
        for (int el : nums){
            System.out.print(el+" ");
        }
        System.out.println();

        // multidimensional arrays
        int[][] matrix = new int[3][3];
        matrix[0][0] = 100;
        matrix[1][1] = 5;
        matrix[2][0] = 2;
        matrix[2][2] = 100;
        //matrix[row][column]
        printMatrix(matrix);

        System.out.println("-----------");
        int[] e = {5,4,3,2,13,4,5,5};
        matrix[2] = e;
        printMatrix(matrix);
        System.out.println("-----------");
        int[][] matrix2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        printMatrix(matrix2);
        System.out.println("-----------");
        printMatrix(matrix);
        bubblesort(matrix[0]);
        insertionSort(matrix[1]);
        bubblesort(matrix[2]);
        System.out.println("-----------");
        printMatrix(matrix);


    }
    public static void printMatrix(int[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void search(int[] a, int target){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                System.out.println(target+ " is contained in the array at index "+ i);
                return;
            }
        }
    }


    public static void bubblesort(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length -i ; j++) {
                if(a[j-1] > a[j]){
                    int tmp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
    public static void insertionSort(int[] a){
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i;
            while(j > 0 && a[j-1] > key ){
                a[j] = a[j-1];
                j--;
            }
            a[j] = key;
        }
    }


}
