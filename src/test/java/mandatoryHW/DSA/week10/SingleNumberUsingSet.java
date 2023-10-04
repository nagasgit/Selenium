package mandatoryHW.DSA.week10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleNumberUsingSet 
{
	/* Pseudo Code:
	 *  1) Create a set
	 *  2) iterate the loop till the length
	 *  	a) if (set.add(index) == false)
	 *  	b) return the i
	 */
	
	@Test
	public void tc()
	{
		int actual = singleNum(new int[] {2,2,1,3,1});
		Assert.assertEquals(actual, 3);
	}
	
	public int singleNum(int[] num)
	{
		//Arrays.sort(num);
		Set<Integer> res = new HashSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			
			if (res.contains(num[i])) {
				res.remove(num[i]);
			}else {
				res.add(num[i]);
			}
		}
		
		return res.iterator().next();
	}
}
