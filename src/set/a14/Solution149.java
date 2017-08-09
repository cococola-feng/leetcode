package set.a14;

import java.util.HashMap;

import common.Point;

public class Solution149 {
	/*
	 * consider y = a * x + b
	 * Point.x <- a
	 * Point.y <- b
	 * 
	 * a = (y1 - y0) / (x1 - x0)
	 * b = y0 - (y1 - y0) * x0 / (x1 -x0)
	 */
	private static class Para{
		private float a;
		private float b;
		private Para(float a, float b){
			this.a = a;
			this.b = b;
		}
	}
	
	public int maxPoints(Point[] points) {
		if(points == null){
			return 0;
		}
		
		if(points.length < 3){
			return points.length;
		}
		
		HashMap<Para, Integer> map = new HashMap<Para, Integer>();
		
		//draw all the lines
		for(int i = 0; i < points.length - 1; i++){
			
			float x0 = points[i].x;
			float y0 = points[i].y;
			
			for(int j = i + 1; j < points.length; j++){
				//This new line
				float x1 = points[j].x;
				float y1 = points[j].y;
				
				float a,b;
				if(x1 == x0){
					a = x0;
					b = Integer.MAX_VALUE;
				}else{
					a = (y1 - y0) / (x1 - x0);
					b = y0 - (y1 - y0) * x0 / (x1 -x0);
				}
				//END This new line
				
				boolean isNew = true;
				
				for(Para linePara : map.keySet()){
					if(a == linePara.a && b == linePara.b){
						isNew = false;
						break;
					}
				}
				
				if (isNew) {
					Para newPara = new Para(a, b);
					map.put(newPara, 0);
				}
			}
		}
		//calculate number of points in each line
		for(Point point : points){
			for(Para linePara : map.keySet()){
				float a = linePara.a;
				float b = linePara.b;
				
				if((b == Integer.MAX_VALUE && point.x == a) || point.y == (a * point.x + b)){
					map.put(linePara, map.get(linePara) + 1);
				}
			}
		}
		//calculate the max
        int max = 0;
        for(int value : map.values()){
        	max = max > value ? max : value;
        }
        
        for(Para para : map.keySet()){
        	System.out.println(para.a + " " + para.b + ": " + map.get(para));
        }
        return max;
    }
}
