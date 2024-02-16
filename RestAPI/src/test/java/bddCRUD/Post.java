package bddCRUD;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Post {
public static void main(String[] args) {
	baseURI="http://localhost/";
	port=8084;
	
	
	JSONObject jobj = new JSONObject();
	jobj.put("createdBy", "A4");
	jobj.put("projectName", "Audia");
	jobj.put("status", "Running");
	jobj.put("teamSize", 1);
	
	given()
	.body(jobj).contentType(ContentType.JSON)
	.when().post("addProject")
	.then().log().all();
	
}
}
