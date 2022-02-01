package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EntitiyS {
	
	@Id
	private int userId;
	private String userName;
	private String userAddress;

	public EntitiyS() {
	}

	public EntitiyS(int userId, String userName, String userAddress) {
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "EntitiyS [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + "]";
	}

}
