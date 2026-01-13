public class Best_Time_to_Buy_and_Sell_Stock_01 {
    public static void main(String[] args) {
        int prices[]={7,6,4,3,1};
        int ans=0;
        int minP=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            minP=Math.min(minP,prices[i]);
            ans=Math.max(ans,prices[i]-minP);
            // minP=Math.min(minP,prices[i]);
        }
        System.out.println(ans);
    }
}
