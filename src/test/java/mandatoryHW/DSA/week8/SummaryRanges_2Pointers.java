package mandatoryHW.DSA.week8;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges_2Pointers 
{
	/*	1) Initialize three variables, start as 0 , end as 0 and diff as 0
		2) While (end < nums.length)
		3) Diff = nums[end]-nums[start]
		4) If diff == 1
				a. End++
			Else if (diff != 1 and start < end)
				Add nums[start] and nums[end] to the list
			Else if (diff != 1 and start == end)
				Add nums[start] to the list
			Return the list
	 * 
	 * 
	 */
	
	public List<String> summaryRanges(int[] nums)
	{
		int start = 0; int end = 0; int diff = 0;
		List<String> res = new ArrayList<String>();
		while (end < nums.length)
		{
			diff = nums[end] - nums[start];
			if (diff == 1)
			{
				end++;
			} else if(diff != 1 && start < end) {
				res.add(nums[start]+"->"+nums[end]);
				start++;end++;
			} else {
				res.add(String.valueOf(nums[start]));
				start++;end++;
			}
		}
		return res;
	}

}
