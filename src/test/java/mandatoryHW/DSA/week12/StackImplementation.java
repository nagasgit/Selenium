package mandatoryHW.DSA.week12;

import java.util.Stack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StackImplementation {

		/* Pseudo Code:
		 * 1) initialize stack
		 * 2) for open braces add it to stack
		 * 3) for closed braces, we need to validate if equalient 
		 * 	  open braces in stack first element
		 * 4) if so pop the stack
		 * 5) else return false;
		 * 
		 * 
		 * 
		 * 
		 */
	
	
	public void test1() {
		boolean actual = isValid("(())");
		Assert.assertEquals(actual, true);
	}
	
	@Test
	public void test2() {
		boolean actual = isValid("(}");
		Assert.assertEquals(actual, false);
	}
	
	public void test3() {
		boolean actual = isValid(")()");
		Assert.assertEquals(actual, false);
	}
		
	public boolean isValid(String s) {
			Stack<Character> chars = new Stack<Character>();
			for (char ch : s.toCharArray()) {
				
				if (ch == '(' || ch == '[' || ch == '{') {
					chars.push(ch);
				} else {
					if (chars.isEmpty()) {
						return false;
					}				
					char remove = chars.pop();
					if ((ch == ')') && (remove != '(') || (ch == ']') && (remove != '[')
							|| (ch == '}') && (remove != '{')) {
						return false;
					}
			}
	    }
			return chars.isEmpty();
}
}