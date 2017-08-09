package set.a05;

import java.util.ArrayList;
import java.util.List;

public class Solution057 {
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		List<Interval> rel = new ArrayList<Interval>();
		
		if(intervals == null || intervals.size() == 0){
			rel.add(newInterval);
			return rel;
		}
		
		int index = intervals.size() - 1;
		while(index >= 0 && newInterval.start <= intervals.get(index).start) --index;
		index++;
		
		intervals.add(index, newInterval);
		
		index = 0;
		while(true){
			if(index >= intervals.size()){
				break;
			}
			
			if(intervals.get(index).end > intervals.get(index + 1).end){
				intervals.remove(index + 1);
				continue;
			}else if(intervals.get(index).end >= intervals.get(index + 1).start){
				intervals.get(index).end = intervals.get(index + 1).end;
				intervals.remove(index + 1);
				continue;
			}
			
			index++;
		}
		
		return intervals;
		
	}
	/*public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		List<Interval> rel = new ArrayList<Interval>();
		
		if(intervals == null || intervals.size() == 0){
			rel.add(newInterval);
			return rel;
		}
		
        int index = 0;
        int start = 0;
        int end = 0;
        
        while(index < intervals.size()){
        	if(newInterval.start >= intervals.get(index).start && newInterval.start <= intervals.get(index).end){
        		start = intervals.get(index).start;
        		end = newInterval.end;
        		break;
        	}else{
        		rel.add(intervals.get(index));
        	}
        	index++;
        }
        
        if(index == intervals.size()){
        	rel.add(newInterval);
        	return rel;
        }
        
        while(index < intervals.size()){
        	if(end <= intervals.get(index).end){
        		rel.add(new Interval(start, intervals.get(index).end));
        		index++;
        		break;
        	}else{
        		index++;
        	}
        }
        
        if(rel.size() > 0 || end <= rel.get(rel.size() - 1).end){
	        while(index < intervals.size()){
	        	rel.add(intervals.get(index));
	        }
        }else{
        	rel.add(new Interval(start, end));
        }
        
        return rel;
    }*/
}
