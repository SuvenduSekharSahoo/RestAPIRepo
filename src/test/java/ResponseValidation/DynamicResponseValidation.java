package ResponseValidation;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

public class DynamicResponseValidation {

	@Test
	public void dynamicResponseValidation()
	{
		baseURI="http://localhost";
		port=8084;
		
		String expData="TY_PROJ_004";
		
		//send the request & validate
		Response resp = when()
			.get("/projects");
		
		boolean flag=false;
		
		 List<String> allId = resp.jsonPath().get("projectId");
//		 for(String id:allId)
//		 {
//			 if(id.equalsIgnoreCase(expData))
//			 {
//				 System.out.println(id);
//				 flag=true;//flag rising
//				 break;
//			 }			 
//		 }
		 
		 Iterator<String> id = allId.iterator();
		 while(id.hasNext())
		 {
			 String actData = id.next(); 
			 {
				 if(actData.equalsIgnoreCase(expData))
					 {
						 System.out.println(actData);
						 flag=true;//flag rising
						 break;
					 }			 
			 }
		 }
		 Assert.assertTrue(flag);
	}
}
