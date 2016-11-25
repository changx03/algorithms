/**
 * Created by xcha011 on 11/25/2016.
 */
public class ContainerWithMostWater {

    // LeetCode 11
    // Exceed time limited
    public static int maxArea(int[] height) {
        int cMax = 0;
        for(int offset = height.length -1; offset > 0; offset--) {
            int cHeight = Math.min(height[offset], height[0]);
            for(int i = offset + 1, j = 1; i < height.length; i++, j++) {
                cHeight = Math.max(cHeight, Math.min(height[i], height[j]));
            }
            cMax = Math.max(offset * cHeight, cMax);
        }
        return cMax;
    }

    // OK, but not the fast one
    public static int maxArea2(int[] height) {
        int low = 0;
        int high = height.length -1 ;
        int cMax = 0;
        while (low < high) {
            cMax = Math.max(cMax, (high - low) * Math.min(height[low], height[high]));
            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }
        return cMax;
    }

    // Fast implementation
    public static int maxArea3(int[] height) {
        int cMax = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j) {
            int h = Math.min(height[i], height[j]);
            cMax = Math.max(cMax, (j - i) * Math.min(height[i], height[j]));
            while(height[i] <= h && i < j) i++;
            while(height[j] <= h && i < j) j--;
        }
        return cMax;
    }

    public static void main(String[] args) {

    }
}
