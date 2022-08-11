package BasicCrudOperations;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreatetheprojectwithTextFormateTest {

	@Test
	public void createtheprojectwithTextFormate()
	{
		Random r=new Random();
		int value = r.nextInt(1000);
		
		JSONObject jobj=new JSONObject();
		jobj.put("projectId", "String");
		jobj.put("projectName", "rmgProject"+value);
		jobj.put("status", "created");
		
		RequestSpecification request = RestAssured.given();
		request.body(jobj);
		request.contentType(ContentType.JSON);
		Response resp = request.post("http://localhost:8084/addProject");
		System.out.println(resp.prettyPeek());
		resp.then().log().all();
		
	}

}
