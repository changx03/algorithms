import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * Created by gungr on 21/11/2016.
 */
public class LongestAbsoluteFilePath {
    // LeetCode 388. Longest Absolute File Path
    public static int lengthLongestPath(String input) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);  // Layer 0, dummy head
        int maxLen = 0;
        for(String s : input.split("\n")) {
            int layer = s.lastIndexOf("\t") + 1;    // e.g. Layer 2 s: "\t\tsubsubdir1"
            while(layer < stack.size() - 1)
                stack.pop();
            int length = stack.peek() + s.length() - layer + 1; // remove "\t\t..." add "\"
            if(layer == 0)  // dir has no "\t" in the front
                length--;
            if(s.contains("."))
                maxLen = Math.max(maxLen, length);
            else
                stack.push(length);
        }
        return maxLen;
    }

    public static void main(String[] args) {
//        String s = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        String s = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        System.out.println(lengthLongestPath(s));

        String test = "\tsubdir1";
        System.out.println("length = " + test.length());
    }
}
