package APITests;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class PUTReq {

	
	@Test
	public void Test5_PUT(){
		
		baseURI = "https://reqres.in/api";
		
		
		JSONObject obj = new JSONObject();
		obj.put("name","Veeraput" );
		obj.put("Job","Engineer" );
		
		System.out.println(obj.toJSONString());
		
		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(obj.toJSONString()).
		when().
		put("/users/2").
		then().
		statusCode(200).
		log().all();
		
		
		
		}
	
	@Test
	public void Test6_PATCH(){
		
		baseURI = "https://reqres.in";
		JSONObject obj = new JSONObject();
		obj.put("name","Veerapatch" );
		System.out.println(obj.toJSONString());
		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(obj.toJSONString()).
		when().
		patch("/api/users/2").
		then().
		statusCode(200).
		log().all();
		
		}
	
	
	@Test
	public void Test7_DELETE(){
		
		baseURI = "https://reqres.in";
		when().
		delete("/api/users/2").
		then().
		statusCode(204).
		log().all();
		
		}
}
