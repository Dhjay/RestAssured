package reqrusObject;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class Hashmap {
	@Test
	public void hashmapObject() {
		
		baseURI="https://reqres.in";
		
		HashMap obj=new HashMap();
		obj.put("name", "morpheus");
		obj.put("job", "leader");
		
		//step-1: create pre-requisites
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		
		//step-2: send the request
		.when()
		.post("/api/users")
		
		//step-3: vaidate the response
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}
	

}
