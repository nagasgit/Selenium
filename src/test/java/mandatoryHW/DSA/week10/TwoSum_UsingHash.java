package mandatoryHW.DSA.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoSum_UsingHash 
{
	//int[] {2,3,4,5}, 9

	public void tc1()
	{
		int[] actual = twoSum(new int[] {2,3,4,5}, 9);
		Assert.assertEquals(actual, new int[] {2,3});
	}
	
	@Test
	public void tc2()
	{
		List<Integer> actual = twoSum_AlternativeAppro(new int[] {1,1,0,3}, 4);
		Assert.assertEquals(actual, Arrays.asList(new int[][] {{0,3},{1,3}}));
	}
	
	public int[] twoSum(int[] nums, int target)
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i <= nums.length-1; i++) {
			if (map.containsKey(target-nums[i])) {
				return new int[] {map.get(target-nums[i]),i};
			}else {
				map.put(nums[i], i);
			}

		}		
		return new int[] {};
	}
	
	
	public List<Integer> twoSum_AlternativeAppro(int[] nums, int target)
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> res = new ArrayList<Integer>();
		int sum;
		for (int i = 0; i <= nums.length - 1; i++) {

			if (map.containsKey(target - nums[i])) {
				res.add(map.get(target - nums[i]));
				res.add(i);
			} else {
				map.put(nums[i], i);
			}

		}
		// return new int[] {};
		return res;
	}
	
}
