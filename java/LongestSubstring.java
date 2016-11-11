/**
 * Created by gungr on 11/11/2016.
 */
public class LongestSubstring {

    public String longestSubstring(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int[][] table = new int[len2+1][len1+1];
        int max = 0, iMax = 0;
        for(int i = 1; i <= len2; i++) {    // for s2
            for(int j = 1; j <= len1; j++) {    // for s1
                if(s1.charAt(j-1) == s2.charAt(i - 1)) {
                    table[i][j] = table[i-1][j-1] + 1;
                    if(max < table[i][j]) {
                        max = table[i][j];
                        iMax = i;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = max; i > 0; i--) {
            sb.append(s2.charAt(iMax-1));   // the index has 1 offset
            iMax--;
        }
        return sb.reverse().toString(); // the string is reversed
    }

    public static void main(String[] args) {
        LongestSubstring myClass = new LongestSubstring();
        System.out.println(myClass.longestSubstring("abcdefg", "defgggbbb"));
        System.out.println(myClass.longestSubstring("g", ""));
        System.out.println(myClass.longestSubstring("ABCDEFG  ", "ACDEFGB"));
    }
}
