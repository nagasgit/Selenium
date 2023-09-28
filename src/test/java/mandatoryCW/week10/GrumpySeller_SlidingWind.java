package mandatoryCW.week10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GrumpySeller_SlidingWind 
{
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public void tc1()
	{
		int actual = grumpySeller(new int[] {1,0,1,2,1,1,7,5}, new int[] {0,1,0,1,0,1,0,1}, 3);
		Assert.assertEquals(actual, 16);
	}

	@Test
	public void tc2()
	{
		int actual = grumpySeller(new int[] {8,8}, new int[] {1,0}, 2);
		Assert.assertEquals(actual, 16);
	}
	
	
	public void tc3()
	{
		int actual = grumpySeller(new int[] {1,2,3,4}, new int[] {0,1,1,0}, 2);
		Assert.assertEquals(actual, 8);
	}
	
	public int grumpySeller(int[] customers, int[] grumpy, int minutes)
	{
		int currentSum = 0; int pointer = 0;int temp = 0;
		int unsatisfied = 0;
		while (pointer < minutes)
			{
				if (grumpy[pointer] == 0)
				{
					currentSum = currentSum + customers[pointer++];
				} else{
					temp = temp + customers[pointer++];
				}
				unsatisfied = Math.max(temp, unsatisfied);
			}
			while (pointer < grumpy.length)
			{
				if (grumpy[pointer - minutes] != 0)
				   temp = temp - customers[pointer - minutes];
				if (grumpy[pointer] == 0)
					currentSum = currentSum + customers[pointer];
				else
					temp = temp + customers[pointer];
				pointer++;
				unsatisfied = Math.max(temp, unsatisfied);
			}	
				return currentSum + unsatisfied;    
}

}