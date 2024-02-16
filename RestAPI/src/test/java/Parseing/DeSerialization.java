package Parseing;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO_Library.Employee_Library;

public class DeSerialization {
public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
	ObjectMapper omap =new ObjectMapper();
	Employee_Library data=omap.readValue(new File("./Parse.json"), Employee_Library.class);
	System.out.println(data.getCreatedBy());
	data.setCreatedBy("yogi");
	System.out.println(data.getCreatedBy());
	
}
}
