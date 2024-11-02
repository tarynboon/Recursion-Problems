//Taryn Boonpongmanee
//2.10.22
//Recursion Problem 4

import acm.program.ConsoleProgram;

public class Problem4 extends ConsoleProgram{
	public void run() {
		println(GCD(63, 54));
	}
	
	public int GCD(int x, int y) {
		if(x % y == 0) {
			return y;
		}
		
		return GCD(y, x% y);
	}
}
