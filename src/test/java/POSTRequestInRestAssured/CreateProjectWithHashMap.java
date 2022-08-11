package POSTRequestInRestAssured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.HashMap;
import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProjectWithHashMap {

	@Test
	public void createProjectWithHashMap()
	{
		baseURI="http://localhost";
		port=8084;
		
		Random r=new Random();
		int ran = r.nextInt(1000);
		
		HashMap map=new HashMap();
		map.put("createdBy", "Suvendu");
		map.put("projectName", "tyss"+ran);
		map.put("status", "created");
		map.put("teamSize", 12);
		
		//create data
				given()
				.body(map).contentType(ContentType.JSON)
				
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
