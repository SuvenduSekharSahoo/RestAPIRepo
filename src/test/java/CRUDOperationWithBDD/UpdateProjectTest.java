	package CRUDOperationWithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProjectTest {

	@Test
	public void updateProjectTest()
	{
		baseURI="http://localhost";
		port=8084;
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Suvendu");
		jobj.put("projectName", "Ty_01");
		jobj.put("status", "created");
		jobj.put("teamSize", "10");
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		.when()
		.put("/projects/TY_PROJ_2404")
		
		.then()
		.assertThat().statusCode(200).log().all();
	}
}
