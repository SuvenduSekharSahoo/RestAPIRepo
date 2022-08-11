package Parameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class FormParameter {

	@Test
	public void formParameter()
	{
		baseURI="http://localhost:8084";
		
		//create pre-requisites
		given()
		.formParam("createdBy", "Saroj")
		.formParam("projectName", "Ty")
		.formParam("status", "created")
		.formParam("teamSize", 20)
		.contentType(ContentType.JSON)
		
		//send request & validate response
		.when()
		.post("/addProject")
		
		.then().log().all();
		
	}
}
