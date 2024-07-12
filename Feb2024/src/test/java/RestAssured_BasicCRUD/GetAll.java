package RestAssured_BasicCRUD;

import org.testng.reporters.jq.Main;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAll {
public static void main(String[] args) {
	RequestSpecification req = RestAssured.given();
	Response res = req.when().get("http://localhost:8084/projects");
	System.out.println(res.asPrettyString());
}

	
}
