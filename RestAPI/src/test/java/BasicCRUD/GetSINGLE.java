package BasicCRUD;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSINGLE {
	public static void main(String[] args) {
		Response req = RestAssured.given().get("http://localhost:8084/projects/TY_PROJ_1608");
		req.then().log().all();
	}
}
