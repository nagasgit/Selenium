package mandatoryHW.DSA.week10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.jsonpath.internal.path.ArraySliceOperation.Operation;

public class Operations 
{
	
	@Test
	public void test()
	{		
		List<Integer> arr = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		List<List<Integer>> ranges = Arrays.asList(Arrays.asList(0,9),Arrays.asList(3,5));
		List<Integer> actual = operations(arr, ranges);
		Assert.assertEquals(actual, Arrays.asList(9,8,7,4,5,6,3,2,1,0));
		
	}

	public List<Integer> operations(List<Integer> a, List<List<Integer>> b)
	{
		Integer[] arrayA = new Integer[a.size()];
		arrayA = a.toArray(arrayA);
		int start, end, temp;
	
		for (List<Integer> val : b) 
		{
			start = val.get(0);
			  end = val.get(1);
			  
			  while (start < end)
			  {
				  temp = arrayA[start];
				  arrayA[start] = arrayA[end];
				  arrayA[end] = temp;
				  start++; end--;
			  }
			
		}
		return Arrays.asList(arrayA);
	}
	
}
