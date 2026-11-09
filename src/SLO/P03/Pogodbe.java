package SLO.P03;

public class Pogodbe {

    /*
     * Desc: Omeji celo število na interval [min, max].
     * Params:
     *   value - število, ki ga omejimo [in]
     *   min   - spodnja meja [in]
     *   max   - zgornja meja [in]
     * Pre: min <= max
     * Post: min <= RESULT && RESULT <= max
     * Result:
     *   min   če je value < min
     *   max   če je value > max
     *   value sicer
     *
     * Env: Zunanje stanje se ne spremeni.
     */
    public static int clamp(int value, int min, int max) {
        if (value < min) return min;
        if (value > max) return max;
        return value;
    }

    /**
     * Omeji celo število na interval [min, max].
     *
     * Zahteva {@code min <= max}.
     * Rezultat je vedno znotraj podanega intervala.
     * Metoda ne spreminja zunanjega stanja.
     *
     * @param value število, ki ga omejimo
     * @param min spodnja meja
     * @param max zgornja meja
     * @return min, če je value < min, max, če je value > max,
     *         sicer value
     */
    public static int clampJavaDoc(int value, int min, int max) {
        if (value < min) return min;
        if (value > max) return max;
        return value;
    }

}
