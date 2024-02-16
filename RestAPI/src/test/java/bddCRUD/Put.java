package bddCRUD;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
public class Put {
	public static void main(String[] args) {
		baseURI="http://localhost/";
		port=8084;
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Benz");
		jobj.put("projectName", "Mercedes");
		jobj.put("status", "Running");
		jobj.put("teamSize", 1);
		
		given()
		.body(jobj).contentType(ContentType.JSON)
		.when().put("projects/TY_PROJ_2203")
		.then().log().all();
		
	}
}
