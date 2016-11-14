import java.util.Arrays;
import java.util.Stack;

/**
 * Created by gungr on 15/11/2016.
 */
public class RemoveDuplicateLetters {

    public static String removeDuplicateLetters(String s) {
        int[] lut = new int[26];
        for(char c : s.toCharArray())
            lut[c - 'a']++;
        boolean[] visited = new boolean[26];
//        Arrays.fill(visited, false);  // the default of boolean array is false;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            lut[c - 'a']--;
            if(visited[c - 'a'])
                continue;
            while(!stack.isEmpty() && c < stack.peek() && lut[stack.peek() - 'a'] > 0)
                visited[stack.pop() - 'a'] = false;
            stack.push(c);
            visited[c - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : stack)
            sb.append(c);
        return sb.toString();
    }

    // test which one is faster
    // no different between these two
    public static String removeDuplicateLetters2(String s) {
        int[] lut = new int[26];
        char[] sc = s.toCharArray();
        for(char c : sc)
            lut[c - 'a']++;
        boolean[] visited = new boolean[26];
//        Arrays.fill(visited, false);  // the default of boolean array is false;
        Stack<Character> stack = new Stack<>();
        for(char c : sc) {
            lut[c - 'a']--;
            if(visited[c - 'a'])
                continue;
            while(!stack.isEmpty() && c < stack.peek() && lut[stack.peek() - 'a'] > 0)
                visited[stack.pop() - 'a'] = false;
            stack.push(c);
            visited[c - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : stack)
            sb.append(c);
        return sb.toString();
    }

    public static void main(String[] args) {
//        String s = "cbacdcbc";
        String s = "ahiohvsikdfsdreeeeeeeeegssssssijjjjjjjjjjjfdcccccccnnnnzzzzzeeeedsgosggwsdffdrferertsdfsdfvgbb";

        long t1 = System.currentTimeMillis();
        for(int i= 0; i < 10000; i++) {
            removeDuplicateLetters(s);
        }
        System.out.println(System.currentTimeMillis() - t1);

        long t0 = System.currentTimeMillis();
        for(int i= 0; i < 10000; i++) {
            removeDuplicateLetters2(s);
        }
        System.out.println(System.currentTimeMillis() - t0);



    }
}
