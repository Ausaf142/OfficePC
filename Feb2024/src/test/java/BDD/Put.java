package BDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class Put {
public static void main(String[] args) {
	JSONObject jobj = new JSONObject();
	jobj.put("createdBy", "Hareem");
	jobj.put("projectName", "jonson");
	jobj.put("status", "laughing");
	jobj.put("teamSize", 5);
								
	baseURI="http://localhost";
	port=8084;
	
	given()
	.body(jobj).contentType(ContentType.JSON)
	.when().put("/projects/TY_PROJ_2602")
	.then().log().all();

}
}
