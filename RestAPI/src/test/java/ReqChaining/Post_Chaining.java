package ReqChaining;

import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;

import Generic_Utility.Java_Library;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class Post_Chaining {
@Test
public void post() {
	Java_Library jlib = new Java_Library();
	int UniqueNumber = jlib.Random_Number();
JSONObject json = new JSONObject();
json.put("createdBy", "json");
json.put("projectName", "XML"+UniqueNumber);
json.put("status", "SON");
json.put("teamSize", 2);

baseURI="http://localhost";
port=8084;

Response req = given()
 .body(json)
 .contentType(ContentType.JSON)
 .when()
 .post("/addProject");
String Uid = req.jsonPath().get("projectId");
System.out.println(Uid);
System.out.println(req.asPrettyString() );

when()
.get("projects/"+Uid)
.then().log().all();

HashMap hmap = new HashMap();
hmap.put("createdBy", "json");
hmap.put("projectName", "Changed");
hmap.put("status", "SON");
hmap.put("teamSize", 2);

given()
.body(hmap)
.contentType(ContentType.JSON)
.when()
.put("projects/"+Uid)
.then().log().all();
 

}
}
