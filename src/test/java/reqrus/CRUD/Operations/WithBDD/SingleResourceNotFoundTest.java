package reqrus.CRUD.Operations.WithBDD;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class SingleResourceNotFoundTest {
	@Test
	public void getsingleResourceNotFound() {
		baseURI="https://reqres.in";
		//step-1: creating the pre-requisites
		
		//step-2: send the fequest
				when()
					.get("/api/unknown/23")
								
		//step-3: validate the response
				.then()
					.assertThat().statusCode(404)
					.log().all();
		
	}

}
