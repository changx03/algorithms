/**
 * Created by gungr on 19/11/2016.
 */
public class MedianOfTwoSortedArrays {
	// LeetCode 4. Median of Two Sorted Arrays
public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    if (nums1 == null && nums2 == null)
        return 0;
    else if (nums1 == null || nums1.length == 0)
        return (nums2[(nums2.length - 1) / 2] + nums2[nums2.length / 2]) / 2.0;
    else if (nums2 == null || nums2.length == 0)
        return (nums1[(nums1.length - 1) / 2] + nums1[nums1.length / 2]) / 2.0;

    int j = nums2.length;
    int i = nums1.length;
    for (;;) {
        int left1 = (i == 0) ? Integer.MIN_VALUE : nums1[(i - 1) / 2];
        int right1 = (i == nums1.length * 2) ? Integer.MAX_VALUE : nums1[i / 2];

        int left2 = (j == 0) ? Integer.MIN_VALUE : nums2[(j - 1) / 2];
        int right2 = (j == nums2.length * 2) ? Integer.MAX_VALUE : nums2[j / 2];

        if (left1 > right2) {   // shrink nums1 left, increase nums2 left
            j++;
            i--;
        }
        else if (left2 > right1){   // shrink nums2 left, increase nums1 left
            j--;
            i++;
        }
        else return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;    // Otherwise, that's the right cut.
}
    }

    public static void main(String[] args) {
        int[] nums2 = {2,3,4,5,6,7,8};
        int[] nums1 = {0,1};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
