package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParameter {

	@Test
	public void pathParameter()
	{
		baseURI="http://localhost";
		port=8084;
		
		//create data
		given()
		.pathParam("path", "TY_PROJ_806")
		
		//send request & validate response
		.when()
		.get("/projects/{path}")
		
		.then()
		.assertThat().statusCode(200).log().all();
	}
}
