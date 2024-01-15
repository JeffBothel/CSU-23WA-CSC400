import java.util.Arrays;

public class UnitTest {
    public static void main(String[] args) {
        System.out.println("\n\nCSU Global - CSC400: Data Structures & Algorithms - Module 6 - Critical Thinking");
        System.out.println("################################################################################\n");

        // Testing array definition
        int[] arr = { 0, -20, 19, 2, -13, 35, -5, 7, -9, 10, -23, 28, -10, 11, -12, 13, -15, 17, -18, 20, -21, 22, -24, 25, -26, 27, -29, 30, -31, 32, -33, 34, -35, 36, -37, 38, -39, 40, -41, 42, -43, 44, -45, 46, -47, 48, -49, 50, -51, 52, -53, 54, -55, 56, -57, 58, -59, 60, -61, 62, -63, 64, -65, 66, -67, 68, -69, 70, -71, 72, -73, 74, -75, 76, -77, 78, -79, 80, -81, 82, -83, 84, -85, 86, -87, 88, -89, 90, -91, 92, -93, 94, -95, 96, -97, 98, -99, 100 };
        int[] arrB = { 0, -20, 19, 2, -13, 35, -5, 7, -9, 10, -23, 28, -10, 11, -12, 13, -15, 17, -18, 20, -21, 22, -24, 25, -26, 27, -29, 30, -31, 32, -33, 34, -35, 36, -37, 38, -39, 40, -41, 42, -43, 44, -45, 46, -47, 48, -49, 50, -51, 52, -53, 54, -55, 56, -57, 58, -59, 60, -61, 62, -63, 64, -65, 66, -67, 68, -69, 70, -71, 72, -73, 74, -75, 76, -77, 78, -79, 80, -81, 82, -83, 84, -85, 86, -87, 88, -89, 90, -91, 92, -93, 94, -95, 96, -97, 98, -99, 100 };
        
        // Displaying the array for the user to see when running the unit test
        System.out.println("The array has the count of " + arr.length + " is the following:");
        String outString = "";
        for (int i = 0; i < arr.length; i++) {
            outString += arr[i] + ", ";
        }
        System.out.println(outString + "\n");

        // Testing the SortAscTesting method
        System.out.println("Testing the SortAscTesting method...");
        System.out.println("The array == sorted: false ");
        System.out.println("The array is sorted: " + SortingTesting.SortAscTesting(arr) + "\n");

        // Sorting the array values
        Arrays.sort(arr);
        System.out.println("The array == sorted: true");
        System.out.println("The array is sorted: " + SortingTesting.SortAscTesting(arr) + "\n");
    
        // Displaying the array for the user to see when running the unit test
        System.out.println("The array has the count of " + arrB.length + " is the following:");
        outString = "";
        for (int i = 0; i < arr.length; i++) {
            outString += arrB[i] + ", ";
        }
        System.out.println(outString + "\n");

        // Testing the SortAscTestingB method
        System.out.println("Testing the SortAscTesting method...");
        System.out.println("The array == sorted: false ");
        System.out.println("The array is sorted: " + SortingTesting.SortAscTestingB(arrB) + "\n");

        // Sorting the array values
        Arrays.sort(arrB);
        System.out.println("The array == sorted: true");
        System.out.println("The array is sorted: " + SortingTesting.SortAscTestingB(arrB) + "\n");
    }
}
