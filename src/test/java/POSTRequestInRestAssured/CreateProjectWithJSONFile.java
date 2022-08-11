package POSTRequestInRestAssured;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class CreateProjectWithJSONFile {

	@Test
	public void createProjectWithJSONFile()
	{
		baseURI="http://localhost";
		port=8084;
		
		File file=new File(".\\src\\test\\java\\RequestData.json");
		
		given().body(file).contentType(ContentType.JSON)
		
		.when().post("/addProject")
		
		.then().assertThat().statusCode(201).log().all();
	}
}
