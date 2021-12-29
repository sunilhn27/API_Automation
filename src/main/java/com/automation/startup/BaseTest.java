package com.automation.startup;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseTest {

	public static RequestSpecification requestSpec = null;
	public static ResponseSpecification responseSpec = null;
	public Response response;
	public static WebDriver driver = null;
	public String count =System.getProperty("count");
	

	public ResponseSpecification responseSpecificationToGetToken(String endPointUri, Map<String, String> body) {
		try {
			requestSpec = new RequestSpecBuilder().setBaseUri(IAutoConst.BASE_URI)
					.addHeader("Content-Type", "application/json").setBasePath(endPointUri).setBody(body).build();
			responseSpec = new ResponseSpecBuilder().expectStatusCode(Integer.parseInt(IAutoConst.SUCCESS_CODE))
					.build();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return responseSpec;
	}

}
