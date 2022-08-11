package BasicCrudOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class LoginRMGYantrawithAuthentication {

	@Test
	public void loginRMGYantrawithAuthentication()
	{
		RequestSpecification request = RestAssured.given();
		request.auth().basic("rmgyantra", "rmgy@9999");
		Response resp = request.get("http://localhost:8084/login");
		ValidatableResponse validate = resp.then();
		validate.log().all();
	}

}
