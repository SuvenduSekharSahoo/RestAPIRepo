package RequestChaining;

import org.testng.annotations.Test;

import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class UpdateProjectAndDelete {

	@Test
	public void updateProjectAndDelete()
	{
		baseURI="http://localhost";
		port=8084;
		Random r=new Random();
		int ran = r.nextInt(1000);
		
		ProjectLibrary pLib=new ProjectLibrary("Suvendu", "tyss"+ran, "created", 12);
		
		Response status = given().body(pLib).contentType(ContentType.JSON)
		.when().post("/addProject");
		
		String value = status.jsonPath().get("projectId");
		System.out.println(value);
		
		ProjectLibrary pLib1=new ProjectLibrary("Suvendu", "tyss"+ran, "completed", 12);
		given()
		.body(pLib1).contentType(ContentType.JSON)
		
		.when().put("/projects/"+value)
		.then().log().all();
		
		when().delete("/projects/"+value)
		.then().log().all();
		
		
		
		
	}
}
