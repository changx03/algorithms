/**
 * Created by gungr on 15/11/2016.
 */
public class RemoveDuplicatesFromSortedArrayII {

    public static int removeDuplicates(int[] nums) {
            if(nums == null) return 0;
            if(nums.length <= 2) return nums.length;
            int cur = 2;
            for(int i = 2; i < nums.length; i++) {
                if(nums[i] != nums[cur-2])
                    nums[cur++] = nums[i];
            }
            return  cur;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
}
