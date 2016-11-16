import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by gungr on 15/11/2016.
 */
public class MergeSort {

    public void mergeSort(int[] nums, int start, int end) {
        if(start == end) return;    // recursive base case
        int mid = (start + end) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }

    private void merge(int[] nums, int start, int mid, int end) {
        int[] left = new int[mid - start + 2];
        for(int i = start; i <= mid; i++) {
            left[i-start] = nums[i];
        }
        left[mid - start + 1] = Integer.MAX_VALUE;

        int[] right = new int[end - mid + 1];
        for(int i = mid + 1; i <= end; i++) {
            right[i - mid - 1] = nums[i];
        }
        right[end - mid] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = start; k <= end; k++) {
            if(left[i] <= right[j]) {
                nums[k] = left[i];
                i++;
            } else {
                nums[k] = right[j];
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {6, 4, 5, 1, 8, 15, 10};
        MergeSort ms = new MergeSort();
        ms.mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
