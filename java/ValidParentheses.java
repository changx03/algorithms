import java.util.Stack;

/**
 * Created by Luke Chang on 13/12/2016.
 */
public class ValidParentheses {

    /**
     * LeetCode 20. Valid Parentheses.
     * @param s Containing only "()", "{}" and "[]"
     * @return "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
     */
    public boolean isValid(String s) {
        // LIFO last in first out approach
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                default:
                    if(stack.isEmpty() || stack.pop() != c)
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "()[]{}";
        String test2 = "([)]";
        String test3 = "{";
        String test4 = "{()[()]}";
        String test5 = "]";

        ValidParentheses myClass = new ValidParentheses();
        System.out.println(test1 + ": " + myClass.isValid(test1));
        System.out.println(test2 + ": " + myClass.isValid(test2));
        System.out.println(test3 + ": " + myClass.isValid(test3));
        System.out.println(test4 + ": " + myClass.isValid(test4));
        System.out.println(test5 + ": " + myClass.isValid(test5));
    }
}
