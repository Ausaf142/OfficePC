package RestAssured_BasicCRUD;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put {
public static void main(String[] args) {
	HashMap obj = new HashMap();
	obj.put("createdBy", "Rajesh");
	obj.put("projectName", "woost");
	obj.put("status", "active");
	obj.put("teamSize", 1);
	
	RequestSpecification req = RestAssured.given();
	req.body(obj);
	req.contentType(ContentType.JSON);
	Response res = req.put("http://localhost:8084/projects/TY_PROJ_2602");
	System.out.println(res.asPrettyString());
	
}
}
