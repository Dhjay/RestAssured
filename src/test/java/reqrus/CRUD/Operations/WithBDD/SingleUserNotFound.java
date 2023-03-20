package reqrus.CRUD.Operations.WithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class SingleUserNotFound {
	
	@Test
	public void getSingleUserNotFound() {
		baseURI="https://reqres.in";
		
		//step-1: creating the pre-requisites
		
		//step-2: send the fequest
		when()
			.get("/api/users/23")
		
		//step-3: validate the response
		.then()
			.assertThat().statusCode(404)
			.log().all();
	}

}
