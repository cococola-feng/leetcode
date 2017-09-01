package set.a29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import common.TreeNode;

public class Codec {
	// Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    	List<Integer> list = new ArrayList<Integer>();
    	preTraverse(root, list);
    	return Arrays.toString(list.toArray());
    }
    
    private void preTraverse(TreeNode root, List<Integer> res){
    	if(root == null){
    		res.add(null);
    		return;
    	}
    	
    	res.add(root.val);
    	preTraverse(root.left, res);
    	preTraverse(root.right, res);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
    	Integer[] values = fromString(data);
    	
    	Queue<Integer> queue = new LinkedList<Integer>();
    	
    	for(Integer value : values){
    		queue.offer(value);
    	}
    	
    	return constructbyPreTraverse(queue);
    }
    
    private Integer[] fromString(String data){
    	data = data.replaceAll("[\\[\\]\\ ]", "");
    	
    	String[] strArray = data.split(",");
    	Integer[] res = new Integer[strArray.length];
    	
    	for(int i = 0; i < strArray.length; i++){
    		if(strArray[i].equals("null")){
    			continue;
    		}
    		res[i] = Integer.parseInt(strArray[i]);
    	}
    	
    	return res;
    }
    
    private TreeNode constructbyPreTraverse(Queue<Integer> queue){
    	Integer value = queue.poll();
    	
    	if(value == null){
    		return null;
    	}else{
    		TreeNode res = new TreeNode(value);
    		res.left = constructbyPreTraverse(queue);
    		res.right = constructbyPreTraverse(queue);
    		return res;
    	}
    }
}
