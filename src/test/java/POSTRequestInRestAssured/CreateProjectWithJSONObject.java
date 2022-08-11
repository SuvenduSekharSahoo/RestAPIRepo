package POSTRequestInRestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectWithJSONObject {

	@Test
	public void createProjectWithJSONObject()
	{
		baseURI="http://localhost";
		port=8084;
		
		Random r=new Random();
		int ran = r.nextInt(1000);
		
		JSONObject jobj1=new JSONObject();
		jobj1.put("mother", "laxmi");
		jobj1.put("father", "Saroj");
		jobj1.put("brother", "Subham");
		
		JSONObject jobj= new JSONObject();
		jobj.put("createdBy", "Suvendu"+jobj1);
		jobj.put("projectName", "tyss"+ran);
		jobj.put("status","created");
		jobj.put("teamSize", 12);
		
		//create data
		given()
		.body(jobj).contentType(ContentType.JSON)
		
		//send request & validate response
		.when()
		.post("/addProject")
		
		.then()
		.assertThat()
		.statusCode(201)
		.log()
		.all();		
	}
}
