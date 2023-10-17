package mandatoryHW.DSA.week12;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyTicketsTimeTaken {

	/* 
	 * 
	 * Pseudo Code:
	 * 1) Initialize variable, seconds => 0;
	 * 2) Create a Queue
	 * 3) Iterate the loop and add all the indexes to queue
	 * 4) Another loop to iterate till queue is empty
	 * 5) find out the first element in the queue and assign it to ind
	 * 6) ticket[ind]-- and seconds++;
	 * 7) check if ticket[ind] ==0 and ind == k, return seconds;
	 * 8) check if ticket[ind] > 0, add it to the queue and continue.
	 * * 
	 */
	
	@Test
	public void tc1()
	{
		int actual = timeRequiredToBuy(new int[] {5,1,1,1}, 0);
		Assert.assertEquals(actual, 8);
	}
	
	public int timeRequiredToBuy(int[] tickets, int k) {
		int seconds = 0;
		Queue<Integer> res = new LinkedList<>();
		for (int i = 0; i < tickets.length; i++) {
			res.add(i);
		}
		while(!res.isEmpty()) {
			int firstEle = res.poll();
			tickets[firstEle]--;
			seconds++;
			
			if (tickets[firstEle] == 0 && firstEle == k) {
				return seconds;
			}else {
				if (tickets[firstEle] > 0)
					res.add(firstEle);
			}
		}
		return 0;
    }
}
