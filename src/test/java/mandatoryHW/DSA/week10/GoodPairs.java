package mandatoryHW.DSA.week10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoodPairs 
{
	
	public void tc()
	{
		int actual = goodPairs(new int[] {1,2,3,1,1,3});
		Assert.assertEquals(actual, 4);
	}
	
	@Test
	public void tc1()
	{
		int actual = goodPairsUsingMap(new int[] {1,2,3,1,1,3});
		Assert.assertEquals(actual, 4);
	}
	
	public int goodPairs(int[] nums) 
	{
		int count = 0;
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = i+1; j < nums.length; j++)
			{
				if (nums[i] == nums[j]) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	
	public int goodPairsUsingMap(int[] nums)
	{
		int count = 0;
		Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			hashmap.put(nums[i], hashmap.getOrDefault(nums[i], 0)+1);
		}
		for (int num : hashmap.keySet()) 
		{
			int val = hashmap.get(num);
			count = count + (val*(val-1)/2);
		}
		return count;
	}
}
