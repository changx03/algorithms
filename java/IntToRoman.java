import java.util.ArrayList;
import java.util.List;

/**
 * Created by gungr on 13/12/2016.
 */
public class IntToRoman {
    /**
     * LeetCode 12. Given an integer, convert it to a roman numeral.
     * Input is guaranteed to be within the range from 1 to 3999.
     * @param num integer number
     * @return Roman number in string
     */
    public String intToRoman(int num) {
        String[][] lut = {{"V", "I"}, {"L", "X"}, {"D", "C"}, {"", "M"}};
        List<String> invertedRoman = new ArrayList<>();
        int p = 0;
        while(num > 0) {
            int digit1 = num % 10;
            StringBuilder sb = new StringBuilder();
            if (digit1 == 4)
                sb.append(lut[p][1]).append(lut[p][0]);
            else if (digit1 == 9)
                sb.append(lut[p][1]).append(lut[p + 1][1]);
            else {
                int count = (digit1 > 4) ? digit1 - 5 : digit1;
                if (digit1 > 4)
                    sb.append(lut[p][0]);
                for (int i = 0; i < count; i++) {
                    sb.append(lut[p][1]);
                }
            }
            invertedRoman.add(sb.toString());
            num /= 10;
            p++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = invertedRoman.size() - 1; i >= 0; i--){
            sb.append(invertedRoman.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        IntToRoman myClass = new IntToRoman();
//        System.out.println(myClass.intToRoman(14));
        System.out.println(myClass.intToRoman(3926));
    }
}
