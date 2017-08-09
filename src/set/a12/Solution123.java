package set.a12;

public class Solution123 {
	/*public int maxProfit(int[] prices) {
		int buy1 = Integer.MIN_VALUE;
		int buy2 = Integer.MIN_VALUE;
		int sale1 = 0;
		int sale2 = 0;
		
		for(int price : prices){
			sale2 = Math.max(sale2, buy2 + price);
			buy2 = Math.max(buy2, sale1 - price);
			sale1 = Math.max(sale1, buy1 + price);
			buy1 = Math.max(buy1, -price);
		}
		
		return sale2;
    }*/
	public int maxProfit(int[] prices) {
		int buy1 = Integer.MAX_VALUE;
		int buy2 = Integer.MAX_VALUE;
		int sale1 = 0;
		int sale2 = 0;
		
		for(int price : prices){
			sale2 = Math.max(sale2, price - buy2);
			buy2 = Math.min(buy2, price - sale1);
			sale1 = Math.max(sale1, price - buy1);
			buy1 = Math.min(buy1, price);
		}
		
		return sale2;
    }
}
