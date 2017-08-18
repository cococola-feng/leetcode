package set.a21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

// This solution only takes 62 ms

public class Solution218_TH {
	private class Point{
		private int x;
		private int y;
		private boolean isLeft;
		private Point(int x, int y, boolean isLeft){
			this.x = x;
			this.y = y;
			this.isLeft = isLeft;
		}
	}
	
	public List<int[]> getSkyline(int[][] buildings) {
		if (buildings == null || buildings.length == 0) return new ArrayList<int[]>();

		List<Point> pointList = convert2Point(buildings);
		
		pointList = scanShape(pointList);
		
		return convert2Array(pointList);
	}
	
	private List<Point> scanShape(List<Point> pointList){
		TreeSet<Integer> tree = new TreeSet<Integer>();
		Map<Integer, Integer> overlap = new HashMap<Integer, Integer>();
		
		tree.add(0);
		overlap.put(0, 1);
		
		for(Point point : pointList){
			if(point.isLeft){
				tree.add(point.y);
				if(overlap.containsKey(point.y)){
					overlap.put(point.y, overlap.get(point.y) + 1);
				}else{
					overlap.put(point.y, 1);
				}
				
				point.y = Math.max(point.y, tree.last());
			}else{
				overlap.put(point.y, overlap.get(point.y) - 1);
				if(overlap.get(point.y) == 0){
					overlap.remove(point.y);	
					tree.remove(point.y);
				}
				point.y = tree.last();
			}
		}
		return pointList;
	}
	
	private List<Point> convert2Point(int[][] buildings) {
		List<Point> rel = new ArrayList<Point>();
		for(int[] building : buildings){
			rel.add(new Point(building[0], building[2], true));
			rel.add(new Point(building[1], building[2], false));
		}
		rel.sort(new Comparator<Point>(){
			public int compare(Point o1, Point o2) {
				return o1.x == o2.x ? (o1.isLeft ? -1 : 1) : o1.x - o2.x;
			}
			
		});
		return rel;
	}
	
	private List<int[]> convert2Array(List<Point> list){
		List<int[]> rel = new ArrayList<int[]>();
		
		for(Point point : list){
			if(rel.size() == 0){
				rel.add(new int[]{point.x, point.y});
				continue;
			}
			
			int[] last = rel.get(rel.size() - 1);
			if(point.x != last[0] && point.y != last[1]){
				rel.add(new int[]{point.x, point.y});
			}else if(point.x == last[0] && point.y != last[1]){
				last[1] = point.y;
			}
		}
		
		return rel;
	}
}
