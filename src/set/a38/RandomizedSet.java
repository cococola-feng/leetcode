package set.a38;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RandomizedSet {
	
	private Set<Integer> set = null;
	private List<Integer> list = null;
	private boolean flushed = false;
	private Random r = null;
	
    /** Initialize your data structure here. */
    public RandomizedSet() {
        set = new HashSet<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
    	if(!set.contains(val)){
    		set.add(val);
    		flushed = false;
    		return true;
    	}
    	return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        boolean rel = set.remove(val);
        if(rel){
        	flushed = false;
        }
        return rel;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
    	if(!flushed){
	        list = new ArrayList<Integer>();
	        list.addAll(set);
	        r = new Random();
	        flushed = true;
    	}
    	return list.get(r.nextInt(list.size()));
    }
}
