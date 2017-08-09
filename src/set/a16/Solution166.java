package set.a16;

import java.util.HashMap;
import java.util.Map;

public class Solution166 {
	public String fractionToDecimal(int numerator, int denominator) {
        StringBuffer rel = new StringBuffer();
        String sign = "";
        
        long numeratorLong = numerator;
        long denominatorLong = denominator;
        
        if(numeratorLong * denominatorLong < 0){
        	sign = "-";
        	numeratorLong = numeratorLong > 0 ? numeratorLong : -numeratorLong;
        	denominatorLong = denominatorLong > 0 ? denominatorLong : -denominatorLong;
        }else if(numeratorLong < 0 && denominatorLong < 0){
        	numeratorLong = -numeratorLong;
        	denominatorLong = -denominatorLong;
        }
        
        if(numeratorLong > denominatorLong){
        	rel.append(numeratorLong / denominatorLong);
        	numeratorLong %= denominatorLong;
        }else{
        	rel.append(0);
        }
        if(numeratorLong != 0)  rel.append('.');
        
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        
        while(numeratorLong != 0){
        	if(!map.containsKey(numeratorLong)){
        		map.put(numeratorLong, rel.length());
	        	rel.append((numeratorLong * 10) / denominatorLong);
	        	numeratorLong = (numeratorLong * 10) % denominatorLong;
        	}else{
        		String duplicate = rel.substring(map.get(numeratorLong));
        		rel = new StringBuffer(rel.toString().replace(duplicate, "(" + duplicate + ")"));
        		break;
        	}
        }
        
        return sign + rel.toString();
    }
}
