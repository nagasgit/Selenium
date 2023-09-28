package mandatoryHW.DSA.week10;

public class LongestPalindromeStr 
{

	/*
	 * #1:
	 * Test Data:
	 * Input: s = "babad"
	 * Output: bab
	 * 
	 * #2:
	 * Input: s = "cbbd"
	   Output: "bb"
	 * 
	 * 
	 * Pseudo Code
	 * Initialize varaibles ==> left as 0 and right as 1
	 * while (right < str.length)
	 * check if first chars are matching
	 * Create a string arr and add left and right
	 * else right++
	 * 
	 * 
	 */
	
	public String longestPalin(String s)
	{
		int left = 0; int right = s.length()-1; int len = 0;
		/*
		 * while (right < s.length()) { if (s.charAt(left) == s.charAt(right)) { len =
		 * Math.max((right+1)-left, len); if ((right+1)-left > len) { String output =
		 * s.substring(left, right+1); //int len = output.length(); } left++;
		 * 
		 * } else { right++; } }
		 */
		
		while (left < right)
		{
			if (s.charAt(left) == s.charAt(right))
			{
				int index1 = left;
				int index2 = right;
				left++;right--;
			}else {
				right--;
			}
		}
		return null;
	}
}
