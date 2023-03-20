package reqrusObject;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class FileObject {

	@Test
	public void FileObject() {
baseURI="https://reqres.in";
		
		File obj=new File("./src/test/resources/Data.json");
		
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
