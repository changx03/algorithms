import java.util.ArrayList;
import java.util.List;

/**
 * Created by gungr on 20/11/2016.
 */
public class ZigZagStringConversion {
    // LeetCode 6 ZigZag conversion
    public static String convert(String s, int numRows) {
        if(numRows == 1) return s;

        StringBuilder out = new StringBuilder();
        int step = 2 * numRows - 2;
        for(int i = 0; i < numRows; i++) {
            if(i == 0 || i == numRows - 1) {
                for(int j = i; j < s.length(); j += step)
                    out.append(s.charAt(j));
            } else {
                int j = i;
                boolean flag = true;
                int step1 = 2 * (numRows - 1 - i);
                int step2 = step - step1;
                while(j < s.length()){
                    out.append(s.charAt(j));
                    j = (flag) ? j + step1 : j + step2;
                    flag =  !flag;
                }
            }
        }
        return out.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}
