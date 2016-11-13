import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by gungr on 13/11/2016.
 */
public class FindAllDuplicates {
    // LeetCode 442 hidden question
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> out = new ArrayList<>();
        for(int i : nums) {
            int index = Math.abs(i) - 1;
            if(nums[index] < 0)
                out.add(Math.abs(i));
            nums[index] = -nums[index];
        }
        return out;
    }
    public static List<Integer> findDuplicates2(int[] nums) {
        Set<Integer> lut = new HashSet<>();
        List<Integer> out = new ArrayList<>();
        for(int i : nums) {
            if(!lut.add(i))
                out.add(i);
        }
        return out;
    }

    public static void main(String[] args) {
        List<Integer> out = findDuplicates(new int[]{4,3,2,2,2,7,8,2,3,1});
        for(int i : out) {
            System.out.print(i + " ");
        }
    }
}
