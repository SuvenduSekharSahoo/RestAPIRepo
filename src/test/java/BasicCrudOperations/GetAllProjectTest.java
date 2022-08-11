package BasicCrudOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllProjectTest {

	@Test
	
	public void getAllProjectTest()
	{
		Response resp = RestAssured.get("http://localhost:8084/projects");
		ValidatableResponse validate = resp.then();
		validate.log().all();
	}
}
