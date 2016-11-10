import java.util.HashMap;
import java.util.Map;

/**
 * Created by gungr on 10/11/2016.
 */
public class StringAnagram {

    public boolean isAnagram(String s, String t) {
        s = s.replace(" ", "");
        t = t.replace(" ", "");
        if(s.length() != t.length())
            return false;
        StringBuilder tsb = new StringBuilder(t);

        for(char c : s.toCharArray()) {
            int index = tsb.indexOf(c + "");
            if(index != -1)
                tsb.deleteCharAt(index);
            else
                return false;
        }
        return (tsb.length() == 0);
    }

    public boolean isAnagram2(String s, String t) {
        s = s.replace(" ", "");
        t = t.replace(" ", "");
        int[] table = new int[26];
        for(char c : s.toCharArray())
            table[c - 'a']++;
        for(char c : t.toCharArray())
            table[c - 'a']--;
        for(int count : table) {
            if (count != 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        StringAnagram sa = new StringAnagram();
        System.out.println(sa.isAnagram("wo rd", "w r d o"));
        System.out.println(sa.isAnagram("mary", "army"));
        System.out.println(sa.isAnagram("sleep", "slep"));

        System.out.println(sa.isAnagram2("wo rd", "w r d o"));
        System.out.println(sa.isAnagram2("mary", "army"));
        System.out.println(sa.isAnagram("sleep", "slep"));

    }
}
