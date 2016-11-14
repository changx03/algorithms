import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by gungr on 14/11/2016.
 */
public class RemoveDuplicatesFromArray {
    public static int[] removeDuplicates(int[] nums) {
        Set<Integer> lut = new HashSet<>();
        for(int i : nums) {
            lut.add(i);
        }
        int[] out = new int[lut.size()];
        int i = 0;
        for(Integer val : lut) {
            out[i] = val;
            i++;
        }
        return out;
    }

    public static void main(String[] args) {
        int[][] test = new int[][]{
                {1, 1, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},};

        for (int[] input : test) {
            System.out.println(Arrays.toString(removeDuplicates(input)));
        }
    }
}
