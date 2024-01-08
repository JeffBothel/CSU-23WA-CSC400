public class SortingTesting {
    public static boolean SortAscTesting(int[] arr) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i+1] < arr[i]) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }
}
