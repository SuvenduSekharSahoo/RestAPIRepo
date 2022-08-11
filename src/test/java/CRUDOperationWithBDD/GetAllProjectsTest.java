package CRUDOperationWithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetAllProjectsTest {

	@Test
	public void getAllProjectsTest()
	{
		baseURI="http://localhost";
		port=8084;
		//step 1:create java object data
		
		//send the request
		when()
		.get("/projects/TY_PROJ_001")
		
		//validate the response
		.then()
		.assertThat().statusCode(200).log().all();

	}
}
