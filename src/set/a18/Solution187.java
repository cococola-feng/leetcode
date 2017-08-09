package set.a18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution187 {
	public List<String> findRepeatedDnaSequences(String s) {
		Set<String> repeatedSet = new HashSet<String>();
		Set<String> checkedSet = new HashSet<String>();
        for(int i = 0; i < s.length() - 9; i++){
        	String seq = s.substring(i, i + 10);
        	if(checkedSet.contains(seq)){
        		repeatedSet.add(seq);
        	}else{
        		checkedSet.add(seq);
        	}
        }
        List<String> rel = new ArrayList<String>(repeatedSet);
        return rel;
    }
}
