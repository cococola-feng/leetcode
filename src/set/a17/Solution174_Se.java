package set.a17;

public class Solution174_Se {
	public int calculateMinimumHP(int[][] dungeon) {
		int raws = dungeon.length;
		int cols = dungeon[0].length;

		int currentHP[][] = new int[raws][cols];
		int minLostHP[][] = new int[raws][cols];

		for (int i = raws - 1; i >= 0; i--) {
			for (int j = cols - 1; j >= 0; j--) {
				if(i == raws - 1 && j == cols - 1){
					currentHP[i][j] = minLostHP[i][j] = dungeon[i][j];
					continue;
				}
				
				int HPfromBottom = Integer.MIN_VALUE, minLostfromBottom = Integer.MIN_VALUE, HPfromRight = Integer.MIN_VALUE,
						minLostfromRight = Integer.MIN_VALUE;

				if(i < raws - 1){
					HPfromBottom = currentHP[i + 1][j] + dungeon[i][j];
					minLostfromBottom = Math.min(minLostHP[i + 1][j], HPfromBottom);
				}
				
				if(j < cols - 1){
					HPfromRight = currentHP[i][j + 1] + dungeon[i][j];
					minLostfromRight = Math.min(minLostHP[i][j + 1], HPfromRight);
				}

				if (minLostfromBottom == minLostfromRight) {
					if (HPfromBottom > HPfromRight) {
						currentHP[i][j] = HPfromBottom;
						minLostHP[i][j] = minLostfromBottom;
					} else {
						currentHP[i][j] = HPfromRight;
						minLostHP[i][j] = minLostfromRight;
					}
				} else if (minLostfromBottom > minLostfromRight) {
					currentHP[i][j] = HPfromBottom;
					minLostHP[i][j] = minLostfromBottom;
				} else {
					currentHP[i][j] = HPfromRight;
					minLostHP[i][j] = minLostfromRight;
				}
			}
		}

		return currentHP[0][0] > 0 ? (minLostHP[0][0] > 0 ? 1 : - minLostHP[0][0] + 1) : - currentHP[0][0] + 1;
	}
}

