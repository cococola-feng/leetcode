package set.a29;

public class Solution299 {
	public String getHint(String secret, String guess) {
        int countA = 0, countB = 0;
        
        if(secret == null || guess == null) return countA + "A" + countB + "B"; 
        
        int[] countArrSecret = fromString(secret);
        int[] countArrGuess = fromString(guess);
        
        char[] charArrSecret = secret.toCharArray();
        char[] charArrGuess = guess.toCharArray();
        
        for(int i = 0; i < charArrSecret.length; i++){
        	if(charArrSecret[i] == charArrGuess[i]){
        		int index = charArrSecret[i] - '0';
        		countArrSecret[index]--;
        		countArrGuess[index]--;
        		countA++;
        	}
        }
        
        for(int i = 0; i < 10; i++){
        	countB += Math.min(countArrSecret[i], countArrGuess[i]);
        }
        
        return countA + "A" + countB + "B";
    }
	
	private int[] fromString(String data){
		int[] res = new int[10];
		for(char ch : data.toCharArray()){
			res[ch - '0']++;
		}
		return res;
	}
}
