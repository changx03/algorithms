/**
 * Created by gungr on 10/11/2016.
 */
public class IntToString {

    public int StringToInt1(String s) {
        return Integer.valueOf(s);
    }

    public int StringToInt2(String s) {
        return Integer.parseInt(s);
    }

    public String IntToStr1(int i) {
        return i + "";
    }

    public String IntToStr2(int i) {
        return String.valueOf(i);
    }

    public String IntToStr3(int i) {
        return new StringBuilder().append(i).toString();
    }

    public static void main(String[] argv) {
        IntToString its = new IntToString();

        System.out.println(its.StringToInt1("000000081"));
        System.out.println(its.StringToInt2("000000081"));

//        System.out.println(its.StringToInt1("a"));
//        System.out.println(its.StringToInt2("a"));

        System.out.println(its.IntToStr1(1));
        System.out.println(its.IntToStr2(1));
        System.out.println(its.IntToStr3(1));

    }
}
