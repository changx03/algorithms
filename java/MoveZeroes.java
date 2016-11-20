import java.util.Arrays;

/**
 * Created by gungr on 20/11/2016.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                swap(nums, i, j);
                j++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        MoveZeroes mz = new MoveZeroes();
        int[] nums = {2,0,1,0,3,12};
//        int[] nums = {1};
//        int[] nums = {0};
        System.out.println(Arrays.toString(nums));
        mz.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
