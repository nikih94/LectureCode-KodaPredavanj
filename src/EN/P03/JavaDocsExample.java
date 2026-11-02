package EN.P03;

public class JavaDocsExample {

    static void main(String[] args) {
        int x = 1000034;
        System.out.println(clamp(x,0,10000000));
        System.out.println(clamp(x,0,10000));
    }

    /*
     * Desc: Restricts an integer to the interval [min, max].
     *
     * Params:
     *   value - number to restrict [in]
     *   min   - lower bound [in]
     *   max   - upper bound [in]
     *
     * Pre: min <= max
     *
     * Post: min <= RESULT && RESULT <= max
     *
     * Result:
     *   min   if value < min
     *   max   if value > max
     *   value otherwise
     *
     * Env: No external state is modified.
     */
    public static int clampContract(int value, int min, int max) {
        if (value < min) return min;
        if (value > max) return max;
        return value;
    }

    /**
     * Restricts an integer to the interval [min, max].
     *
     * Requires {@code min <= max}.
     * The result is always within the specified interval.
     * This method does not modify external state.
     *
     * @param value the number to restrict
     * @param min the lower bound
     * @param max the upper bound
     * @return min if value < min, max if value > max,
     *         otherwise value
     */
    public static int clamp(int value, int min, int max) {
        if (value < min) return min;
        if (value > max) return max;
        return value;
    }

}
