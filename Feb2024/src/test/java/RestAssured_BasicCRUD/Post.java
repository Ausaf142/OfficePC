package RestAssured_BasicCRUD;



import org.json.simple.JSONObject;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post {
	public static void main(String[] args) {
		JSONObject obj =new JSONObject();
		obj.put("createdBy", "umesh");
		obj.put("projectName", "FKM");
		obj.put("status", "active");
		obj.put("teamSize", 1);
		
		RequestSpecification req = RestAssured.given();
		req.body(obj);
		req.contentType(ContentType.JSON);
		Response res = req.post("http://localhost:8084/addProject");
		System.out.println(res.asPrettyString());
		
	}
}
