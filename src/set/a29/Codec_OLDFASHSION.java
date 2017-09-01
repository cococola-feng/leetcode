package set.a29;

import java.util.Arrays;

import common.TreeNode;

public class Codec_OLDFASHSION {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Integer[] arr = new Integer[1024];
        
        arr = resolve(root, 0, arr);
        
        int last = arr.length - 1;
        
        while(last >= 0 && arr[last] == null) last--;
        
        arr = Arrays.copyOfRange(arr, 0, last + 1);
        
        return Arrays.toString(arr);
    }
    
    private Integer[] resolve(TreeNode root, int index, Integer[] arr){
    	if(root == null) return arr;
    	
    	while(index >= arr.length){
    		arr = Arrays.copyOf(arr, arr.length * 2);
    	}
    	
    	arr[index] = root.val;
    	
    	arr = resolve(root.left, (index + 1) * 2 - 1, arr);
    	arr = resolve(root.right, (index + 1) * 2, arr);
    	
    	return arr;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] items = data.split(",");
        Integer[] values = new Integer[items.length];
        
        for(int i = 0; i < items.length; i++){
        	if(items[i] == null || items.length == 0){
        		continue;
        	}
        	String item = items[i].replaceAll("[\\[\\]\\,]", "");
        	if(item.length() == 0){
        		continue;
        	}
        	if(item.equals("null")){
        		continue;
        	}
        	values[i] = Integer.parseInt(item);
        }
        
        return construct(values);
    }
    
    public static TreeNode construct(Integer[] array){
		if(array == null || array.length == 0) return null;
		return constructbyArray(array, 0);
	}
	
	private static TreeNode constructbyArray(Integer[] array, int index){
		TreeNode rel = null;
		if(index < array.length && array[index] != null){
			rel = new TreeNode(array[index]);
			rel.left = constructbyArray(array, (index + 1) * 2 - 1);
			rel.right = constructbyArray(array, (index + 1) * 2);
		}
		return rel;
	}
}
