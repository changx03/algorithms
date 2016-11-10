/**
 * Created by gungr on 10/11/2016.
 */
public class NonrepeatChar {
    public char nonrepeat(String s) {
        s = s.replace(" ", "").toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        for(char c : s.toCharArray()) {
            sb.deleteCharAt(i);
            if(sb.indexOf(c + "") == -1)
                return c;
            i++;
        }
        return ' ';
    }

    public static void main(String[] args) {
        NonrepeatChar myClass = new NonrepeatChar();
        System.out.println(myClass.nonrepeat("aa  bbcd; e c  bdgn   n nz"));
        System.out.println(myClass.nonrepeat(""));
        System.out.println(myClass.nonrepeat("abcd"));
    }
}
