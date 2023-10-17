package mandatoryHW.DSA.week12;

import java.util.Stack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BackspaceStringCompare {

	/* Pseudo Code:
	 * 1) Create stack 1, iterate all the chars of s and push it 
	 * 	  if (chars == '#') then pop it
	 * 2) Create stack 2, iterate all the chars of t and push it
	 * 	  if (chars == '#') then pop it
	 * 3) check if both strings are equals, return true.
	 * 
	 * 
	 * Test Data:
	 * #1:
	 * s = "ab#c", t = "ad#b#c"
	 * O/P: ac, true
	 * 
	 * #2:
	 * s = "c", t = "b#c"
	 * O/P: c, true
	 * 
	 * #3:
	 * s = "c", t = "c#d"
	 * O/P: c != d, false
	 */
	
	@Test
	public void test1()
	{
		boolean actual = backspaceCompare("ab#c", "c");
		Assert.assertEquals(actual, false);
	}
	
	@Test
	public void test2()
	{
		boolean actual = backspaceCompare("ab#c", "cd#b#a");
		Assert.assertEquals(actual, false);
	}
	
	 public boolean backspaceCompare(String s, String t) {
		
		 Stack<Character> stack1 = new Stack<Character>();
		 Stack<Character> stack2 = new Stack<Character>();
		 
			for (char s1 : s.toCharArray()) {
				if (s1 != '#') {
					stack1.push(s1);
				} else {
					if (!stack1.isEmpty()) {
						stack1.pop();
					}
				}
			}
		 
			for (char s2 : t.toCharArray()) {
				if (s2 != '#') {
					stack2.push(s2);
				} else {
					if (!stack2.isEmpty()) {
						stack2.pop();
					}
				}
			}
		
			if (stack1.equals(stack2))
				return true;
		 
		 return false;   
	 }
	
}
