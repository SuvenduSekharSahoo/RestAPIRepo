package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoForSerializationAndDeserialization.Employee_DetailsWithArray;

public class EmployeeDetailsWithArray {

	@Test
	public void employeeDetailsTest() throws JsonGenerationException, JsonMappingException, IOException
	{
		int[] phone= {775194,123456};
		String[] email={"abc@gmail.com","xyz@gmail.com"};
		
		Employee_DetailsWithArray eda = new Employee_DetailsWithArray("Suvendu", 7751.1, phone, email, "Banglore");
		
		ObjectMapper objm = new ObjectMapper();
		objm.writeValue(new File("./EmpDetailsArray.json"), eda);
	}
}
