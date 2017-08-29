package set.a28;

import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer> {
	
	private Integer peekingNumber = null;
	private Iterator<Integer> iterator = null;
	
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator = iterator;
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(peekingNumber == null && iterator.hasNext()){
        	peekingNumber = iterator.next();
        }
        return peekingNumber;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		Integer res = null;
	    if(peekingNumber == null && iterator.hasNext()){
	    	res = iterator.next();
	    }else{
	    	res = peekingNumber;
	    	peekingNumber = null;
	    }
	    return res;
	}

	@Override
	public boolean hasNext() {
		return peekingNumber == null ? iterator.hasNext() : true;
	}
}
