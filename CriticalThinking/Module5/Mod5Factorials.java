public class Mod5Factorials {
    public static int FactorialA(int n) {
        if(n == 0) {
            return 1;
        } else {
            return n * FactorialA(n - 1);
        }
    }

    public static int FactorialB(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
