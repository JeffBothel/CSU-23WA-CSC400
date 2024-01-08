public class main {
    public static void main(String[] args) {
        // Introduction for the program
        System.out.println("CSC400: Data Structures & Algorithms - Module 5 - Critical Thinking Exercise");
        System.out.println("Author: Jeff Bothel\n");

        // Test the FactorialA method
        System.out.println("Testing the FactorialA method...");
        System.out.println("FactorialA(0) = " + Mod5Factorials.FactorialA(0));
        System.out.println("FactorialA(1) = " + Mod5Factorials.FactorialA(1));
        System.out.println("FactorialA(5) = " + Mod5Factorials.FactorialA(5));
        System.out.println("FactorialA(10) = " + Mod5Factorials.FactorialA(10));
        System.out.println("FactorialA(15) = " + Mod5Factorials.FactorialA(15));

        // Test the FactorialB method
        System.out.println("\nTesting the FactorialB method...");
        System.out.println("FactorialB(0) = " + Mod5Factorials.FactorialB(0));
        System.out.println("FactorialB(1) = " + Mod5Factorials.FactorialB(1));
        System.out.println("FactorialB(5) = " + Mod5Factorials.FactorialB(5));
        System.out.println("FactorialB(10) = " + Mod5Factorials.FactorialB(10));
        System.out.println("FactorialB(15) = " + Mod5Factorials.FactorialB(15));

        // Test the ReverseArrayOut method
        System.out.println("\nTesting the ReverseArrayOut method...");
        String[] testArray = {"Apples", "Bananas", "Oranges", "Pears", "Grapes", "Peaches"};
        for(String s : testArray) { System.out.print(s + " "); };
        System.out.println("\n");
        System.out.println(Mod5Arrays.ReverseArrayOut(testArray, 3));
    }
}
