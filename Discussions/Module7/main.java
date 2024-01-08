public class main {
    public static void MergeSort(int[] arr) {
        if(arr.length <= 4) {
            while(i < (arr.length-1)) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        if(arr.length >= 8) {
            if(arr.length % 2 == 0) {
                int[] left = new int[arr.length / 2];
                int[] right = new int[arr.length / 2];
                for(int i = 0; i < arr.length / 2; i++) {
                    left[i] = arr[i];
                }
                for(int i = arr.length / 2; i < arr.length; i++) {
                    right[i] = arr[i];
                }
                MergeSort(left);
                MergeSort(right);
            }
            else {
                int[] left = new int[arr.length / 2];
                int[] right = new int[arr.length - left.length];
                for(int i = 0; i < arr.length / 2; i++) {
                    left[i] = arr[i];
                }
                for(int i = arr.length / 2; i < arr.length; i++) {
                    right[i] = arr[i];
                }
                MergeSort(left);
                MergeSort(right);
            }
            for(int i = 0; i < left.length; i++) {
                arr[i] = left[i];
            }
            for(int i = (left.length + 1); i < right.length; i++) {
                arr[i] = right[i];
            }
            int i = 0;
            while(i < (arr.length-1)) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
