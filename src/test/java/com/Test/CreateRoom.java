package com.Test;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.automation.startup.BaseTest;
import com.automation.startup.IAutoConst;
import com.automation.testdata.FakerData;

import io.restassured.RestAssured;

public class CreateRoom extends BaseTest {

	private String token;

	@Test(priority = 1)
	public void gettoken() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", IAutoConst.USERNAME);
		map.put("password", IAutoConst.PASSWORD);

		responseSpec = responseSpecificationToGetToken(IAutoConst.AUTH_LOGIN, map);
		response = given().spec(requestSpec).when().post().then().assertThat().extract().response();

		token = response.header("set-cookie");
		System.out.println("token " + token);
	}

	@Test(priority = 2)
	public void createRoom() {
		System.out.println("**********************************************");
		System.out.println("count sent from user " + Integer.parseInt(count));
		System.out.println("**********************************************");

		for (int i = 0; i <= Integer.parseInt(count); i++) {
			Room room = new Room();
			List<String> list = new ArrayList<String>();
			list.addAll(FakerData.getFeatures());
			room.setRoomNumber(FakerData.getRoomNumber());
			room.setType(FakerData.getType());
			room.setAccessible(FakerData.getAccessible());
			room.setRoomPrice(FakerData.getPrice());
			room.setDescription("Test Description");
			room.setImage("https://www.mwtestconsultancy.co.uk/img/room1.jpg");
			room.setFeatures(list);
			RestAssured.baseURI = IAutoConst.BASE_URI;
			response = given().cookie(token).header("Content-Type", "application/json").body(room).when()
					.post(IAutoConst.ROOM).then().assertThat().extract().response();

			System.out.println(response.prettyPrint());

		}

	}
}