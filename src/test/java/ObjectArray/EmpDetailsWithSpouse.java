package ObjectArray;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoForObject.EmployeeDetailsWithObject;
import PojoForObject.Spouse;

public class EmpDetailsWithSpouse {

	@Test
	public void empwithSpouseDetails() throws JsonGenerationException, JsonMappingException, IOException
	{
		int[] mobno = {111111,222222};
		Spouse s = new Spouse("Subham", 20, mobno);
		
		int[] mobno1 = {987654,123456};
		String[] mail = {"abc@gmail.com","xyz@gmail.com"};
		EmployeeDetailsWithObject ed = new EmployeeDetailsWithObject("Suvendu", mobno1, mail, s);
				
		ObjectMapper om = new ObjectMapper();
		om.writeValue(new File("./EmpDetailsWithObject.json"), ed);
	}
}
