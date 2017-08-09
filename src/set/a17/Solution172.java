package set.a17;

public class Solution172 {
	public int trailingZeroes(int n) {
        int count = 0;
        for(int i = 5; i <= n; i++){
        	count += get5(i);
        }
        return count;
    }
	private int get5 (int x){
		if(x % 5 == 0){
			return 1 + get5(x / 5);
		}
		return 0;
	}
}
