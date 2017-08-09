package set.a18;

import java.util.ArrayList;
import java.util.List;

public class Solution188_Se {
	public int maxProfit(int k, int[] prices) {
		return 0;
	}
	
	private List getProfits(int[] prices) {
		List<Integer> rel = new ArrayList<Integer>();
		int pre = Integer.MAX_VALUE;
		int profit = 0;
		
		for(int price : prices){
			if(price >= pre){
				profit += (price - pre);
			}else{
				rel.add(profit);
				profit = 0;
				pre = price;
			}
		}
		
		return rel;
	}
}
