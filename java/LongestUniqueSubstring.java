import java.util.HashSet;
import java.util.Set;

/**
 * Created by gungr on 11/11/2016.
 */
public class LongestUniqueSubstring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> lut = new HashSet<>();
        int count = 0, i = 0, j = 0;
        while (i < s.length() && j < s.length()) {
            if(lut.add(s.charAt(j))) {
                j++;
                count = Math.max(count, j - i);
            } else {
                lut.remove(s.charAt(i));
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        LongestUniqueSubstring myClass = new LongestUniqueSubstring();
        System.out.println(myClass.lengthOfLongestSubstring(s));
    }
}
