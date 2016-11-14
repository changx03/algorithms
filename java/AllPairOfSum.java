import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gungr on 14/11/2016.
 */
public class AllPairOfSum {

    public static List<List<Integer>> allPairOfSum(int[] nums, int target) {
        List<List<Integer>> out = new ArrayList<>();
        Map<Integer, Integer> lut = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int leftover = target - nums[i];
            if(lut.containsKey(leftover)){
                List<Integer> temp = new ArrayList<>();
                temp.add(lut.get(leftover));
                temp.add(i);
                out.add(temp);
            }
            lut.put(nums[i], i);
        }
        return out;
    }
    public static void main(String[] args) {
        int[] nums = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
        int target = 7;
        List<List<Integer>> out = allPairOfSum(nums, target);
        for(List<Integer> i : out) {
            System.out.print(i.toString() + " ");
        }
    }
}
