package Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BasicAuthTest {

	@Test
	public void basicAuthTest()
	{
		baseURI="http://localhost";
		port=8084;
		
		//create prerequisite
		given()
		.auth().basic("rmgyantra", "rmgy@9999")
		
		//send request & validate response
		.when().get("/login")
		.then().assertThat().statusCode(202).log().all();
	}
	
	@Test
	public void basicPreEmpltiveAuthTest()
	{
		 
	}
}
