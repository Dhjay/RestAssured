package reqrus.CRUD.Operations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateUserTest {
	
	@Test
	public void createUser() {
		
		//step 1: create pre-requisites
		JSONObject obj=new JSONObject();
		obj.put("name", "morpheus");
		obj.put("job", "leader");
		
		//step 2: send the request
		RequestSpecification request = RestAssured.given();
		request.body(obj);
		request.contentType(ContentType.JSON);
		
		
		//step3: vslidate the response
		Response resp = request.post("https://reqres.in/api/users");
		System.out.println(resp.statusCode());
		ValidatableResponse val = resp.then();
		val.log().all();
	}

}
