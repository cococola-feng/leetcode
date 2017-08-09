package star;

import java.util.Arrays;

public class Solution174 {
	public int calculateMinimumHP(int[][] dungeon) {
		int raws = dungeon.length;
		int cols = dungeon[0].length;
		
		int[][] hp = new int[raws + 1][cols + 1];
		for(int [] line : hp) Arrays.fill(line, Integer.MAX_VALUE);
		hp[raws][cols - 1] = 1;
		hp[raws - 1][cols] = 1;
		
		for(int i = raws - 1; i >= 0; i--){
			for(int j = cols - 1; j >= 0; j--){
				int need = Math.min(hp[i + 1][j], hp[i][j + 1]) - dungeon[i][j];
				hp[i][j] = need <= 0 ? 1 : need;
			}
		}
		
		return hp[0][0];
	}
}
