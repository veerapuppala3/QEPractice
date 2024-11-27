package APITests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

@Test
public class GETReq {
	
	@BeforeClass
	public void setUp()
	{
		baseURI = "https://reqres.in/api";
	}

	@Test
	public void Test1_GET(){
		
	Response response=get("/users?page=2");
	System.out.println(response.asString());
	System.out.println(response.getStatusCode());
	Assert.assertEquals(200, response.getStatusCode());
		
	}
	
	@Test
	public void Test2_GET(){
		
		//baseURI = "https://reqres.in/api";
		given().
			get("/users?page=2").
		then().
			statusCode(200).
			body("data[1].id", equalTo(8)).
			log().all();
		}
	@Test
	public void Test3_GET(){
		
		//baseURI = "https://reqres.in/api";
		given().param("page", "2").
			get("/users").
		then().
			statusCode(200).
			body("data.first_name", hasItems("Michael", "Lindsay")).
			log().all();
		}
	
	@Test
	public void Test4_GET(){
		
		given().param("id", "2").
			get("/users").
		then().
			statusCode(200).
			body("data.first_name", equalTo("Janet")).
			log().all();
		}
	
	}

