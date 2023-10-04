package mandatoryHW.DSA.week10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class EmployeeDetails 
{
	@Test
	public void tc1()
	{
		Map<Object, Object> empDetails = new LinkedHashMap<Object, Object>();
		empDetails.put("Nagarajan", 36);
		empDetails.put("Karthikeyan", 36);
		empDetails.put("Viswa", 30);
		for (Object keyVal : empDetails.keySet()) {
			Object value = empDetails.get(keyVal);
			System.out.println(keyVal + ": " + value);
		}
	}
}
