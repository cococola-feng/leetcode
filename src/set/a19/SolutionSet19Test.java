package set.a19;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionSet19Test {

//	@Test
	public void test191() {
		Solution191 s = new Solution191();
		System.out.println(s.hammingWeight(11));
	}
//	@Test
	public void test0_10() {
		for(int i = 0; i < 100; i++){
			System.out.println((int)(Math.random() * 11));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void test11_20() {
		for(int i = 0; i < 100; i++){
			System.out.println((int)(Math.random() * 21));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
