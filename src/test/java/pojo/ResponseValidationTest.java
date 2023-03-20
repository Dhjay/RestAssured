package pojo;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import groovyjarjarantlr4.v4.parse.ANTLRParser.action_return;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ResponseValidationTest {
	
	@Test
	public void respBodyValidation() {
		
		
		String expData = "morpheus"; 
		
		//step-1: create the pre-requisites
		baseURI = "https://reqres.in";
		basePath = "/api/users";
		UserLib lib=new UserLib("morpheus", "leader");
		
		//step-2: send the request
		Response resp = given()
			.body(lib)
			.contentType(ContentType.JSON)
			.when()
			.post();
			
		//step-3: validate the request
			String actData = resp.jsonPath().get("name");
			System.out.println(actData);
			resp.then().log().all();
			Assert.assertEquals(actData, expData);
	}

}
