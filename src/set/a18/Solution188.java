package set.a18;

import java.util.Arrays;

public class Solution188 {
	public int maxProfit(int k, int[] prices) {
		if (k >= prices.length / 2) return quickSolve(prices);
		
        int[] buy = new int[k + 1], sale = new int[k + 1];
        
        Arrays.fill(buy, Integer.MAX_VALUE);
        
        for(int price : prices){
        	for(int i = k; i >= 1; i--){
        		sale[i] = Math.max(sale[i], price - buy[i]);
        		buy[i] = Math.min(buy[i], price - sale[i - 1]);
        	}
        }
        
        return sale[k];
    }
	
	private int quickSolve(int[] prices) {
        int profit = 0;
        
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > prices[i - 1]){
            	profit += prices[i] - prices[i - 1];
            }
        }
        
        return profit;
    }
}
