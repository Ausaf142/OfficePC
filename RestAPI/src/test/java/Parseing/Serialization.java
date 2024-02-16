package Parseing;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO_Library.Employee_Library;

public class Serialization {
	//converting java code to json format called serialization
@Test
public  void demo() throws JsonGenerationException, JsonMappingException, IOException {
	Employee_Library emp =new Employee_Library();
	emp.Employee_Library("Parool", "BA", "busy", 1);
	ObjectMapper omap =new ObjectMapper();
	omap.writeValue(new File("./Parse.json"), emp);
	
}
}
