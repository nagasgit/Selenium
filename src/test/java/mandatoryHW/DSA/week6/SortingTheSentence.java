package mandatoryHW.DSA.week6;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortingTheSentence 
{
		  /* O[2n] notation
		   * 1.Understanding the problem to detailed level (clarity on input and output, constraints) 
					   Yes - 2mins
			
			2.Frame Test data (valid, invalid, complex and edge cases)
			    yes - 5 mins
				 * Test Data:
					Input: Str = "are3 you4 how2 hi1"
					Output: "hi how are you"
				 * Test data 2:
				 * Input - Str = "india3 i1 love2"
				 * Output - "i love india"
			
			3. Do you know the Solution? Yes
			6. Dry run the pseudo code with all test data from step #2
				Yes - 3 mins
			7.Write the code on notepad
				Yes - 3 min
			8. Dry run the code with all test data from step #2
				Yes - 1 min
			9. Write code on IDE (remember to add comments and practice coding standards)
				4 mins
	 * 
	 * 
	 * Pseudo Code:
	 *  Get the input string
	 *  Split the string with " " and save it in an array
	 *  Create an empty string array with the splitted string length
	 *  Iterate each string and if number exists then save the str with that index position
	 *  of the new string array
	 *  convert the array to string return * 
	 * 
	 */
	
	@Test
	public void test1()
	{
		String actual = sortingString("are3 you4 how2 hi1");
		Assert.assertEquals(actual, "hi how are you");
	}
	
	public String sortingString(String s)
	{
		String[] split = s.split(" ");
		String[] result = new String[split.length];
		String str = "";
		
		for (int i = 0; i < split.length; i++) 
		{
			str = "";
			for (int j = 0; j < split[i].length(); j++) {
				char c = split[i].charAt(j);
				if (!Character.isDigit(c))
				{
					str = str + c;
				} else {
					 int val = c - '0';
					result[val-1] = str;
				}
			}
				
		}
		System.out.println(Arrays.toString(result).length());
		String string = Arrays.toString(result).substring(1, Arrays.toString(result).length()-1);
		String str1 = string.replace(',',' ');
		System.out.println(str1.trim().replaceAll("\\s{2,}", " "));
		return str1.trim().replaceAll("\\s{2,}", " ");
	}
}
