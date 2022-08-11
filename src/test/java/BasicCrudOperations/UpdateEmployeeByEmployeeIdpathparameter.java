package BasicCrudOperations;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateEmployeeByEmployeeIdpathparameter {

	@Test
	public void updateEmployeeByEmployeeIdpathparameter()
	{
		Random r=new Random();
		int value = r.nextInt(1000);
		
		JSONObject jobj= new JSONObject();
		jobj.put("designation", "QAuto");
		jobj.put("dob", "01/11/1111");
		jobj.put("email", "sss123@gmail.com");
		jobj.put("empId", "string1");
		jobj.put("empName", "john"+value);
		jobj.put("experience", 2);
		jobj.put("mobileNo", "1234567890");
		jobj.put("password", "john@123");
		jobj.put("project", "rmg");
		jobj.put("role", "QA");
		jobj.put("username", "john"+value);
		
		RequestSpecification request = RestAssured.given();
		request.body(jobj);
		request.contentType(ContentType.JSON);
		Response resp = request.put("http://localhost:8084/employees/TYP_01005");
		resp.prettyPeek().then().log().all();
		
	}
}
