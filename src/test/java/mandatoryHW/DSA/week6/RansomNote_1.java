package mandatoryHW.DSA.week6;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RansomNote_1 {
	
	@Test
	public void test() {
		boolean actual = ransomN("aa", "ab");
		Assert.assertEquals(actual, false);
	}

	public boolean ransomN(String ransomNote, String magazine) {

		//Map<Character, Integer> str1 = new HashMap<Character, Integer>();
		Map<Character, Integer> str2 = new HashMap<Character, Integer>();


		for (int i = 0; i < magazine.length(); i++) {
			str2.put(magazine.charAt(i), str2.getOrDefault(magazine.charAt(i), 0) + 1);
			// str2.size();
			System.out.println(str2);
		}
		
		for (int i = 0; i < ransomNote.length(); i++) 
		{
			if (!str2.containsKey(ransomNote.charAt(i)) || (str2.get(ransomNote.charAt(i)) <= 0)) {
				return false;
			}else {
				str2.put(ransomNote.charAt(i), str2.get(ransomNote.charAt(i))-1);
			}
		//str2.put(ransomNote.charAt(i), str2.get(ransomNote.charAt(i)-1));
		}



		return true;
	}

}
