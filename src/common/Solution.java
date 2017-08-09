package common;

public class Solution {
	public enum Testenum{
		Jun, Jul;
	}
	public static void main(String [] args){
		String str = "Jun";
		
		Testenum t = Testenum.valueOf(str);
		
		System.out.println(t.ordinal());
		
		System.out.println(Testenum.valueOf(str));
		
		switch (t){
		case Jun:
			System.out.println("Jun");
			break;
		}
		
	}
}
