package reqrus.CRUD.Operations.WithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateUserTest {
	
	@Test
	public void createUser() {
		
		baseURI = "https://reqres.in";
		
		//step-1: create pre-condition
		JSONObject obj=new JSONObject();
		obj.put("name", "morpheus");
		obj.put("job", "leader");
		given()
			.body(obj)
			.contentType(ContentType.JSON)
			
		//step-2: send the request
		.when()
			.post("/api/users")
		
		//step-3: vslidate the request
			.then()
			.assertThat().statusCode(201)
			.log().all();
	}

}
