package APITests;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class POSTReq {

	
	@Test
	public void Test4_POST(){
		
		baseURI = "https://reqres.in/api";
		
		
		JSONObject obj = new JSONObject();
		obj.put("name","Veera" );
		obj.put("Job","Engineer" );
		
		System.out.println(obj.toJSONString());
		
		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(obj.toJSONString()).
		when().
		post("/users").
		then().
		statusCode(201).
		log().all();
		
		
		
		}
}
