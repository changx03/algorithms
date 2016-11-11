/**
 * Created by gungr on 10/11/2016.
 */
public class NonrepeatChar {
    // LeetCode 387 First unique character in a string
    public int firstUniqChar(String s) {
        int[] table = new int[26];
        for(char c : s.toCharArray()) {
            table[c - 'a']++;
        }
        for(int i = 0; i < s.length(); i++) {
            if(table[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }

    public char nonrepeat(String s) {
        s = s.toLowerCase().replaceAll("[^a-z]", "");
        int[] table = new int[26];
        for(char c : s.toCharArray()) {
            table[c - 'a']++;
        }
        for(char c : s.toCharArray()) {
            if(table[c - 'a'] == 1)
                return c;
        }
        return ' ';
    }

    public static void main(String[] args) {
        NonrepeatChar myClass = new NonrepeatChar();
        System.out.println(myClass.nonrepeat("aa  bbcd; e c  bdgn   n nz"));
        System.out.println(myClass.nonrepeat(""));
        System.out.println(myClass.nonrepeat("abcd"));
        System.out.println(myClass.nonrepeat("becdbgchd"));

        String s = "aabcabcd";
        System.out.println(new StringBuilder(s).indexOf("abcd"));
    }
}
