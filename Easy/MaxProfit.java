public class MaxProfit {

    public static void main(String[] args) {
        
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(MaxProfitMethod(prices));
        int[] prices2 = {7,6,4,3,1};
        System.out.println(MaxProfitMethod(prices2));
        int[] prices3 = {2,1,2,0,1};
        System.out.println(MaxProfitMethod(prices3));

    }
    
    
    
    public static int MaxProfitMethod(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
    
        for (int i = 0; i < prices.length; i++) {
            // Update the minimum price
            if (prices[i] < min) {
                min = prices[i];
            }
            
            // Calculate the profit if we sell at the current price
            int profit = prices[i] - min;
            
            // Update the maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
    // Runtime = 2ms.
    // Time Complexity = O(n).
    
}
