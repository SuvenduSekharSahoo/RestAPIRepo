package BasicCrudOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetEmployeeByuserName {

	@Test
	public void getEmployeeByuserName()
	{
		Response resp = RestAssured.get("http://localhost:8084/employees/{username}:john1424909526");
		resp.prettyPeek().then().log().all();
	}

}
