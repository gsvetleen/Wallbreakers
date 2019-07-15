class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;
        int maxPrice = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length;i++){
            int result = calculate(i+1,prices,i);
            if(result < maxPrice){
                maxPrice = result;
            }
        }
        
        return (maxPrice * -1);
    }
    
    public int calculate(int count, int[] prices, int startPrice){
        if(count == prices.length)
            return 0;
        int value = prices[startPrice]-prices[count];
        return Math.min(value,calculate(count+1,prices,startPrice));
    }
}