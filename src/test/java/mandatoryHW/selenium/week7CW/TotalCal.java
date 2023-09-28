package mandatoryHW.selenium.week7CW;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TotalCal 
{
	/*  1.Understanding the problem to detailed level (clarity on input and output, constraints)
			Yes
		2.Frame Test data (valid, invalid, complex and edge cases)
			Test Data:
				Input: Cal = [1,2,3,4,5], k = 1, upper = 3, lower = 3
				output: 0
				
				#2:
				Input: Cal = [4,2,3,1,3], k = 2, lower = 4, upper = 5
				Output: 1+0+0+0
				
				#3:
				Input: Cal = [1,3,4,2,5,4], k = 3, lower = 5, upper = 6
				Output: 1+1
				
		3.Do you know the Solution?
			Yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
			
		5. Derive Pseudo code in paper (for the best chosen approach)
		    1) Get the input int array, int k and upper and lower int values
		    2) get the array len
		    3) initialize sum variable as 0 and count as 0
		    3) iterate the for loop till array.length
		    4) Iterate the inner loop till i+k -1
		    //k = 2, 0,1
		     *  a) array[j]+array[j+1] should be summed up and keep it in sum
		    	b) if (sum < lower)
		    		count++;
		    	else if (sum > upper)
		    		count++;
		    5) return count	
		
		6. Dry run the pseudo code with all test data from step #2
		
		7.Write the code on notepad
		
		8. Dry run the code with all test data from step #2
		
		9. Write code on IDE (remember to add comments and practice coding standards)
		
		10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
		
		11. Check for any gaps of code optimization (if not optimized already in Step #9)
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void test1()
	{
		int actual = calCount(new int[] {4,2,3,1,3}, 2, 5, 4);
		Assert.assertEquals(actual, 1);
	}
	
	@Test
		public void test2()
		{
			int actual = calCount(new int[] {6,5,0,0}, 2, 5, 1);
			Assert.assertEquals(actual, 0);
		}
	
	@Test
	public void test3()
	{
		int actual = calCount(new int[] {3,2,4,5,5,6,7}, 3, 5, 1);
			Assert.assertEquals(actual, 2);
	}
	
	
	public int calCount(int[] s, int k, int upper, int lower) {
		int sum = 0;
		int calcnt = 0;

		for (int i = 0; i <= s.length-k; i+=k) {
			sum = 0;
			for (int j = i; j < i+k; j++) {
				sum = sum+s[j];
			}
			if (sum < lower)
				calcnt--;
			else if (sum > upper)
				calcnt++;
		}
		return calcnt;
	}

}
