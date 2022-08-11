package GenericLibrary;

import io.restassured.response.Response;

/**
 * contains RestAssured specific reusable methods
 */
public class RestAssuredLibrary {

	/**
	 * get the json data through json path from response body
	 * @param response 
	 * @return 
	 */
	public String getJSONData(Response response, String path)
	{
		String jsonData = response.jsonPath().get(path);
		return jsonData;
	}
}
