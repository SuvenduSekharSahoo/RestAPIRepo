package RequestChaining;

import org.testng.annotations.Test;

import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectAndGetProject {

	@Test
	public void createProjectAndGetProject()
	{
		baseURI="http://localhost:8084";
		
		Random r=new Random();
		int ran = r.nextInt(1000);
		//create data
		ProjectLibrary pLib = new ProjectLibrary("Suvendu", "tyss"+ran, "created", 12);
		
		//send request
		 Response resp = given()
		.body(pLib)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/addProject");
		
		//capture projectId from response body using JSON path
		 String proId = resp.jsonPath().get("projectId");
		 System.out.println(proId);
		 
		 //use the capture projectId to get request
		 when()
		 .get("/projects/"+proId)
		 
		 .then()
		 .log().all();
		 
		 given()
		 .pathParam("pid", proId)
		 .when()
		 .get("/projects/{pid}")
		 .then()
		 .assertThat().statusCode(200).log().all();
		 
		 //use the projectId to to delete request
		 given()
		 .pathParam("pid", proId)
		 .when()
		 .delete("/projects/{pid}")
		 .then()
		 .assertThat().statusCode(204).log().all();
	}
}
