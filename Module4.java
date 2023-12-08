import java.util.Stack;

public class Module4 {
    public static void main(String[] args) {
        Stack<String> simpleStack = new Stack<String>();
        simpleStack.push("First");
        simpleStack.push("Second");
        simpleStack.push("Third");
        simpleStack.push("Fourth");
        simpleStack.push("Fifth");

        System.out.println("Example stack operations");
        System.out.println("Initial Setup");
        System.out.println("Stack: " + simpleStack);
        System.out.println("Size: " + simpleStack.size() + "\n");

        simpleStack.pop();
        System.out.println("When pop() is called");
        System.out.println("Stack: " + simpleStack);
        System.out.println("Size: " + simpleStack.size() + "\n");

        simpleStack.push("Sixth");
        System.out.println("When push() is called");
        System.out.println("Stack: " + simpleStack);
        System.out.println("Size: " + simpleStack.size() + "\n");
    }
}
