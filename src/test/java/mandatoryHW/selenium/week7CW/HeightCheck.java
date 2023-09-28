package mandatoryHW.selenium.week7CW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HeightCheck 
{
/*
 * Get the int[] array
 * Sort the array and store it in another array
 * compare each index values in two array and add the indices where mismatch occurs
 * return the array
 * 
 */
	@Test
	public void test1()
	{
		Object[] actual = heightCheck(new int[] {1,1,4,2,1,3});
		Assert.assertEquals(actual, new int[] {2,4,5});
	}
	
	public Object[] heightCheck(int[] heights)
	{
		//Arrays.sort(heights);
		int[] expected = new int[heights.length];
		for (int i = 0; i < heights.length; i++) 
		{
			expected[i] = heights[i];
		}
		
		Arrays.sort(expected);
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < expected.length; i++) 
		{
			if (expected[i] != heights[i])
			{
				res.add(i);
			}
		}
		
		Object[] result = res.toArray();
		System.out.println(Arrays.toString(result));
		return result;
	}
}
