package WaysOFPost;

import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.http.ContentType;


public class ByFile {
public static void main(String[] args) {
	baseURI="http://localhost";
	port=8084;
	
	File file = new File("./feb.json");
	
	given()
	.body(file).contentType(ContentType.JSON)
	.when()
	.post("/addProject")
	.then().log().all(); 
	 
}
}
