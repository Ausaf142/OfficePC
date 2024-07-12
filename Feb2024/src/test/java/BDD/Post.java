package BDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class Post {
public static void main(String[] args) {
	JSONObject jobj = new JSONObject();
	jobj.put("createdBy", "BABY");
	jobj.put("projectName", "jonson");
	jobj.put("status", "crying");
	jobj.put("teamSize", 5);

	
	baseURI="http://localhost";
	port=8084;
	
	given()
	.body(jobj)
	.contentType(ContentType.JSON)
	.when()
	.post("addProject")
	.then().log().all();
	
}
}
