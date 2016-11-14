import java.util.Arrays;

/**
 * Created by gungr on 14/11/2016.
 */
public class RemoveDuplicatesFromSortedArray {

    // LeetCode 26
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {return 0;}
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[len]) {
                nums[++len] = nums[i];
            }
        }
        len++;
        Arrays.fill(nums, len, nums.length, 0);
        return len;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2, 2, 3, 4, 4, 5};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
