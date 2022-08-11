package BasicCrudOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteProjectTest {

	@Test
	public void deleteProjectTest()
	{
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_808");
		ValidatableResponse validate = resp.then();
		validate.log().all();
		
	}
}
