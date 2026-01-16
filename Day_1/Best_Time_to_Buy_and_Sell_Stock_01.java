public class Best_Time_to_Buy_and_Sell_Stock_01 {
    public static void main(String[] args) {
        int prices[]={7,6,4,3,1};
        // minPrice will store the minimum stock price seen so far
        int minPrice = Integer.MAX_VALUE;

        // maxProfit will store the maximum profit we can achieve
        int maxProfit = 0;

        // Traverse through each day's stock price
        for (int i = 0; i < prices.length; i++) {

            // Update minPrice if we find a cheaper buying price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // Otherwise, try selling on this day and update profit
            else {
                // Profit = selling price - minimum buying price
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        // Return the maximum profit found
        System.out.println(maxProfit);
    }
}
