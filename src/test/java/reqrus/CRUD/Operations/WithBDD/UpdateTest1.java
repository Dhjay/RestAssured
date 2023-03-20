package reqrus.CRUD.Operations.WithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateTest1 {
	@Test
	public void patch() {
		baseURI="https://reqres.in";
		
		//step-1: create pre-condition
				JSONObject obj=new JSONObject();
				obj.put("name", "morpheus");
				obj.put("job", "zion resident");
				given()
					.body(obj)
					.contentType(ContentType.JSON)
					
				//step-2: send the request
				.when()
					.patch("/api/users/2")
				
				//step-3: vslidate the request
					.then()
					.assertThat().statusCode(200)
					.log().all();
	}

}
