public class Mod5Arrays {
    public static String ReverseArrayOut(String[] array, int count) {
        String result = "";

        if(count == 1) {
            result += array[array.length - 1];
        } else {
            result += ReverseArrayOut(array, count - 1) + "\n" + array[array.length - count];
        }
        return result;
    }
}
