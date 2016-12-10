/**
 * Created by gungr on 11/12/2016.
 */
public class BestBuyStock {
    /**
     * LeetCode 121. Best Time to Buy and Sell Stock
     * @param prices An array for which the ith element is the price of a given stock on day i.
     * @return the maximum profit
     */
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int p : prices) {
            if(p < min)
                min = p;
            else {
                int curProfit = p - min;
                profit = (curProfit > profit) ? curProfit : profit;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] nums1 = {7, 1, 5, 3, 6, 4};
        int[] nums2 = {7, 6, 4, 3, 1};
        BestBuyStock bestBuyStock = new BestBuyStock();
        System.out.println(bestBuyStock.maxProfit(nums1));
        System.out.println(bestBuyStock.maxProfit(nums2));
    }
}
