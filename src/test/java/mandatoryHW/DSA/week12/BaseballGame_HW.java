package mandatoryHW.DSA.week12;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseballGame_HW {

	/* Pseudo Code:
	 * 1) Create a stack 
	 * 2) Iterate a loop and check if str is equals to C
	 * 3) then remove the first ele from stack
	 * 4) else if D, then multiple that first element * 2
	 * 5) else if +, remove the last two element and store it in a var
	 * 6) sum those two variables
	 * 7) else push those str numeric value to stack
	 * 8) iterate the stack and sum all those values. * 
	 */
	public void tc() {
		int actual = baseBallGame(new String[] {"5","2","C","D","+"});
		Assert.assertEquals(actual, 30);
	}
	
	@Test
	public void tc1() {
		int actual = baseBallGame(new String[] {"5","-2","4","C","D","9","+","+"});
		Assert.assertEquals(actual, 27);
	}
	
	public int baseBallGame(String[] operations) {
		Stack<Integer> score = new Stack<Integer>();
		for (String s : operations) {
			if (s.equals("C")) {
				score.pop();
			} else if (s.equals("D")) {
				score.push(2 * (score.peek()));
			} else if (s.equals("+")) {
				int first = score.pop();
				int second = score.pop();
				int add = first + second;
				score.push(second);
				score.push(first);
				score.push(add);
			} else {
				score.push(Integer.parseInt(s));
			}
		}
		int sum = 0;
		// ListIterator<Integer> iterator = score.listIterator();
		for (int i : score) {
			sum += i;
		}
		return sum;
	}
}
