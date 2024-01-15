public class SortingTesting {
    public static boolean SortAscTesting(int[] arr) {
        // Running through all the array elements to see if they are sorted
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            
            // Testing to find issues with the sorting of the array items
            if (arr[i+1] < arr[i]) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public static boolean SortAscTestingB(int[] arr) {
        switch(arr.length) {
            case 0:
            case 1:
                return true;
            case 2:
                return arr[0] <= arr[1];
            default:
                return SortAscTestingB(arr, arr.length-1);
        }
    }

    private static boolean SortAscTestingB(int[] arr, int position) {
        if(arr[position-1] > arr[position]) {
            return false;
        }
        if(position == 1 && (arr[position-1] <= arr[position])) {
            return true;
        }
        else {
            return SortAscTestingB(arr, position-1);
        }
    }
}
