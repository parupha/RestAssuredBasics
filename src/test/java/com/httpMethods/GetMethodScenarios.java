package com.httpMethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class GetMethodScenarios {

	@Test
	public void getMethodWithoutBDD()
	{
		RequestSpecification request = RestAssured.given();
		
		//uri is the base url without the resource
		request.baseUri("https://api.restful-api.dev"); 
		
		Response response = request.get("/objects");
		
		//returns the response body as a String and formats it in a neat, readable format (like JSON).
		System.out.println(response.prettyPrint()); 
	
		//Validate Response using interface "ValidatableResponse".
		// ValidatableResponse type of response using then() method of Response
		
		ValidatableResponse vr  = response.then();
		vr.statusCode(200); //It will check if status code is 200
		vr.header("Content-Type", "application/json");
        vr.body("$", Matchers.hasSize(13));
        
        vr.body("[0].id", Matchers.equalToIgnoringCase("1"));  
        vr.body("[0].name", Matchers.equalTo("Google Pixel 6 Pro"));
        vr.body("[0].data.color", Matchers.equalToIgnoringCase("Cloudy White"));
        
      
		
	}
	

}
