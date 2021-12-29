package com.Test;

import java.util.List;

public class Room {

	private String roomNumber;
	private String type;
	private boolean accessible;
	private String description;
	private String image;
	private String roomPrice;
	private List<String> features;

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomNumber() {
		return this.roomNumber;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setAccessible(boolean accessible) {
		this.accessible = accessible;
	}

	public boolean getAccessible() {
		return this.accessible;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImage() {
		return this.image;
	}

	public void setRoomPrice(String roomPrice) {
		this.roomPrice = roomPrice;
	}

	public String getRoomPrice() {
		return this.roomPrice;
	}

	public void setFeatures(List<String> features) {
		this.features = features;
	}

	public List<String> getFeatures() {
		return this.features;
	}
}
