package mandatoryHW.DSA.week10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BowlingGame 
{
	/* Time - O[n]
	 * Space - O[1]
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes
	   2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data:
		  #1:
		  input: 
		  output: 
		  
		  #2:
		  input: 
		  output: 
		  
		  #2:
		  input: 
		  output: 
		  
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			Pseudo Code:
			
		6.Dry run the pseudo code with all test data from step #2
		  yes
		7.Write the code on notepad
		  yes
		8. Dry run the code with all test data from step #2
		  yes
		9. Write code on IDE (remember to add comments and practice coding standards)
		  yes
		10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
		  
		11. Check for any gaps of code optimization (if not optimized already in Step #9)
	 * 
	 */
	
	@Test
	public void tc1()
	{
		int actual = bowlingGame(new int[] {4,10,7,9}, new int[] {6,5,2,3});
		Assert.assertEquals(actual, 1);
	}
	
	public int bowlingGame(int[] player1, int[] player2)
	{
		int left = 0; int right = 0; 
		//int sum1 = player1[left]; int sum2 = player2[right];
		int sum1 = 0; int sum2 = 0;
		int p1ind = 0; int p2ind = 0;
		
		while (left < player1.length && right < player2.length)
		{
			if (p1ind == 1)
				player1[left] = 2 * player1[left];
			if (p2ind == 1)
				player2[right] = 2 * player2[right];
			
			if (sum1 == sum2)
			{
				sum1 = sum1 + player1[left];
				sum2 = sum2 + player2[right];right++;left++;
			}else if (sum1 > sum2) {
				sum2 = sum2 + player2[right];
				if (player2[right] == 10)
					p2ind = 1;
				if (right == player2.length)
				break;
				right++;
			} else {
				sum1 = sum1 + player1[left];
				if (player1[left] == 10)
					p1ind = 1;
				if (left == player1.length)
					break;
				left++;
			}
		}
		if (sum1 > sum2)
		return 1;
		else
		return 2;
		
	}
}
