package mandatoryHW.DSA.week7;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShuffledString 
{	
	/*  1.Understanding the problem to detailed level (clarity on input and output, constraints)
	  Yes
		2.Frame Test data (valid, invalid, complex and edge cases)
	  Test Data:
		  #1:
		  input: 
		  output:  
		  
		  #2:
		  input: 
		  output: 
	  
		3.Do you know the Solution?
	  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
	  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			a) Get the inputs, String and int[]
			b) Create a map 
			c) iterate the loop till string length
				1) add string chars and array indexes
			d) Create a res array with the string length
			e) assign the map values to new string array
			f) convert the string array to string
	       
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
	public void test1()
	{
		String actual = shuffledStr("codeleet", new int[] {4,5,6,7,0,2,1,3});
		Assert.assertEquals(actual, "leetcode");
	}
	
	public String shuffledStr(String s, int[] indices)
	{
		Map<Integer, Character> map = new TreeMap<Integer, Character>();
		
		for (int i = 0; i < s.length(); i++) 
		{
			map.put(indices[i], s.charAt(i));
		}
		System.out.println(map.values().toString());
		
		String result = map.values().toString();
		//result(',', ' ');
		String res = result.replace(',', ' ');
		//System.out.println(res.trim().replaceAll("\\s", ""));
		String substring = res.substring(1, res.length()-1).replaceAll("\\s{2,}", "");
		//System.out.println(substring.trim().replaceAll("\\s{2,}", ""));
		return substring;
	}
}
