package set.a22;

public class Solution223 {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        if(A <= D){ 
        	return myCompute(A, B, C, D, E, F, G, H);
        }else{
        	return myCompute(E, F, G, H, A, B, C, D);
        }
        	
    }
	
	private int myCompute(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        int allArea = (x2 - x1) * (y2 - y1) + (x4 - x3) * (y4 - y3);
        int overlap = 0;
        
        if(x1 == x3 && y1 == y3 && x2 == x4 && y2 == y4){
        	overlap = (x2 - x1) * (y2 - y1);
        }else if(x2 <= x3 || y1 >= y4 || y2 <=y3 ){
        	overlap = 0;
        }else if(x1 < x3 && x2 > x3 && x2 < x4){
        	overlap = (x2 - x3) * Math.max(0, Math.min(y2, y4) - Math.max(y1, y3));
        }else if(x1 < x3 && x2 > x4 || x1 > x3 && x2 < x4){
        	overlap = Math.max(0, Math.min(x2, x4) - Math.max(x1, x3)) * Math.max(0, Math.min(y2, y4) - Math.max(y1, y3));
        }
        
        return allArea - overlap;
    }
}
