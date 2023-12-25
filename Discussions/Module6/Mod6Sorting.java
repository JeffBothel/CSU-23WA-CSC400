public class Mod6Sorting {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        InsertionSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void InsertionSort(int[] inArr) {
        boolean swapped = true;
        while(swapped) {
            for (int i = 0; i < (inArr.length - 1); i++) {
                if(inArr[i] > inArr[i + 1]) {
                    int temp = inArr[i];
                    inArr[i] = inArr[i + 1];
                    inArr[i + 1] = temp;
                    continue;
                }
                swapped = false;
            }
        }
    }
}
