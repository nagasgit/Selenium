package mandatoryCW.week11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IntersectionOfTwoArrs 
{
	
	@Test
	public void test1()
	{
		int[] res = interOfArrs(new int[] {1,2,2,1}, new int[] {2,2});
		Assert.assertEquals(res, new int[] {2});
	}
	
	@Test
	public void test2()
	{
		int[] res = interOfArrs(new int[] {9,4}, new int[] {4,9,4});
		Assert.assertEquals(res, new int[] {4,9});
	}
	public int[] interOfArrs(int[] nums1, int[] nums2)
	{
		 Set<Integer> res = new HashSet<Integer>();
		 Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		 
	        for(int i = 0; i < nums1.length; i++)
	        {
	            map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);  
	        }
	        
	        for (int i = 0; i < nums2.length; i++) {
				if (map.containsKey(nums2[i])){
					res.add(nums2[i]);
				}
			}
	        System.out.println(res);
	        
	        int[] result = new int[res.size()];
	        int index = 0;
	        for (int num : res) {
				result[index++] = num;
			}

		return result;
	}

}
