package BasicCrudOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {

	@Test
	public void updateProjectTest()
	{
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Saroj1");
		jobj.put("projectName", "Ty1");
		jobj.put("status", "created");
		jobj.put("teamSize", "22");
		
		RequestSpecification request = RestAssured.given();
		 request.body(jobj);
		 request.contentType(ContentType.JSON);
		 Response resp = request.put("http://localhost:8084/projects/TY_PROJ_1805");
		 
		 System.out.println(resp.prettyPeek());
		 resp.then().log().all();
	}
}
