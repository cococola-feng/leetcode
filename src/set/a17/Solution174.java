package set.a17;

public class Solution174 {
	public int calculateMinimumHP(int[][] dungeon) {
		int raws = dungeon.length;
		int cols = dungeon[0].length;

		int currentHP[][] = new int[raws][cols];
		int minLostHP[][] = new int[raws][cols];

		for (int i = 0; i < raws; i++) {
			for (int j = 0; j < cols; j++) {
				if(i == 0 && j == 0){
					currentHP[i][j] = minLostHP[i][j] = dungeon[i][j];
					continue;
				}
				
				int HPfromTop = Integer.MIN_VALUE, minLostfromTop = Integer.MIN_VALUE, HPfromLeft = Integer.MIN_VALUE,
						minLostfromLeft = Integer.MIN_VALUE;

				if(i > 0){
					HPfromTop = currentHP[i - 1][j] + dungeon[i][j];
					minLostfromTop = Math.min(minLostHP[i - 1][j], HPfromTop);
				}
				
				if(j > 0){
					HPfromLeft = currentHP[i][j - 1] + dungeon[i][j];
					minLostfromLeft = Math.min(minLostHP[i][j - 1], HPfromLeft);
				}

				if (minLostfromTop == minLostfromLeft) {
					if (HPfromTop > HPfromLeft) {
						currentHP[i][j] = HPfromTop;
						minLostHP[i][j] = minLostfromTop;
					} else {
						currentHP[i][j] = HPfromLeft;
						minLostHP[i][j] = minLostfromLeft;
					}
				} else if (minLostfromTop > minLostfromLeft) {
					currentHP[i][j] = HPfromTop;
					minLostHP[i][j] = minLostfromTop;
				} else {
					currentHP[i][j] = HPfromLeft;
					minLostHP[i][j] = minLostfromLeft;
				}
			}
		}

		return minLostHP[raws - 1][cols - 1] > 0 ? 1 : -minLostHP[raws - 1][cols - 1] + 1;
	}
}
