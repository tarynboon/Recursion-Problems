//Taryn Boonpongmanee
//Recursion Problem 2

import acm.program.ConsoleProgram;

public class Problem2 extends ConsoleProgram{
	public void run() {
		println(SumOfDigits(593));
	}
	
	public int SumOfDigits(int x) {
		if(x == 0) {
			return 0;
		} else {
			int digit = x%10;
			return digit  + SumOfDigits(x/10);
		}
	}
}
