package set.a03;

public class Solution031 {
	public void nextPermutation(int[] A) {
		if (A == null || A.length < 2) {
			return;
		}
		
		int i = A.length - 2;
		while (i >= 0 && A[i] >= A[i + 1]) {
			i--;
		}
		
		if (i >= 0) {
			int j = A.length - 1;
			while (A[i] >= A[j]){
				j--;
			}
			swap(A, i, j);
		}
		
		reverse(A, i + 1, A.length - 1);
	}

	private void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

	private void reverse(int[] A, int i, int j) {
		while (i < j) {
			swap(A, i, j);
			i++;
			j--;
		}
	}

}
