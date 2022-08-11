package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoForSerializationAndDeserialization.Employee_Details;

public class Serialization_Employee_Details {

	@Test
	public void employee_Details_Test() throws JsonGenerationException, JsonMappingException, IOException
	{
		
		Employee_Details ed = new Employee_Details("Suvendu", "Banglore", 775194, 7751.1);
		
		ObjectMapper objm = new ObjectMapper();
		objm.writeValue(new File("./EmployeeDetails.json"), ed);
	}
}
