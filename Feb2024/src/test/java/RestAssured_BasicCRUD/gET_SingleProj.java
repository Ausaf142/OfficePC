package RestAssured_BasicCRUD;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class gET_SingleProj {
public static void main(String[] args) {
	RequestSpecification req = RestAssured.given();
	Response res = req.when().get("http://localhost:8084/projects/ad");
	System.out.println(res.asPrettyString()) ;
	
}
}
