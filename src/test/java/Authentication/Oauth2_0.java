package Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class Oauth2_0 {

	@Test
	public void oauth2_0()
	{
		baseURI="http://coop.apps.symfonycasts.com";
		
		//generate the access token
		Response resp = given()
		.formParam("client_id", "TestYantraStudent")
		.formParam("client_secret", "7d9ddf312cdf5b19df086acfd177d688")
		.formParam("grant_type", "client_credentials")
		.formParam("redirect_uri", "http://example.com")
		.formParam("code", "authorization_code")
		
		.when().post("/token");
		
		//capture the access token using json path
		String token = resp.jsonPath().get("access_token");
		System.out.println(token);
		
		//utilize the access token
		given()
		.auth().oauth2(token)
		.pathParam("USER_ID", 3671)
		
		.when()
		.post("/api/{USER_ID}/toiletseat-down")
		
		.then().log().all();
		
		
		
	}
}
