package reqrus.CRUD.Operations.WithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class SingleResourceTest {
	
	@Test
	public void getSingleResource()
	{
		baseURI="https://reqres.in";
		
		//step-1: creating the pre-requisites
		
		//step-2: send the fequest
				when()
					.get("/api/unknown/2")
						
		//step-3: validate the response
				.then()
					.assertThat().statusCode(200)
					.log().all();
	}

}
