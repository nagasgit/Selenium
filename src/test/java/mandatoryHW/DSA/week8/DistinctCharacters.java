package mandatoryHW.DSA.week8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistinctCharacters 
{
	/* Time - O[n/2]
	 * Space - O[1]
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes
		2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data:
		  #1:
		  input: xyzzax
		  output:  2 [xyz,yzz,zza,zax]
		  
		  #2:
		  input: xyzxyz
		  output: 4
		  
		  #3:
		  input:  xxx
		  output: 0
		  
		  #4:
		  input:  yyzzxx
		  output: 0
		  
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			Pseudo Code:
			1) get the input string and initialize the variable pointer as 0, count as 0
			2) iterate the loop till string length - 3 
				a) if (pointer < string length - 3) then
					  str = s.substring(pointer, (len-3)+pointer)
		  		   else
		  			  str = s.substring(pointer)
		  			  
		  		b) if (str.chartAt(pointer) != str.chartAt(pointer+1)
		  		       && str.chartAt(pointer+1) != str.chartAt(pointer+2)
		  		       && str.chartAt(pointer+2) != str.chartAt(pointer))
		  		       count++;
		  		       pointer++;
		  		       
		  	3) return count;
		6.Dry run the pseudo code with all test data from step #2
		  yes
		7.Write the code on notepad
		  yes
		8. Dry run the code with all test data from step #2
		  yes
		9. Write code on IDE (remember to add comments and practice coding standards)
		  yes
		10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
		  
		11. Check for any gaps of code optimization (if not optimized already in Step #9)
	 * 
	 */
	@Test
	public void tc1()
	{
		int actual = distinctChars("xyzzyx");
		Assert.assertEquals(actual, 2);
	}
	
	@Test
	public void tc2()
	{
		int actual = distinctChars("xyzxyz");
		Assert.assertEquals(actual, 4);
	}
	
	@Test
	public void tc3()
	{
		int actual = distinctChars("xx");
		Assert.assertEquals(actual, 0);
	}
	
	public int distinctChars(String s)
	{
		int pointer = 0; int count = 0;
		String subs;
		while (pointer <= s.length()-3)
		{
			if (pointer < s.length()-3) {
				subs = s.substring(pointer, (s.length()-3)+pointer);
			}else {
				subs = s.substring(pointer);
			}
			int i =0;
			if (subs.charAt(i) != subs.charAt(i+1)
		  		       && subs.charAt(i+1) != subs.charAt(i+2)
		  		       && subs.charAt(i+2) != subs.charAt(i)) {
				count++;
			}
			pointer++;		  		          
		}
		return count;
	}
}
