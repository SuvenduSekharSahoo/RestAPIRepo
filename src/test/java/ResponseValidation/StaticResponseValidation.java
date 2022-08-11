package ResponseValidation;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticResponseValidation {

	@Test
	public void staticResponseValidation()
	{
		baseURI="http://localhost";
		port=8084;
		
		//String expData="TY_PROJ_004";
		int expData=3;
		//step1:send the request
		Response resp = when()
							.get("/projects");
		
		//step2:validate the response
		//String actData = resp.jsonPath().get("[1].projectId");
		int actData = resp.jsonPath().get("[1].teamSize");
		Assert.assertEquals(expData, actData);
		System.out.println(actData);
	}
}
