package reqrus.CRUD.Operations.WithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DeleteTest {
	@Test
	public void deleteTest() {
		baseURI="https://reqres.in/";
		//step-1: create pre-condition
			
		//step-2: send the request
		when()
			.delete("/api/users/2")
		
		//step-3: vslidate the request
			.then()
			.assertThat().statusCode(204)
			.log().all();
		
	}

}
