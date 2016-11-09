import java.util.Arrays;

/**
 * Created by gungr on 9/11/2016.
 */
public class NextPermutation {
//    LeetCode Q31
//    Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
//    If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;    // the 2nd last index
        while(i >= 0 && nums[i+1] <= nums[i])
            i--;
        if(i >= 0) {
            int j = nums.length - 1;    // the last index
            while(j >= 0 && nums[j] <= nums[i])
                j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    private void swap(int[] nums, int i, int j) {
        int buffer = nums[i];
        nums[i] = nums[j];
        nums[j] = buffer;
    }

    private void reverse(int[] nums, int from) {
        int i = from;
        int j = nums.length - 1;
        while(i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] argv) {
//        int[] nums = {1, 2};
        int[] nums = new int[0];
        NextPermutation np = new NextPermutation();
        np.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
