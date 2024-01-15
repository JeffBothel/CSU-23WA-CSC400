public class Mod5Factorials {
    public static int FactorialA(int n) {
        if(n == 0) {
            return 1;
        } else {
            return n * FactorialA(n - 1);
        }
    }

    public static int FactorialB(int n) {
        if(n == 0 || n == 1) {
            return 1;
        } else {
            int current = 2;
            return 1 * FactorialB(current, n);
        }
    }

    private static int FactorialB(int n, int original) {
        if(n < original) {
            return n * FactorialB(n + 1, original);
        } else {
            return n;
        }
    }
}
