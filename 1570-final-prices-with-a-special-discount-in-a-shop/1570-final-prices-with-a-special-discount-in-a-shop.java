class Solution {
    public int[] finalPrices(int[] prices) {
        int [] sol = new int[prices.length];
        for(int i=0;i<prices.length;i++){
            int val = prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    val = prices[i] - prices[j];
                    break;
                }
            }
            sol[i] = val;
        }
        return sol;
    }
}