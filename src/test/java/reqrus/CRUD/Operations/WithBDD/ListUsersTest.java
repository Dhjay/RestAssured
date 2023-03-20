package reqrus.CRUD.Operations.WithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class ListUsersTest {
	
	@Test
	public void getListUsers() {
		
		baseURI = "https://reqres.in";
		
		//step-1: create pre-requisites
		
		
		//step-2: send the request
		when()
			.get("/api/users?page=2")
		
		//step-3: validate the response
		.then()
			.assertThat().statusCode(200)
			.log().all();
			
			
	}

}
