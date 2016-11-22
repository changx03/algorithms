import java.util.HashSet;
import java.util.Set;

/**
 * Created by gungr on 22/11/2016.
 */
public class WordBreak {

    // LeetCode 139 Word Break
    // s = s = "leetcode", dict = ["leet", "code"]. It may contain more than 2 words
    public static boolean wordBreak(String s, Set<String> wordDict) {
        boolean[] f = new boolean[s.length() + 1];
        f[0] = true;
        for (int end = 1; end <= s.length(); end++) {
            for (int start = 0; start < end; start++) {
                String t = s.substring(start, end);
                if (f[start] && wordDict.contains(t)) {
                    f[end] = true;
                    break;
                }
            }
        }
        return f[s.length()];
    }

    public static void main(String[] args) {
        Set<String> wordDict = new HashSet<>();
//        wordDict.add("leet");
//        wordDict.add("code");
//        String s = "leetcode";

//        wordDict.add("a");
//        String s = "a";

//        wordDict.add("a");
//        wordDict.add("abc");
//        wordDict.add("b");
//        wordDict.add("cd");
//        String s = "abcd";

        wordDict.add("aaaa");
        wordDict.add("aa");
        String s = "aaaaaaa";
        System.out.println(wordBreak(s, wordDict));
    }
}
