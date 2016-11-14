/**
 * Created by gungr on 11/11/2016.
 */
public class ReverseCharArray {

    public char[] reverse(char[] c) {
        int i = 0;
        int j = c.length -1;
        char[] out = c.clone();
        while(i < j) {
            swap(out, i, j);
            i++;
            j--;
        }
        return out;
    }

    public String reverse(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = c.length - 1;
        while(i < j) {
            swap(c, i, j);
            i++;
            j--;
        }
        return String.valueOf(c);
    }


    private void swap(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
    public static void main(String[] args) {
        ReverseCharArray myClass = new ReverseCharArray();
        char[] c = {'H','e','l','l','o',' ' ,'w','o','r','l','d'};
        System.out.println(c);
        System.out.println(myClass.reverse(c));
        System.out.println(c);

        String s = "Hello world";
        System.out.println(s);
        System.out.println(myClass.reverse(s));
        System.out.println(s);
    }
}
