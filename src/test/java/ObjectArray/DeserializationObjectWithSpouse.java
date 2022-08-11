package ObjectArray;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoForObject.EmployeeDetailsWithObject;
import PojoForObject.Spouse;

public class DeserializationObjectWithSpouse {

	@Test
	public void deserialObject() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper om = new ObjectMapper();
		EmployeeDetailsWithObject e1 = om.readValue(new File(".\\EmpDetailsWithObject.json"), EmployeeDetailsWithObject.class);
		System.out.println(e1.getEmailid()[1]);
		System.out.println(e1.getPhoneno()[0]);
		System.out.println(e1.getS());
		System.out.println(e1.getS().getName());
	}
}
