package DifferentWaysPOST;


import java.util.HashMap;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class JSONByHashMap {
	public static void main(String[] args) {
		baseURI="http://localhost";
		port=8084;
		
		HashMap map= new HashMap();
		map.put("createdBy", "Vaishnavi");
		map.put("projectName", "Content Writer");
		map.put("status", "null");
		map.put("teamSize", 1);
		given()
		.body(map)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then().log().all();
	
}
}