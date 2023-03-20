package reqrus.CRUD.Operations.WithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class ListResourceTest {
	
	@Test
	public void getListresource() {
		baseURI="https://reqres.in";
		
		//step-1: creating the pre-requisites
		
		//step-2: send the fequest
				when()
					.get("/api/unknown")
				
		//step-3: validate the response
				.then()
					.assertThat().statusCode(200)
					.log().all();
	}

}
