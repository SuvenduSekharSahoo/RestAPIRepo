package CRUDOperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibrary.BaseAPIClass;
import GenericLibrary.EndPointsLibrary;
import GenericLibrary.JavaLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;
import java.util.Random;

public class CreateProjectTest {

	@Test
	public void createProjectTest() throws SQLException
	{
		BaseAPIClass baLib=new BaseAPIClass();
		baLib.bsConfig();
		
//		baseURI="http://localhost";
//		port=8084;
		
		JavaLibrary jLib=new JavaLibrary();
		int random = jLib.getRandomNumber();
		//step 1:create java object data
//		Random r = new Random();
//		int value = r.nextInt(1000);
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Saroj");
		jobj.put("projectName", "Ty"+random);
		jobj.put("status", "created");
		jobj.put("teamSize", "20");
		
		//send the request
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		.when()
		.post(EndPointsLibrary.createProject)
		
		//validate the response
		.then()
		.assertThat().statusCode(201).log().all();
		
		
	}
}
