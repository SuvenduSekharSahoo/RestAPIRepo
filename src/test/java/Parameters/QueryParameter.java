package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QueryParameter {

	@Test
	public void queryParameter()
	{
		baseURI="https://reqres.in";
		
		//create requisites
		given()
		.queryParam("page", 2)
		//.queryParam("page", 3) //if we want multiple
		
		//send request & validate response
		.when()
		.get("/api/users")
		
		.then()
		.assertThat().statusCode(200).log().all();
		
	}
}
