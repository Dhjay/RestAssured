package reqrus.CRUD.Operations.WithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class LoginUnsuccessfulTest {
	@Test
	public void loginUnsuccessfulTest() {
		baseURI="https://reqres.in/";
		//step-1: create pre-condition
				JSONObject obj=new JSONObject();
				obj.put("email", "peter@klaven");
				
				given()
					.body(obj)
					.contentType(ContentType.JSON)
					
				//step-2: send the request
				.when()
					.post("/api/login")
				
				//step-3: vslidate the request
					.then()
					.assertThat().statusCode(400)
					.log().all();
	}
	

}
