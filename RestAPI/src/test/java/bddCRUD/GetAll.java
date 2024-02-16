package bddCRUD;
import static io.restassured.RestAssured.*;
public class GetAll {
public static void main(String[] args) {
	baseURI="http://localhost/";
	port=8084;
	when()
	.get("projects")
	.then().log().all();
}
}
