package mandatoryHW.DSA.week6;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FiboSeries 
{
	/* Pseudo Code
	 * Get the input n to print the fibo series
	 * Create an empty array with the n -1 length
	 * array [0] to be assigned with value 0 and array[1] to be assigned with 1
	 * iterate the loop from 2 till n
	 * 	1) array[i] to be with the sum of i -2 and i -1 array values
	 * return the array
	 * 
	 */
	
	@Test
	public void test1()
	{
		int[] actual = fiboS(10);
		Assert.assertEquals(actual, new int[] {0,1,1,2,3,5,8,13,21,34});
	}
	
	public int[] fiboS(int n) {
		int[] fibo = new int[n];
		fibo[0] = 0;
		fibo[1] = 1;
		for (int i = 2; i < n; i++) {
			fibo[i] = fibo[i - 2] + fibo[i - 1];
		}
		return fibo;
	}
}
