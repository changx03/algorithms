/**
 * Created by gungr on 13/11/2016.
 */
public class FindDuplicateNum {

    public int findDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length - 1;
        int mid;
        while (low < high) {
            mid = (low + high) / 2;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid)
                    count++;
            }
            if (count > mid)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {

        FindDuplicateNum myClass = new FindDuplicateNum();
//        int[] nums = {1, 5, 3, 2, 4, 3};
//        int[] nums = {2, 2, 2, 2, 2};
        int[] nums = {1, 2, 2, 3, 4};
        System.out.println(myClass.findDuplicate(nums));
    }
}
