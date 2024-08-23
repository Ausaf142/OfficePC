package RestAssured_BasicCRUD;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delte {
public static void main(String[] args) {
	
	RequestSpecification req = RestAssured.given();
	Response res = req.delete("http://localhost:8084/projects/AR");
	System.out.println(res.asPrettyString());
	
}
}
