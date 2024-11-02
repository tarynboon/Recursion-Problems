//Taryn Boonpongmanee
//2.10.22
//Recursion Problem 3

import acm.program.ConsoleProgram;

public class Problem3 extends ConsoleProgram{
	public void run() {
		PrintInBinary(117);
	}
	
	public void PrintInBinary(int num) {
		if(num ==0) {
			return;
		}
		
		PrintInBinary(num/2);
		print(num % 2);
	}
}
