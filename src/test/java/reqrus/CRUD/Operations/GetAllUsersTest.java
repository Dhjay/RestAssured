package reqrus.CRUD.Operations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllUsersTest {
	
	@Test
	public void getAllUsers() {
		
		//step 1: create pre-requisite
		
		//step 2: send the request
		Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
		
		//step 3: validate the response
		System.out.println(resp.statusCode());
		ValidatableResponse val = resp.then();
		val.log().all();
	}

}
