package EN.P03;

public class GCexample {

    static int[] last;
    public static void main(String[] args) throws InterruptedException {
        boolean allocate = false; // true = create, false = reuse
        long start = System.currentTimeMillis();
        int[] reusable = new int[1_000_000]; // each array is appx. 4MB
        for (int i = 0; i < 1500; i++) {
            int[] data;
            if (allocate) {
                data = new int[1_000_000];
            } else {
                data = reusable;
            }
            data[0] = i;
            last = data;
            Thread.sleep(10);
        }
        long end = System.currentTimeMillis();
        System.out.println("Execution time: " + (end - start) + " ms");
    }
}