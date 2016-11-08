import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by xcha011 on 11/8/2016.
 */
public class Permutation {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> outputs = new ArrayList<>();
        permute_(nums, 0, outputs);
        return outputs;
    }

    private void permute_(int[] nums, int idx, List<List<Integer>> outputs) {
        if(idx == nums.length) {
            List<Integer> list = new ArrayList<>();
            for(int t: nums)
                list.add(t);
            outputs.add(list);
            return;
        }

        for(int i = idx; i < nums.length; i++) {
            swap(nums, idx, i);
            permute_(nums, idx + 1, outputs);
            swap(nums, idx, i);
        }
    }

    public List<String> permute(String s) {
        List<String> outputs = new ArrayList<>();
        permute_("", s, outputs);
        return outputs;
    }

    private void permute_(String prefix, String suffix, List<String> outputs) {
        if(suffix.length() == 0) {
            outputs.add(prefix);
            return;
        }

        for(int i = 0; i < suffix.length(); i++) {
            permute_(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i+1, suffix.length()), outputs);
        }
    }


    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] argv) {
        int[] arr = {1, 2, 3};

        Permutation p = new Permutation();
        List<List<Integer>> outputs = p.permute(arr);
        for(List l : outputs) {
            System.out.println(l.toString());
        }

        String s = "abc";
        List<String> sout = p.permute(s);
        for(Object o : sout) {
            System.out.println(String.valueOf(o));
        }
    }
}
