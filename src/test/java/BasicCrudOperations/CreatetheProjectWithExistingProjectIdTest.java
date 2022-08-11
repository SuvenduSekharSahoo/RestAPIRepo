package BasicCrudOperations;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreatetheProjectWithExistingProjectIdTest {

	@Test
	public void createtheProjectWithExistingProjectIdTest()
	{
		Random r=new Random();
		int value = r.nextInt(1000);
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "rmg");
		jobj.put("createdOn", "26/05/2021");
		jobj.put("projectId", "String");
		jobj.put("projectName", "rmgProject"+value);
		
		RequestSpecification request = RestAssured.given();
		request.body(jobj);
		request.contentType(ContentType.JSON);
		Response resp = request.post("http://localhost:8084/addProject");
		
		System.out.println(resp.asString());
		resp.then().log().all();
		
	}
}
