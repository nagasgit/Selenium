package mandatoryCW.restAssured;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BookerApi extends BaseOfBooker {
	
	@Test (dependsOnMethods = "mandatoryCW.restAssured.BookerApi.ping")
	public void generateToken() 
	{
		//RestAssured.baseURI = baseUri;
		Pojo_CreateToken token = new Pojo_CreateToken("admin", "password123");
		Pojo_TokResponse tokRes = new Pojo_TokResponse(tokenVal);
		Response tokVal = RestAssured.given()
				   					.contentType("application/json")
				   					.body(token)
				   					.log()
				   					.all()
				   					.post("auth");
		tokVal.jsonPath().prettyPrint();
		tokenVal = tokVal.jsonPath().get("token");
		//tokVal.then().assertThat().statusCode(200);
		int statusCode = tokVal.getStatusCode();
		System.out.println(statusCode);
		System.out.println(tokenVal);
		Assert.assertEquals(statusCode, 200);	
		
		/*Deserializarion*/
		Pojo_TokResponse respToken = tokVal.getBody().as(Pojo_TokResponse.class);
		//Pojo_TokResponse aa = tokVal.getBody().as(List<Pojo_TokResponse.class>);
		String deSerializedTok = respToken.getToken();
		System.out.println(deSerializedTok);
	}
	
	@Test
	public void ping()
	{
		Response getResp = RestAssured.given()
						              .contentType("application/json")
						              .get("ping");
		getResp.prettyPrint();
		getResp.then().assertThat().statusCode(201);
	}
	
	@Test (dependsOnMethods = "mandatoryCW.restAssured.BookerApi.createBooking")
	public void getBookingIds()
	{
		Response getBookingResp = RestAssured.given()
				   							 .contentType("application/json")
				   							 .log()
				   							 .all()
				   							 .get("booking");
		getBookingResp.jsonPath().prettyPrint();
		//int statusCode = getBookingResp.statusCode();
		getBookingResp.then().assertThat().statusCode(200);
		
		//Deserialization
		PojoGetResBookingIds[] bIds = getBookingResp.getBody().as(PojoGetResBookingIds[].class);
		//System.out.println(bIds[5]);
		int length = bIds.length;
		System.out.println(length);
		
		System.out.println("Booking id is:"+ bIds[5].getBookingid());
		
	}
	
	@Test (dependsOnMethods = "mandatoryCW.restAssured.BookerApi.generateToken")
	public void createBooking()
	{
		
		PojoBookingDates bookingdates = new PojoBookingDates("2023-03-09", "2024-04-10");
		Pojo_CreateBooking create = new Pojo_CreateBooking("Naga", "M", 2000, false,bookingdates ,"Special breakfast");
		
		Response createResp = RestAssured.given()
									     .accept("application/json")
									     .contentType("application/json")
									     .body(create)
										 .log()
										 .all()
										 .post("booking");
		
		createResp.jsonPath().prettyPrint();
		//int actual = createResp.statusCode();
		createResp.then().assertThat().statusCode(200);
		bookingIdVal = createResp.jsonPath().getInt("bookingid");
		System.out.println("Booking ID is: "+ bookingIdVal);
		
		//Deserialization
		//Pojo_BookingIds bids = new Pojo_BookingIds(bookingID, create)
		Pojo_BookingIds bookingResp = createResp.getBody().as(Pojo_BookingIds.class);
		int bid = bookingResp.getBookingid();
		int totalprice = bookingResp.getBooking().getTotalprice();
		String additionalneeds = bookingResp.getBooking().getAdditionalneeds();	
		firstname = bookingResp.getBooking().getFirstname();
		System.out.println(additionalneeds);
		System.out.println(totalprice);
	}
	
	
	/*
	 * public Pojo_CreateBooking getBookingBody() { Pojo_CreateBooking book = new
	 * Pojo_CreateBooking(); //book
	 * 
	 * return null;
	 * 
	 * }
	 */
	
	@Test (dependsOnMethods = "mandatoryCW.restAssured.BookerApi.createBooking")
	public void getBooking()
	{
		Response response = RestAssured.given()
									   .basePath("/booking/"+bookingIdVal)
									   .accept("application/json")
									   .log()
									   .all()
									   .get();
		
		//response.prettyPrint();
		Pojo_CreateBooking respGet =  response.getBody().as(Pojo_CreateBooking.class);
		
		//respGet.getFirstname();
		Assert.assertEquals(firstname,respGet.getFirstname());
		int totalprice = respGet.getTotalprice();
		System.out.println(totalprice);
	}
	
	@Test (dependsOnMethods = {"mandatoryCW.restAssured.BookerApi.generateToken","mandatoryCW.restAssured.BookerApi.createBooking"})
	//(dependsOnMethods = {"mandatoryCW.restAssured.BookerApi.generateToken","mandatoryCW.restAssured.BookerApi.createBooking"})
	public void updateBooking()
	{
		String lastname = "MeenakshiSundaram"; int totalprice = 50000;
		String updatedDate = "2023-03-19";
		PojoBookingDates bookingdates = new PojoBookingDates(updatedDate, "2024-04-30");
		Pojo_CreateBooking create = new Pojo_CreateBooking("Naga",lastname,totalprice,true,bookingdates,"Special Meal");
				/*
				 * "Naga", "M", 2000, false,bookingdates ,"Special breakfast"
				 */
		Response update = RestAssured.given()
								  .basePath("/booking/"+bookingIdVal)
								  .contentType("application/json")
					              .accept("application/json")
					              .cookie("token="+tokenVal)
					              .body(create)
					              .log().all()
					              .put();
		
		update.jsonPath().prettyPrint();		
		Pojo_CreateBooking putResp = update.getBody().as(Pojo_CreateBooking.class);
		String checkin = putResp.getBookingdates().getCheckin();
		Assert.assertEquals(checkin, "2023-03-19");
		Assert.assertTrue(putResp.getLastname().equals(lastname), "LastName not matched");
		Assert.assertTrue(putResp.getBookingdates().getCheckin().equals(updatedDate), "Date not matched");
		Assert.assertTrue(putResp.getTotalprice()==totalprice, "Price not matching");
		update.then().assertThat().statusCode(200);
	}
	
	@Test(dependsOnMethods = "mandatoryCW.restAssured.BookerApi.updateBooking")
	public void partialUpdate()
	{
		PojoPartialUpdate patchh = new PojoPartialUpdate("Karthikeyan", "Meenakshisundaram");
		Response patchUpdate = RestAssured.given()
									.basePath("booking/"+bookingIdVal)
									.accept("application/json")
									.contentType("application/json")
									.cookie("token="+tokenVal)
									.body(patchh)
									.log()
									.all().patch();								
		patchUpdate.then().assertThat().statusCode(200);
		Pojo_CreateBooking patchUpp = patchUpdate.getBody().as(Pojo_CreateBooking.class);
		Assert.assertTrue(patchUpp.getFirstname().equals("Karthikeyan"), "Name not matched");
		Assert.assertTrue(patchUpp.getLastname().equals("Meenakshisundaram"), "LastName not matched");
		System.out.println(patchUpp.getBookingdates().getCheckin());
	}
	
	
	@Test (dependsOnMethods = "mandatoryCW.restAssured.BookerApi.partialUpdate")
	public void deleteBooking()
	{
		System.out.println(tokenVal);
		Response delete = RestAssured.given()
				   .accept("application/json")
				   .contentType("application/json")
				   .cookie("token="+tokenVal)
				   .delete("booking/"+bookingIdVal);
		
		delete.then().assertThat().statusCode(201);
		
		Response delResponse = RestAssured.given()
				   .accept("application/json")
				   .contentType("application/json")
				   .basePath("booking/"+bookingIdVal)
				   .log()
				   .all()
				   .get();	
		delResponse.then().assertThat().statusCode(404);
		
	}

}
