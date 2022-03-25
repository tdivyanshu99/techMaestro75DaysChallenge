class Solution {
    public int maxProfit(int[] prices) {
        int maxi=0;
        int n=prices.length;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            mini=Math.min(mini,prices[i]);
            maxi=Math.max(maxi,prices[i]-mini);
        }
        return maxi;
    }
}