package POSTRequestInRestAssured;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProjectWithFormParameter {

	@Test
	
	public void createProjectWithFormParameter()
	{
		baseURI="http://localhost";
		port=8084;
		
		Random r=new Random();
		int ran = r.nextInt(1000);
		
		given()
		.formParam("createdBy", "Saroj")
		.formParam("projectName", "sdet")
		.formParam("status", "finished")
		.formParam("teamSize", 10)
		.contentType(ContentType.JSON)
		
		.when().post("/addProject")
		
		.then().assertThat().statusCode(201).log().all();
				
	}
}
