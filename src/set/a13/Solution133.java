package set.a13;

import java.util.HashMap;
import java.util.Map;

import common.UndirectedGraphNode;

public class Solution133 {
	Map<Integer, UndirectedGraphNode> map = new HashMap<Integer, UndirectedGraphNode>();
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null) return null;
        if(map.containsKey(node.label)) return map.get(node.label);
        
        UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
        map.put(clone.label, clone);
        for(UndirectedGraphNode neighbor : node.neighbors){
        	clone.neighbors.add(cloneGraph(neighbor));
        }
        
        return clone;
    }
}
