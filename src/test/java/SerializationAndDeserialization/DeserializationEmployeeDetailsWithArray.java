package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoForSerializationAndDeserialization.Employee_DetailsWithArray;

public class DeserializationEmployeeDetailsWithArray {
	
	@Test
	public void deserializeEmployeeDetailsTest() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper objm = new ObjectMapper();
		Employee_DetailsWithArray e1 = objm.readValue(new File(".\\EmpDetailsArray.json"), Employee_DetailsWithArray.class);
		System.out.println(e1.getName());
		System.out.println(e1.getPhoneno()[0]);
		System.out.println(e1.getEmailid()[1]);
	}

}
