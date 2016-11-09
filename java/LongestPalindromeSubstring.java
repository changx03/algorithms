/**
 * Created by gungr on 10/11/2016.
 */
public class LongestPalindromeSubstring {

	// LeetCode 5 
    public static String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++) {
            int even = expandFromCentre(s, i, i+1);
            int odd = expandFromCentre(s, i, i);
            int len = Math.max(even, odd);
            if(len > end - start) {
                start = i - (len-1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandFromCentre(String s, int left, int right) {
        int start = left;
        int end = right;
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;
    }

    public static void main(String[] argv) {
//        String s = "cbaaabcee";
        String s = "bb";
        System.out.println(longestPalindrome(s));

//        System.out.println(s.substring(0, 4));
    }
}
