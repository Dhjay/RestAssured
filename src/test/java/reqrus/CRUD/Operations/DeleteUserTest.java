package reqrus.CRUD.Operations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteUserTest {
	
	@Test
	public void deleteUser() {
		
		//step 1:create pre-requisites
		
		//step-2: send the request
		Response resp = RestAssured.delete("https://reqres.in/api/users/2");
		
		//step-3: validate the response
		System.out.println(resp.statusCode());
		ValidatableResponse val = resp.then();
		val.log().all();
	}

}
