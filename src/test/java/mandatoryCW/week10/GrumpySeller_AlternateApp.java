package mandatoryCW.week10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GrumpySeller_AlternateApp 
{
	/*
	 * Pseudo Code:
	 * 1) Initialize variables ==> satisfiedSum, unsatisfiedSum, maxUnsatisfied and left as 0
	 * 2) Iterate the for loop till customers length
	 * 		a) check if each index of grumpy is 1 or 0, add it to satisfied if its 0 else add 
	 * 		it to unsatisfied
	 * 		b) another if condition to check if (i - left)+1 is greater than minutes
	 * 		c) when it matches, check if grumpy of left is 1, and decrement the left index values 
	 * 			from unsatisfied total
	 * 		d) check if max between unsatisfied and maxunsatisfied and save it to maxunsatisfied
	 * 3) finally return satisfied + maxunsatisfied
	 */
	//Customers {1,0,1,2,1,1,7,5}, grumpy {0,1,0,1,0,1,0,1}, minutes - 3
	
	@Test
	public void tc1() {
		int actual = grumpySeller(new int[] { 1, 0, 1, 2, 1, 1, 7, 5 }, new int[] { 0, 1, 0, 1, 0, 1, 0, 1 }, 3);
		Assert.assertEquals(actual, 16);
	}

	public int grumpySeller(int[] customers, int[] grumpy, int minutes) {
		int left = 0;
		int satisfied = 0;
		int unsatisfied = 0;
		int maxunsatisfied = 0;

		for (int i = 0; i < grumpy.length; i++) {
			if (grumpy[i] == 0) {
				satisfied = satisfied + customers[i];
			} else {
				unsatisfied = unsatisfied + customers[i];
			}

			if ((i - left + 1) > minutes) {
				if (grumpy[left] == 1) {
					unsatisfied = unsatisfied - customers[left];
				}
				left++;
			}
			maxunsatisfied = Math.max(maxunsatisfied, unsatisfied);
		}

		return satisfied + maxunsatisfied;
	}

}
