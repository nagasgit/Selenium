package mandatoryHW.DSA.week10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MergeArrays2 
{
	

	public void test1() {
		int[] actual = mergeArrays(new int[] {1,2,3}, new int[] {2,5,5});
		Assert.assertEquals(actual, new int[] {1,2,2,3,5,5});
	}
	
	@Test
	public void test2() {
		int[] actual = mergeArrays(new int[] {3,4,5}, new int[] {2,5,5});
		Assert.assertEquals(actual, new int[] {2,3,4,5,5,5});
	}
	
	public int[] mergeArrays(int[] a, int[] b)
	{
		 /* Pseudo Code:
		 * Create a new array with the length of a + b
		 * initialize two variables => left and right as 0
		 * Iterate using while loop while (left < a.length && right < b.len)
		 */
		
		int[] res = new int[a.length + b.length];
		int left = 0;
		int right = 0;

		for (int i = 0; i < (a.length + b.length); i++) {
			if ((left < a.length) && (right < b.length)) {
				if (a[left] < b[right]) {
					res[i] = a[left];
					left++;
				} else {
					res[i] = b[right];
					right++;
				}
			} else if (left == a.length) {
				res[i] = b[right];
				right++;
			} else if (right == b.length) {
				res[i] = a[left];
				left++;
			}
		}
		return res;
	}
}
