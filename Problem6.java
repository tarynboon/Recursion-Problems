//Taryn Boonpongmanee
//Problem 6

import acm.program.ConsoleProgram;

public class Problm6 extends ConsoleProgram{
	public void run() {
		println("Number of levels of the tower: " + 4);
		TowersOfHanoi(4, 1, 3, 2);
	}
	
	
	public void TowersOfHanoi(int n, int currentPeg, int targetPeg, int otherPeg) {
		if (n == 0) {
			return;
		}
		if (n == 1) {
			println("1 to " + targetPeg);
			return;
		}
		
		TowersOfHanoi(n-1, currentPeg, otherPeg, targetPeg);
		
		println( n + " to " + targetPeg);
		TowersOfHanoi(n-1, otherPeg, targetPeg, currentPeg);
	}
}
