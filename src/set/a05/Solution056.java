package set.a05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution056 {
	public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval o1, Interval o2) {
				return o1.start - o2.start;
			}
		});

        List<Interval> rel = new ArrayList<Interval>();
        if(intervals == null || intervals.size() == 0){
        	return rel;
        }
        
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        
        for(int i = 1; i < intervals.size();i++){
        	if(intervals.get(i).start <= end){
        		if(intervals.get(i).end > end){
        			end = intervals.get(i).end;
        		}
        	}else{
        		rel.add(new Interval(start,end));
        		start = intervals.get(i).start;
        		end = intervals.get(i).end;
        	}
        }
        
        rel.add(new Interval(start,end));
        
        return rel;
    }
}
