package BDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

public class GetSingle {
public static void main(String[] args) {
	baseURI="http://localhost";
	port=8084;
	
	given()
	.when().get("/projects/TY_PROJ_2602")
	.then().log().all();
}
}
