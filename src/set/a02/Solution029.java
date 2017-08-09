package set.a02;

public class Solution029 {
	public int divide(int dividend, int divisor) {
		int flag = 1;
        if (dividend > 0 && divisor < 0 || dividend < 0 && divisor > 0){
        	flag = -1;
        }
        
        long ldividend = dividend;
        long ldivisor = divisor;
        ldividend = Math.abs(ldividend);
        ldivisor = Math.abs(ldivisor);
        
        long rel = longDivide(ldividend, ldivisor);
        
        if (flag > 0 && rel > Integer.MAX_VALUE){
        	rel = Integer.MAX_VALUE;
        }
        
        return (int) (rel * flag);
    }

	public long longDivide(long ldividend, long ldivisor) {
		if (ldividend < ldivisor){
			return 0;
		}
		
		long rel = 1;
		long sum = ldivisor;
		
		while (sum + sum < ldividend) {
			sum += sum;
			rel += rel;
		}
		
		rel += longDivide(ldividend - sum, ldivisor);
		
		return rel;
	}
}
