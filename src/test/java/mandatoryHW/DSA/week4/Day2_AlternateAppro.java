package mandatoryHW.DSA.week4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day2_AlternateAppro {
	
	/*
	 * Pseudo Code:
	 * 1) Get the input array and sort the array
	 * 2) Create a map and add all the values into it using for loop
	 * 3) Check if map contains i value and if map.get(i) == 2
	 * 								then dup = i
	 * 			else missingVal = i
	 * 4) return new int[] {dup, missingVal}
	 * 
	 */
	
	@Test
	public void test1()
	{
		int[] actual = arrMissingVal(new int[] {8,7,5,5,4,3,2,1});
		System.out.println(Arrays.toString(actual));
		Assert.assertEquals(actual, new int[] {5,6});
	}
	
	public int[] arrMissingVal(int[] nums)
	{
		//Arrays.sort(nums);
		//System.out.println(Arrays.toString(nums));
		Map<Integer, Integer> mVal = new HashMap<Integer, Integer>();
		int d = -1;
		int m = 1;
 		for (int n : nums) {
			mVal.put(n, mVal.getOrDefault(n, 0)+1);
			System.out.println(mVal);
		}
 		
 		for (int i = 1; i < nums.length; i++) {
 			if (mVal.containsKey(i))
 			{
 				if(mVal.get(i) == 2)
 				{
 					d = i;
 				}
 			} else {
 				m = i;
 			}
			
		}
		
		return new int[] {d,m};
	}

}
