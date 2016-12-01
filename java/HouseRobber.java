/**
 * Created by gungr on 2/12/2016.
 */
public class HouseRobber {

    // LeetCode 198 House Robber

    /**
     * It will automatically contact the police if two adjacent houses were broken into on the same night.
     * @param num the amount of money for each house
     * @return  the maximum amount of money you can rob without alerting the police
     */
    public static int rob(int[] num) {
        int odd = 0;
        int even = 0;
        for(int i = 0; i < num.length; i++) {
            if(i % 2 == 0)
                even = Math.max(even + num[i], odd);
            else
                odd = Math.max(even, odd + num[i]);
        }
        return Math.max(odd, even);
    }


    public static void main(String[] args) {
        int[] nums = {10, 20, 3, 50, 10, 60, 10, 7, 90, 30};
        System.out.println(rob(nums));
    }
}
