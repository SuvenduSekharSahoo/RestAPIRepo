package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoForSerializationAndDeserialization.Employee_Details;

public class DeserializationEmployee_Details {

	@Test
	public void deserializeEmployeeDetailsTest() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper objm = new ObjectMapper();
		Employee_Details e1 = objm.readValue(new File(".\\EmployeeDetails.json"), Employee_Details.class);
		System.out.println(e1.getAddress());
		System.out.println(e1.getName());
	}
}
