import java.util.Arrays;

/**
 * Created by gungr on 10/11/2016.
 */
public class MissingNumber {
    // LeetCode 268 Missing number
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int expect = 0;
        for(int i : nums) {
            if(expect != i)
                return expect;
            expect++;
        }
        return expect;
    }


    public int missingNumber2(int[] nums) { //xor
        int res = nums.length;
        for(int i=0; i<nums.length; i++){
            res ^= i;
            res ^= nums[i];
        }
        return res;
    }

    // calculating sum, without sorting
    public int missingNumber3(int[] nums) {
        int sum = (0 + nums.length) * (nums.length + 1) / 2;
        for(int i : nums)
            sum -= i;
        return sum;
    }

    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();
        System.out.println(mn.missingNumber(new int[]{1,0}));
        System.out.println(mn.missingNumber(new int[]{1, 0, 2, 5, 4}));

        System.out.println(mn.missingNumber2(new int[]{1, 0, 2, 5, 4}));

        System.out.println(mn.missingNumber3(new int[0]));
        System.out.println(mn.missingNumber3(new int[]{0}));
        System.out.println(mn.missingNumber3(new int[]{1}));
        System.out.println(mn.missingNumber3(new int[]{1,0}));
        System.out.println(mn.missingNumber3(new int[]{1, 0, 2, 5, 4}));
    }
}
