package set.a11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution120 {
	public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 0) return 0;
        if(triangle.size() == 1) return triangle.get(0).get(0);
        
        List<Integer> preList = triangle.get(0);
        for(int i = 1; i < triangle.size(); i++){
        	List<Integer> thisList = new ArrayList<Integer>();
        	thisList.add(preList.get(0) + triangle.get(i).get(0));
        	for(int j = 1; j < triangle.get(i).size() - 1; j++) thisList.add(triangle.get(i).get(j) + Math.min(preList.get(j-1), preList.get(j)));
        	thisList.add(preList.get(preList.size() - 1) + triangle.get(i).get(triangle.get(i).size() - 1));
        	preList = thisList;
        }
        
        return Collections.min(preList);
    }
}
