import java.util.Stack;

public class Module6CT {
    public static void main(String[] args) {
        System.out.println("CSU Global - CSC400 - Module 6 Critical Thinking\n");
        String[] testingInputs = {"(a+b)/(c-d)","a/(b-c)*d","a-(b/(c-d)*e+f)^g","(a-b*c)/(d*e^f*g+h)"};
        for (String input : testingInputs) {
            System.out.println("Testing: " + input);
            System.out.println("Result: " + infixToPostfix(input));
            System.out.println();
        }
    }

    public static String infixToPostfix(String infix) {
        String postfix = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            // Character from the string at the current index
            char c = infix.charAt(i);

            // If the character is a letter or digit, add it to the postfix string
            if (Character.isLetterOrDigit(c)) {
                postfix += c;
            }
            
            // If the character is an operator or parenthesis
            else {
                // Switching that takes care of the precedence of the operators
                switch(c) {
                    case '(':
                        stack.push(c);
                        break;
                    case ')':
                        while (!stack.isEmpty() && stack.peek() != '(') {
                            postfix += stack.pop();
                        }
                        stack.pop();
                        break;
                    case '^':
                        while (!stack.isEmpty() && stack.peek() != '(' && stack.peek() != '^') {
                            postfix += stack.pop();
                        }
                        stack.push(c);
                        break;
                    case '*':
                    case '/':
                        while (!stack.isEmpty() && stack.peek() != '(' && stack.peek() != '^' && stack.peek() != '*' && stack.peek() != '/') {
                            postfix += stack.pop();
                        }
                        stack.push(c);
                        break;
                    case '+':
                    case '-':
                        while (!stack.isEmpty() && stack.peek() != '(' && stack.peek() != '^' && stack.peek() != '*' && stack.peek() != '/' && stack.peek() != '+' && stack.peek() != '-') {
                            postfix += stack.pop();
                        }
                        stack.push(c);
                        break;
                }
            }
            
        }
        return postfix;
    }
}