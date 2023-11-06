package mandatoryCW.restAssured;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BaseOfBooker {
	public static String baseUri = "https://restful-booker.herokuapp.com";
	public static String tokenVal;
	public static int bookingIdVal;
	public static Response resp;
	public static String firstname;
	
	@BeforeMethod
	public void setUp()
	{
		RestAssured.baseURI=baseUri;
		RestAssured.authentication = RestAssured.preemptive().basic("admin", "password123");
		//RestAssured.authentication = RestAssured.preemptive().basic("admin", "password123");
		
	}
}

