package BasicCRUD;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetALL {
public static void main(String[] args) {
	Response req = RestAssured.given().get("http://localhost:8084/projects");
	req.then().log().all();
}
}
