package reqrus.CRUD.Operations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateUserTest {
	
	@Test
	public void updateUser() {
		
		//step 1: create pre-requisites
		JSONObject obj=new JSONObject();
		obj.put("name", "morpheus");
		obj.put("job", "zion resident");
		
		//step-2: send the request
		RequestSpecification req = RestAssured.given();
		req.body(obj);
		req.contentType(ContentType.JSON);
		Response resp = req.put("https://reqres.in/api/users/2");
		
		//step-3: validate the response
		System.out.println(resp.statusCode());
		ValidatableResponse val = resp.then();
		val.log().all();
		
	}

}
