package Authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class BearerTokenTest {

	@Test
	public void bearerToken()
	{
		baseURI="https://api.github.com";
		
		HashMap hm=new HashMap();
		hm.put("name", "RestAPIRepo");
		hm.put("description", "Created Successfully");
		
		given().body(hm).contentType(ContentType.JSON)
		
		.auth().oauth2("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")
		
		.when().post("/user/repos")
		
		.then().assertThat().statusCode(201).log().all();
	}
}
