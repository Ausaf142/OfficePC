package BasicCRUD;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put {
	public static void main(String[] args) {
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "put");
		jobj.put("projectName", "FKm");
		jobj.put("status", "busy");
		jobj.put("teamSize", 5);
//		Response req = RestAssured.given().put("http://localhost:8084/projects/TY_PROJ_1608");
		RequestSpecification request = RestAssured.given();
		request.body(jobj);
		request.contentType(ContentType.JSON);
		Response resp=request.put("http://localhost:8084/projects/TY_PROJ_1607");
		resp.then().log().all();
	}
}
