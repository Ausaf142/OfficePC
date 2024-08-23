package DifferentWaysPOST;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JsonObject {
@Test
public void ObjectPost() {
	JSONObject jobj = new JSONObject();
	jobj.put("createdBy", "SAJAL");
	jobj.put("projectName", "Graphic Designer1");
	jobj.put("status", "nalla");
	jobj.put("teamSize", 1);
	
	RequestSpecification Req = RestAssured.given();
	Req.body(jobj);
	Req.contentType(ContentType.JSON);
	Response Resp = Req.post("http://localhost:8084/addProject");
	System.out.println(Resp.asPrettyString());
	
}
}
