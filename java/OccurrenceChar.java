/**
 * Created by gungr on 10/11/2016.
 */
public class OccurrenceChar {

    public int occurrenceChar(String s, char c) {
        int index = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder(s);
        while(index != -1) {
            index = sb.indexOf(c + "");
            if(index != -1) {
                sb.deleteCharAt(index);
                count++;
            }
        }
        return count;
    }

    public int occurrenceChar2(String s, char c) {
        int count = 0;
        for(char i : s.toCharArray()) {
            if(c == i)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        OccurrenceChar myClass = new OccurrenceChar();
        long t = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++) {
            myClass.occurrenceChar("abcabcdfgdaaaaaaaaadddeaa", 'a');
        }
        System.out.println(System.currentTimeMillis() - t);
        System.out.println(myClass.occurrenceChar("abcabcdfgdaaaaaaaaadddeaa", 'a'));


        t = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++) {
            myClass.occurrenceChar2("abcabcdfgdaaaaaaaaadddeaa", 'a');
        }
        System.out.println(System.currentTimeMillis() - t);
        System.out.println(myClass.occurrenceChar2("abcabcdfgdaaaaaaaaadddeaa", 'a'));
    }
}
