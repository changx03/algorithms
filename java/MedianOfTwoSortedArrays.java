/**
 * Created by gungr on 19/11/2016.
 */
public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null && nums2 == null) return 0;
        else if (nums1 == null) return (nums2[(nums2.length - 1) / 2] + nums2[nums2.length / 2]) / 2.0;
        else if (nums2 == null) return (nums1[(nums1.length - 1) / 2] + nums1[nums1.length / 2]) / 2.0;
        if (nums1.length < nums2.length) return findMedianSortedArrays(nums2, nums1);
        int jMin = 0, jMax = nums2.length * 2;
        while (jMin <= jMax) {
            int j = (jMin + jMax) / 2;   // Try Cut 2
            int i = nums1.length + nums2.length - j;  // Calculate Cut 1 accordingly

            double left1 = (i == 0) ? Integer.MIN_VALUE : nums1[(i - 1) / 2];
            double right1 = (i == nums1.length * 2) ? Integer.MAX_VALUE : nums1[(i) / 2];

            double left2 = (j == 0) ? Integer.MIN_VALUE : nums2[(j - 1) / 2];
            double right2 = (j == nums2.length * 2) ? Integer.MAX_VALUE : nums2[(j) / 2];

            if (left1 > right2) jMin = j + 1;
            else if (left2 > right1) jMax = j - 1;
            else return (Math.max(left1, left2) + Math.min(right1, right2)) / 2;    // Otherwise, that's the right cut.
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {1,1,1,1};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
