package BasicCrudOperations;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateEmployee {

	@Test
	public void createEmployee()
	{
		Random r=new Random();
		int value = r.nextInt();
		
		JSONObject jobj= new JSONObject();
		jobj.put("designation", "QA");
		jobj.put("dob", "01/11/2011");
		jobj.put("email", "john123@gmail.com");
		jobj.put("empId", "string");
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
		Response resp = request.post("http://localhost:8084/employees");
		System.out.println(resp.prettyPeek().then().log().all());
	}

} 
