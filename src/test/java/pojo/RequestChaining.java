package pojo;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RequestChaining {
	
	@Test
	public void requestChainingGetAndDelete() {
		
		//create the pre-requisites
		baseURI = "https://reqres.in";
		basePath = "/api/unknown";
		
		//send the request
		Response resp = when()
			.get();
			
		//capture the response using json path
			int id = resp.jsonPath().get("data[1].id");
					System.out.println(id);
			
		//provide the response variable to another request
			when()
				//.get("/api/users/"+id)
				.delete("/api/users/" +id)
			.then()
				.assertThat().statusCode(204)
				.log().all();
			
	}

}
