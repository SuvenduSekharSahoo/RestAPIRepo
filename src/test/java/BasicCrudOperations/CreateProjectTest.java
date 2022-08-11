package BasicCrudOperations;

import java.util.Random;

import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;

import GenericLibrary.JavaLibrary;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {
	
	@Test
	public void createProjectTest()
	{
		JavaLibrary jLib=new JavaLibrary();
		int random = jLib.getRandomNumber();
//		Random r = new Random();
//		int value = r.nextInt(1000);
	 //create data
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Saroj");
		jobj.put("projectName", "Ty"+random);
		jobj.put("status", "created");
		jobj.put("teamSize", "20");
		
	 //send the request
		 RequestSpecification request = RestAssured.given();
		 request.body(jobj);
		 request.contentType(ContentType.JSON);
		 Response res = request.post("http://localhost:8084/addProject");
		 
	 //validate the response
		 System.out.println(res.prettyPeek());
		 res.then().log().all();
	}

}
