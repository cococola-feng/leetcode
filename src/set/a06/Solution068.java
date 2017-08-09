package set.a06;

import java.util.ArrayList;
import java.util.List;

public class Solution068 {
	public List<String> fullJustify(String[] words, int maxWidth) {
		List<String> rel = new ArrayList<String>();
        StringBuffer line = new StringBuffer();
        int index = 0;
        
        while(index < words.length){
        	if(line.length() + words[index].length() > maxWidth){
        		line.deleteCharAt(line.length() - 1);
        		fillSpace(line, maxWidth);
        		rel.add(line.toString());
        		line.delete(0, line.length());
        	}
        	line.append(words[index]);
        	line.append(' ');
        	index++;
        }
        if(line.length() > 0){
        	line.deleteCharAt(line.length() - 1);
        	while(line.length() < maxWidth){
        		line.insert(line.length(), ' ');
        	}
        	rel.add(line.toString());
        }
        return rel;
    }
	
	private void fillSpace(StringBuffer line, int maxWidth){
		while(line.length() < maxWidth){
			int index = 0;
			boolean found = false;
			while(line.length() < maxWidth && index < line.length()){
				if(index > 0 && line.charAt(index) != ' ' && line.charAt(index -1) == ' '){
					found = true;
					line.insert(index, ' ');
					index++;
				}
				index++;
			}
			if(!found){
				while(line.length() < maxWidth){
					line.insert(line.length(), ' ');
				}
			}
		}
	}
}
