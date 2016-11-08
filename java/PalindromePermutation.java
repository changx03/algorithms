import java.util.HashMap;
import java.util.Map;

/**
 * Created by gungr on 9/11/2016.
 */
public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {
        s = s.trim();   // s = s.toLowerCase().replaceAll("[^a-z0-9]", ""); // do you need handle special character, space,and cases?
        Map<Character, Integer> hashMap = new HashMap();
        char[] c = s.toCharArray();
        for(char i : c) {
            if(hashMap.containsKey(i))
                hashMap.remove(i);
            else
                hashMap.put(i, 1);
        }
        int goal = (s.length() % 2 == 0) ? 0 : 1;
        return hashMap.size() <= goal;
    }

    public static void main(String[] argv) {
        PalindromePermutation p = new PalindromePermutation();
        System.out.println(p.canPermutePalindrome("AaBb//a"));
    }
}
