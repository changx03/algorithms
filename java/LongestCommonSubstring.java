/**
 * Created by gungr on 9/11/2016.
 */
public class LongestCommonSubstring {

    public static int longestSubstring(String s1, String s2) {
        if(s1.length() == 0 || s2.length() == 0)
            return 0;

        int max = 0;
        int lengthS1 = s1.length();
        int lengthS2 = s2.length();
        int[][] table = new int[lengthS1 + 1][lengthS2 + 1];

        for(int i = 1; i <= lengthS1; i++) {
            for(int j = 1; j <= lengthS2; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    table[i][j] = table[i-1][j-1] + 1;
                if(table[i][j] > max)
                    max = table[i][j];
            }
        }
        return max;
    }


    public static void main(String[] argv) {
        String s1 = "abcdaf";
        String s2 = "3bcdf";
        System.out.println(longestSubstring(s1, s2));
    }
}
