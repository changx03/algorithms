/**
 * Created by gungr on 10/11/2016.
 */
public class StringBuilderAndStringBuffer {

    public static void main(String[] args) {
        int n = 1000000;
        long t;

        // StringBuffer
        StringBuffer sbuf = new StringBuffer();
        t = System.currentTimeMillis();
        for(int i = n; i --> 0;) {
            sbuf.append(i);
        }
        System.out.println(System.currentTimeMillis() - t);
//        System.out.println(sbuf.toString());

        // StringBuilder
        StringBuffer sbui = new StringBuffer();
        t = System.currentTimeMillis();
        for(int i = n; i --> 0;) {
            sbui.append(i);
        }
        System.out.println(System.currentTimeMillis() - t);
//        System.out.println(sbui.toString());

        StringBuilder sb = new StringBuilder("Hello ");
        System.out.println(sb.toString());
        StringBuilderAndStringBuffer myClass = new StringBuilderAndStringBuffer();
        myClass.mutableSB(sb, "World!");
        System.out.println(sb.toString());
    }

    public void mutableSB(StringBuilder sb, String s) {
        sb.append(s);
    }
}
