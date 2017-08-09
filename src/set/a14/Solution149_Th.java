package set.a14;

import java.util.HashMap;
import java.util.Map;

import common.Point;

public class Solution149_Th {
	public int maxPoints(Point[] points) {
		int rel = 0;
		
		if(points == null){
			return rel;
		}
		
		if(points.length <= 2){
			return points.length;
		}
		
		Map<Integer, Map<Integer, Integer>> map = new HashMap<Integer, Map<Integer, Integer>>();
		
		for(int i = 0; i < points.length - 1; i++){
			map.clear();
			
			int overlap = 0;
			int max = 0; // This value records the max number with points[i]
			
			for(int j = i + 1; j < points.length; j++){
				int x = points[j].x - points[i].x;
				int y = points[j].y - points[i].y;
				
				if(x == 0 && y == 0){
					overlap++;
					continue;
				}
				
				int gcd = generateGCD(x, y);
				
				if(gcd != 0){
					x /= gcd;
					y /= gcd;
				}
				
				if(map.containsKey(x)){
					if(map.get(x).containsKey(y)){
						map.get(x).put(y, map.get(x).get(y) + 1);
					}else{
						map.get(x).put(y, 1);
					}
				}else{
					Map<Integer, Integer> mapforY = new HashMap<Integer, Integer>();
					mapforY.put(y, 1);
					
					map.put(x, mapforY);
				}
				
				max = Math.max(max, map.get(x).get(y));
			}
			
			rel = Math.max(rel, max + overlap + 1);
		}
		
		return rel;
	}
	
	private int generateGCD(int a, int b) {
		if(b == 0){
			return a;
		}else{
			return generateGCD(b, a % b);
		}
	}

}
