package POSTRequestInRestAssured;

import org.testng.annotations.Test;

import POJOClasses.Family;
import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectWithPOJO {

	@Test
	public void createProjectWithPOJO()
	{
		baseURI="http://localhost";
		port=8084;
		
		Random r=new Random();
		int ran = r.nextInt(1000);
		
		Family fam=new Family("Laxmi"+ran, "Saroj"+ran, "Subham"+ran);

		ProjectLibrary pLib=new ProjectLibrary("Saroj"+ran, "sdet"+ran, "created", 12);
		
		
		given().body(pLib).body(fam).contentType(ContentType.JSON)
		
		.when().post("/addProject")
		
		.then().assertThat().statusCode(201).log().all();
	}
}
