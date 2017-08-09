package set.a11;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rel = new ArrayList<List<Integer>>();
        
        for(int i = 0; i < numRows; i++){
        	List<Integer> preList = rel.size() == 0 ? new ArrayList<Integer>() : rel.get(i - 1);
        	List<Integer> list = new ArrayList<Integer>();
        	for(int j = 0; j < preList.size(); j++) list.add(j > 0 ? preList.get(j - 1) + preList.get(j) : preList.get(j));
        	list.add(1);
        	rel.add(list);
        }
        
        return rel;
    }
}
