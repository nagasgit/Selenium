package mandatoryHW.RestAssured.CW;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ObjClassPetStore {

	@Test
	public void objPetStore()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2/user";
		PojoClsPetStore obj = new PojoClsPetStore(1,"naga_naga","Nagarajan","MeenakshiSundaram","naga_naga@gmail.com","abc123","7305651385",0);
		
		Response resp = RestAssured.given()		
						.accept("application/json")
						.contentType("application/json")
						.body(obj)
						.log()
						.everything(true)
						.post();
		
		resp.jsonPath().prettyPrint();
		int actual = resp.getStatusCode();
		//System.out.println(resp.getStatusCode());
		//resp.then().assertThat().statusCode(200);
		Assert.assertEquals(actual, 200);
		
		
	}

}
