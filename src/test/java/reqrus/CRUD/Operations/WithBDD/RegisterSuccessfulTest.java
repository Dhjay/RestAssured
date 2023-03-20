package reqrus.CRUD.Operations.WithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class RegisterSuccessfulTest {
	@Test
	public void registerSuccessfulTest() {
		baseURI="https://reqres.in/";
		//step-1: create pre-condition
		JSONObject obj=new JSONObject();
		obj.put("email", "eve.holt@reqres.in");
		obj.put("password", "pistol");
		given()
			.body(obj)
			.contentType(ContentType.JSON)
			
		//step-2: send the request
		.when()
			.post("/api/register")
		
		//step-3: vslidate the request
			.then()
			.assertThat().statusCode(200)
			.log().all();
	}

}
