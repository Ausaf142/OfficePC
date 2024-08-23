package BasicCRUD;
//TY_PROJ_1608

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Delete {
public static void main(String[] args) {
	Response req = RestAssured.given().delete("http://localhost:8084/projects/TY_PROJ_1608");
	req.then().log().all();
}
}
