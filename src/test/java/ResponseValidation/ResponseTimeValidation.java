package ResponseValidation;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ResponseTimeValidation {
	
	@Test
	public void responseTimeValidation()
	{
		baseURI="http://localhost";
		port=8084;
		
		when()
			.get("/projects")
		.then()
			.assertThat().time(Matchers.greaterThan(50L),TimeUnit.MILLISECONDS).log().all();
	}
}
