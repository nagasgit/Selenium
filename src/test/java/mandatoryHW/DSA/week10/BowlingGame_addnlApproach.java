package mandatoryHW.DSA.week10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BowlingGame_addnlApproach 
{
	/* Time - O[n]
	 * Space - O[1]
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes
	   2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data:
		  #1:
		  input: [4,10,7,9], [6,5,2,3]
		  output: 1
		  
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			Pseudo Code:
				1) Initialize variables => sum1, sum2, p1ind, p2ind as 0
				2) Iterate the loop for either player 1 or 2 length
					a) increment the sum with every index values of player 1 & 2
					b) check if p1ind-- is greater than 0, then increment the player1[i]again to sum
					c) check if p2ind-- is greater than 0, then increment the player2[i]again to sum
					d) if player1[i] is equals to 10 then set the p1ind as 2
					e) if player2[i] is equals to 10 then set the p2ind as 2
			
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
		int sum1 = 0;
		int sum2 = 0;
		int p1ind = 0;
		int p2ind = 0;
		for (int i = 0; i < player2.length; i++) {
			sum1 += player1[i];
			sum2 += player2[i];
			if (p1ind-- > 0) {
				sum1 += player1[i];
			}
			if (p2ind-- > 0) {
				sum2 += player2[i];
			}
			if (player1[i] == 10) {
				p1ind = 2;
			}
			if (player2[i] == 10) {
				p2ind = 2;
			}
		}
		return sum1 > sum2 ? 1 : sum2 > sum1 ? 2 : 0;
	}
}
