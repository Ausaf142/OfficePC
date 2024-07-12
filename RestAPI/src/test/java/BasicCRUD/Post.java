package BasicCRUD;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post {
public static void main(String[] args) {
	//pre-requisite
	JSONObject jobj = new JSONObject();
	jobj.put("createdBy", "Yogesh");
	jobj.put("projectName", "WOOST1");
	jobj.put("status", "busy");
	jobj.put("teamSize", 5);
	
	//action
	RequestSpecification req = RestAssured.given();
	req.body(jobj);
	req.contentType(ContentType.JSON);
	Response res = req.post("http://localhost:8084/addProject");
	res.then().log().all(); 

	System.out.println("update from github");

}
}
