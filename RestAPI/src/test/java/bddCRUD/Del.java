package bddCRUD;

import static io.restassured.RestAssured.*;
public class Del {
	public static void main(String[] args) {
		baseURI="http://localhost/";
		port=8084;
		
		when()
		.delete("projects/TY_PROJ_2003")
		.then().log().all();
	}
}
