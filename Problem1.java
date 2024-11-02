//Taryn Boonpongmanee
//Recursion Problem 1

import acm.program.ConsoleProgram;

public class Problem1 extends ConsoleProgram{
	
	public void run() {
		println(ReverseString("road"));
	}
	
	public String ReverseString(String str) {
		if(str.length() == 0) {
			return str;
		}
		
		return ReverseString(str.substring(1)) +str.substring(0,1);
	}
}

