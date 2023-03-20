package reqrus.CRUD.Operations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetUserTest {
	
	@Test
	public void getUser() {
		
		//step 1: create pre-requisites
		
		//step 2: send the request
		Response resp = RestAssured.get("https://reqres.in/api/unknown");
		
		//step 3: validate the request
		ValidatableResponse val = resp.then();
		val.log().all();
		
	}
	

}
