package mandatoryHW.DSA.week10;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AtoZStringUsingSet 
{
/*  Create a set and iterate the string and add it to the set
 *  and check if set length is equals to 26
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
		Boolean[] arr = new Boolean[26];
		for (char ch : s.toCharArray()) {
			if (ch != ' ') {
				arr[ch-'a'] = true;
			}
		}
		
		for (Boolean res : arr) {
			if (res != true) {
				return false;
			}
		}
		
		return true;
	}
}
