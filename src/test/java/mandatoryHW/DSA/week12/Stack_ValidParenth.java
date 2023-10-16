package mandatoryHW.DSA.week12;

import java.util.Stack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Stack_ValidParenth {

	@Test
	public void test1() {
		boolean actual = validParen("(())");
		Assert.assertEquals(actual, true);
	}
	
	public boolean validParen(String s) {
		  Stack<Character> stack = new Stack<>();

		    for (char c : s.toCharArray()) {
		        if (c == '(' || c == '{' || c == '[') {
		            stack.push(c);
		        	} else {
		            if (stack.isEmpty()) {
		                return false;
		            }

		            char top = stack.pop();

		            if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
		                return false;
		            }
		        }
		    }

		    return stack.isEmpty();
	}
}
