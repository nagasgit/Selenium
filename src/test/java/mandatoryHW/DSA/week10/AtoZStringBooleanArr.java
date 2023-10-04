package mandatoryHW.DSA.week10;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AtoZStringBooleanArr 
{
/*  Create a set and iterate the string and add it to the set
 *  and check if set length is equals to 26
 * 
 * 
 * 
 */
	
	@Test
	public void tc()
	{
		boolean actual = atozString("tuvwxyzabcdefghi jklmnopqrs");
		Assert.assertEquals(actual, true);
	}
	
	@Test
	public void tc1()
	{
		boolean actual = atozString("abcdefg");
		Assert.assertEquals(actual, false);
	}
	
	public boolean atozString(String s)
	{
		Set<Character> chars = new HashSet<Character>();
		for (Character ch : s.toCharArray()) 
		{
			if (ch != ' ') {
				chars.add(ch);
			}			
		}
		return chars.size() == 26;
	}
}
