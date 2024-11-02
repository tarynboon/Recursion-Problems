//Taryn Boonpongmanee
//2.10.22
//Recursion Problem 5

import java.util.ArrayList;
import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem5 extends ConsoleProgram{
	public void run() {
		ArrayList<Integer> var = new ArrayList<Integer>(Arrays.asList(3, 1, 2, 3, 0));
		println(canSolve(0, var));
	}
	
	public boolean canSolve(int start, ArrayList<Integer> squares) {
		boolean [] marker = new boolean [squares.size()];
		return checkEachSide(start, squares, marker);
	}
	
	private boolean checkEachSide(int start, ArrayList<Integer> squares, boolean[] marker) {
		
		if(start < 0 || start >= squares.size() || marker[start]) {
			return false;
		}
		
		if(squares.get(start) == 0) {
			return true;
		}
		
		marker[start] = true;
		boolean leftCheck = checkEachSide(start - squares.get(start), squares, marker);
		boolean rightCheck = checkEachSide(start + squares.get(start), squares, marker);
		
		return (leftCheck || rightCheck);
	}
}
