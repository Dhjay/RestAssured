package reqrus.CRUD.Operations.WithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DelayedResponseTest {
	
	@Test
	public void delayedResponse() {
		baseURI="https://reqres.in/";
		//step-1: create pre-condition
		
					
		//step-2: send the request
		when()
			.get("/api/users?delay=3")
		
		//step-3: vslidate the request
			.then()
			.assertThat().statusCode(200)
			.log().all();
	}
	

}
