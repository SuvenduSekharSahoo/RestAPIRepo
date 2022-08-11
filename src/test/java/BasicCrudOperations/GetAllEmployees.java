package BasicCrudOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllEmployees {

	@Test
	
	public void getAllEmployees()
	{
		Response resp = RestAssured.get("http://localhost:8084/employees");
		resp.prettyPeek().then().log().all();
	}

}
