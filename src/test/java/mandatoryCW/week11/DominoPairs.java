package mandatoryCW.week11;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DominoPairs 
{
	
	@Test
	public void tc1()
	{
		int actual = dominoPairs(new int[][] {{1,2},{2,1},{3,4},{1,2}});
		Assert.assertEquals(actual, 3);
	}
	
	@Test
	public void tc2()
	{
		int actual = dominoPairs(new int[][] {{1,2},{1,2},{1,1},{1,2},{2,2}});
		Assert.assertEquals(actual, 3);
	}
	
	public int dominoPairs(int[][] dominoes)
	{
		int count = 0, i = 0;

		Map<String, Integer> res = new HashMap<String, Integer>();
		while (i < dominoes.length) {
			String str = "";
			if (dominoes[i][0] > dominoes[i][1]) {
				str = str + dominoes[i][1];
				str = str + dominoes[i][0];
			} else {
				str = str + dominoes[i][0];
				str = str + dominoes[i][1];
			}
			if (res.containsKey(str)) {
				count = count + res.get(str);
			}
			res.put(str, res.getOrDefault(str, 0) + 1);
			i++;
		}
		return count;
	}
}
