package BasicCrudOperations;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseAPIClass;
import GenericLibrary.EndPointsLibrary;
import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

public class CreateAndValidateInDB extends BaseAPIClass {

	@Test
	public void createAndValidateInDB() throws SQLException
	{
		//create the prerequisite
		ProjectLibrary pLib=new ProjectLibrary("Suvendu", "TestYantra"+jLib.getRandomNumber(), "created", 12);
		
		//send the request
		Response response = given()
		.body(pLib)
		.contentType(ContentType.JSON)
		
		.when()
		.post(EndPointsLibrary.createProject);
		//.then.log.all
		
		//capture the projectId
		String expData = rLib.getJSONData(response, "projectId");
		Reporter.log(expData, true);
		
		//validate the Id in Database
		String query= "select * from project;";
		String actData = dLib.readDataFromDBAndValidate(query, 1, expData);
		
		Assert.assertEquals(expData, actData);
	}
}
