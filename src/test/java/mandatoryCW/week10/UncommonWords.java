package mandatoryCW.week10;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.hamcrest.text.IsEmptyString;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UncommonWords 
{
	/*
	 * Pseudo Code:
	 * 1) Split the string 1 and string s2 and create an string array
	 * 2) Create a map and add the string 1 array to the map
	 * 3) check if string1 map contains string 2 words then remove it
	 * 4) return the uncommon map
	 * 
	 * Test Data:
	 *  #1:
	    Input: s1 = "this apple is sweet", s2 = "this apple is sour"
    	Output: ["sweet","sour"]
		
		#2:
		Input: s1 = "apple apple", s2 = "banana"
		Output: ["banana"]
	 * 
	 * 
	 */
	
	
	public void test1()
	{
		String[] actual = uncommonWords("this is apple", "this is fruit");
		Assert.assertEquals(actual, new String[] {"apple","fruit"});
	}

	@Test
	public void test2()
	{
		String[] actual = uncommonWords("this is fruit", "this this banana");
		Assert.assertEquals(actual, new String[] {""});
	}
	public String[] uncommonWords(String s1, String s2)
	{
		Map<String, Integer> unique = new LinkedHashMap<String, Integer>();
		String[] str1 = s1.split(" ");
		String[] str2 = s2.split(" ");
		for (int i = 0; i < (str1.length > str2.length ? str1.length : str2.length); i++) {
			unique.put(str1[i], unique.getOrDefault(str1[i], 0)+1);
			if (str2[i] == null)
				break;
			if (str2[i] != null)
			{
				if (unique.containsKey(str2[i])) {
					unique.remove(str2[i]);
				}else {
					unique.put(str2[i], unique.getOrDefault(str2[i], 0)+1);
				}
			}	
		}
		
		String output = "";
		for (Entry<String, Integer> entry : unique.entrySet()) {
			if (entry.getValue() > 1) {
				unique.remove(entry.getKey());
			}
			System.out.println(unique);
			/*
			 * String key1 = entry.getKey()+" "; output = output+key1;
			 */
		}
		
		for (Entry<String, Integer> entry : unique.entrySet()) {
			
			 String key1 = entry.getKey()+" "; 
			 output = output+key1;
		
		}
		
		

		return output.split(" ");
	}}
