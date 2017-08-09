package set.a0;

public class Solution010 {
	public boolean isMatch(String s, String p) {
        return detect(s.toCharArray(), 0, p.toCharArray(), 0);
    }
	
	private boolean detect(char[] arrayS, int sidx, char[] arrayP, int pidx){
		if(sidx == arrayS.length){
			return rightTrim(arrayP, pidx);
		}

		if(pidx == arrayP.length){
			return false;
		}
		
		boolean rel = false;
		if(nextStar(arrayP, pidx)){
			rel = detect(arrayS, sidx, arrayP, pidx + 2);
		}
		
		if(rel){
			return rel;
		}
		
		if(arrayS[sidx] == arrayP[pidx] || arrayP[pidx] == '.'){
			if(!nextStar(arrayP, pidx)){
				rel = detect(arrayS, sidx + 1, arrayP, pidx + 1);
			}else{
				rel = detect(arrayS, sidx + 1, arrayP, pidx);
			}
		}
		
		return rel;
	}
	
	private boolean nextStar(char[] array, int index){
		if(index + 1 < array.length && array[index + 1] == '*'){
			return true;
		}else{
			return false;
		}
	}
	
	private boolean rightTrim(char[] array, int index){
		if(index == array.length){
			return true;
		}
		
		if(nextStar(array, index)){
			return rightTrim(array, index + 2);
		}
		
		return false;
	}
}
