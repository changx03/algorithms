/**
 * Created by gungr on 14/11/2016.
 */
public class SecondHighestNumber {

    public static int secondHighest(int[] nums) {
        int largest = 0;
        int second = 0;
        for(int i : nums) {
            if(largest <= i){
                second = largest;
                largest = i;
            } else if(second < i)
                second = i;
        }
        return second;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 19, 4, 5, 6, 9, 8, 11, 15, 1};
        System.out.println(secondHighest(nums));
    }
}
