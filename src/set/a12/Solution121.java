package set.a12;

public class Solution121 {
/*	public int maxProfit(int[] prices) {
        if(prices.length < 1) return 0;
        int buy = prices[0];
        int max = 0;
        
        for(int i = 1; i < prices.length; i++){
        	int profit = prices[i] - buy;
        	
        	if(profit < 0){
        		buy = prices[i];
        	}else{
        		max = Math.max(max, profit);
        	}
        }
        
        return max;
    }*/
	
	public int maxProfit(int[] prices) {
		int buy = Integer.MIN_VALUE, sale = 0;
		
		for(int price : prices) {
			sale = Math.max(sale, buy + price);
			buy = Math.max(buy, -price);
		}
		
		return sale;
	}
}
