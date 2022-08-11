package DataDrivenTesting;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;

public class CreateMultipleProjects {

	@Test(dataProvider = "dataSupplier")
	public void createMultipleProjects(String createdBy, String projectName, String status, int teamSize)
	{
		baseURI="http://localhost";
		port=8084;
		
		Random r = new Random();
		int value = r.nextInt(1000);
		
		ProjectLibrary pLib=new ProjectLibrary(createdBy+value, projectName+value, status, teamSize);
	
		//create data
		given().body(pLib).contentType(ContentType.JSON)
		
		.when().post("/addProject")
		
		.then().log().all();
	}
	
		@DataProvider()
		public Object[][] dataSupplier()
		{
			Object[][] obj=new Object[3][4];
			
			obj[0][0] = "Suvendu";
			obj[0][1] = "ty";
			obj[0][2] = "Completed";
			obj[0][3] = 15;
			
			obj[1][0] = "Saroj";
			obj[1][1] = "tys";
			obj[1][2] = "Created";
			obj[1][3] = 10;
			
			obj[2][0] = "Subham";
			obj[2][1] = "TYSS";
			obj[2][2] = "On Going";
			obj[2][3] = 16;
				
			return obj;
		}
	}

	

