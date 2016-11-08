/**
 * Created by xcha011 on 11/8/2016.
 */
public class StringReverse {

    public String stringReverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public char[] charArrayReverse(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            char buffer = s[i];
            s[i] = s[j];
            s[j] = buffer;
            i++;
            j--;
        }
        return s;
    }
    public static void main(String[] argv) {
        System.out.println(new StringReverse().stringReverse("Hello World!"));

        String s = "Hello World!";
        System.out.println(new StringReverse().charArrayReverse(s.toCharArray()));
    }
}
