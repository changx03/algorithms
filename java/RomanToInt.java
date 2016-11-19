/**
 * Created by gungr on 20/11/2016.
 */
public class RomanToInt {
    // LeetCode 13 Roman to Integer
    public static int romanToInt(String s) {
        int num = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            switch (s.charAt(i)){
                case 'I':
                    num = (num < 5) ? num + 1 : num - 1;
                    break;
                case 'V':
                    num += 5;
                    break;
                case 'X':
                    num = (num < 50) ? num + 10 : num - 10;
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'C':
                    num = (num < 500) ? num + 100 : num - 100;
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
                default:
                    break;
            }
        }
        return num;
    }

    public static void main(String[] args) {

    }
}
