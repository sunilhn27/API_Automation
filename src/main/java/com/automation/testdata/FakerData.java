package com.automation.testdata;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import com.github.javafaker.Faker;

public class FakerData {

	static Faker faker = new Faker(new Locale("en-IND"));

	public static String getRoomID() {
		int room = faker.number().numberBetween(101, 200);
		String roomID = Integer.toString(room);
		System.out.println("Room ID " + roomID);
		return roomID;

	}

	public static String getRoomNumber() {
		int room = faker.number().numberBetween(100, 200);
		String roomID = Integer.toString(room);
		System.out.println("Room Number " + roomID);
		return roomID;

	}

	public static String getType() {
		System.out.println("type Single");
		return "Single";

	}

	public static boolean getAccessible() {
		Random r = new Random();
		System.out.println("Accessible " + r.nextBoolean());
		return r.nextBoolean();

	}

	public static String getDescription() {
		System.out.println("Description " + faker.commerce().department());

		return faker.commerce().department();

	}

	public static String getPrice() {
		int room = faker.number().numberBetween(500, 700);
		String price = Integer.toString(room);
		System.out.println("Price " + price);
		return price;

	}

	public static List<String> getFeatures() {

		int count = faker.number().numberBetween(0, 6);
		String[] feature = { "WiFi", "TV", "Radio", "Refreshments", "Safe", "Views" };
		List<String> features = new ArrayList<String>();
		for (int i = 0; i < count; i++) {
			features.add(feature[i]);
		}
		System.out.println("List of Features " + features);
		return features;
	}

	public static void main(String[] args) {
		FakerData.getRoomID();
		FakerData.getRoomNumber();
		FakerData.getType();
		FakerData.getAccessible();
		FakerData.getPrice();
		FakerData.getFeatures();

	}

}