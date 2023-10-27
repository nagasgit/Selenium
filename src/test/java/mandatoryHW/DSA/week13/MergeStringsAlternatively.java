package mandatoryHW.DSA.week13;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MergeStringsAlternatively {

	
	@Test
	public void tc1() {
		String actual = mergeStrings("abc", "efg");
		Assert.assertEquals(actual, "aebfcg");
	}
	
	@Test
	public void tc2() {
		String actual = mergeStrings("ac", "efg");
		Assert.assertEquals(actual, "aecfg");
	}
	
	@Test
	public void tc3() {
		String actual = mergeStrings("ac", "a");
		Assert.assertEquals(actual, "aac");
	}
	
	public String mergeStrings(String word1, String word2) {
		
		 	int left = 0;
	        int right = 0;
	        String str = "";

	        while (left < word1.length() || right < word2.length()){

	            if (left < word1.length() &&  right < word2.length()){
	                str = str + word1.charAt(left) + word2.charAt(right);
	                left++; right++;
	            } else if (left == word1.length() &&  right < word2.length()){
	                 str = str + word2.charAt(right);
	                 right++;
	            } else if (left < word1.length() &&  right == word2.length()){
	                 str = str + word1.charAt(left);
	                 left++;
	            }
	        }
	    return str;
	}
}
