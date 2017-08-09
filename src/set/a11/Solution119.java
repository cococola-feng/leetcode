package set.a11;

import java.util.ArrayList;
import java.util.List;

public class Solution119 {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> rel = new ArrayList<Integer>();
        
        for(int i = 0; i <= rowIndex; i++){
        	List<Integer> preList = rel;
        	rel = new ArrayList<Integer>();
        	for(int j = 0; j < preList.size(); j++) rel.add(j > 0 ? preList.get(j - 1) + preList.get(j) : preList.get(j));
        	rel.add(1);
        }
        
        return rel;
    }
}
