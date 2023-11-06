package mandatoryHW.DSA.week11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsomarphicString 
{
	/*https:https://leetcode.com/problems/isomorphic-strings/
	/* Time - 
	 * Space - 
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes (1 min)
		2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data: (1 min)
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			Pseudo Code: (2 mins)
				1) Check if s.length and t.length is not equals
				2) if both are equals, create a two set 
				3) iterate the loop with s.length
				4) check the size of set size after adding each chars in the string
				5) if not matches, return false
	
		6.Dry run the pseudo code with all test data from step #2 (1 mins)
		  yes
		7.Write the code on notepad (1 mins)
		  yes
		8. Dry run the code with all test data from step #2
		  yes
		9. Write code on IDE (remember to add comments and practice coding standards)
		  yes
		10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE  
		11. Check for any gaps of code optimization (if not optimized already in Step #9)
	 * 
	 */
	

	public void tc1()
	{
		boolean actual = isomarphicStr("egg", "add");
		Assert.assertEquals(actual, true);
	}
	
	
	public void tc2()
	{
		boolean actual = isomarphicStr("foo", "bar");
		Assert.assertEquals(actual, false);
	}
	
	@Test
	public void tc3()
	{
		boolean actual = isomarphicStr("bbbaaaba", "aaabbbba");
		Assert.assertEquals(actual, false);
	}
	
	public boolean isomarphicStr(String s, String t)
	{
		if(s.length() != t.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++) 
        {
            // if contains key but with different value
            if(map.containsKey(s.charAt(i))) {
                if(!map.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            }else{
                // contains value with different key
                if(map.containsValue(t.charAt(i))) {
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
	}
}
