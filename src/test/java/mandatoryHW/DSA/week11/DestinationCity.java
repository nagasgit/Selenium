package mandatoryHW.DSA.week11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DestinationCity 
{
	/* https://leetcode.com/problems/destination-city/
	/* Time - O[n/2]
	 * Space - 
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes (2 min)
		2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data: (2 min)
		  #1:
			 * Input: paths = [["B","C"],["D","B"],["C","A"]]
			   Output: "A"
		  
		  #2:
		  input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
		  output: Sao Paulo
		  
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			Pseudo Code: (5 mins)
			 1) Create a hashset and Arraylist
			 2) iterate the paths with source, and add all the 0th index values 
			 	to set
			 3) Iterate the paths with destination,and add the destination
			    which is not exist in set
			 4) Return the list

		6.Dry run the pseudo code with all test data from step #2 (2 mins)
		  yes
		7.Write the code on notepad (2 mins)
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
		String actual = detnCity(Arrays.asList(Arrays.asList("B","C"),Arrays.asList("D","B"),
				Arrays.asList("C","A")));
		Assert.assertEquals(actual, "A");
	}
	public String detnCity(List<List<String>> paths) 
	{
		Set<String> destn = new HashSet<String>();
		List<String> res = new ArrayList<String>();
		for (List<String> source : paths) 
		{
			if (!destn.contains(source.get(0)))
				destn.add(source.get(0));		
		}
		for (List<String> destination : paths) 
		{
			if (!destn.contains(destination.get(1)))
				res.add(destination.get(1));
		}
		return res.iterator().next();
	}
}
