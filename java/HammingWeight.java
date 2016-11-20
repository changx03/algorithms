/**
 * Created by gungr on 20/11/2016.
 */
public class HammingWeight {
    // LeetCode 191 Number of 1 Bits

    public static int hammingWeight(int n) {
        return Integer.toBinaryString(n).replaceAll("[^1]", "").length();
    }

    public static int hammingWeight2(int n) {
        int ones = 0;
        while(n!=0) {
            ones = ones + (n & 1);
            n = n>>>1;
        }
        return ones;
    }

    public static void main(String[] args) {
        int i = 11;
        System.out.println(hammingWeight(i));
        System.out.println(hammingWeight2(Integer.MAX_VALUE));

        System.out.println(-127 >> 1);
        System.out.println(-127 >>> 1);
    }
}
