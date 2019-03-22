package hbm.entity;

import java.util.List;

public class User {
	private int userId;
	private String userName;
	private List<PhoneNumber> phNumbers;
	
	public User() {
		System.out.println("This is User's Zero Param Constructor");	
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

	public List<PhoneNumber> getPhNumbers() {
		return phNumbers;
	}

	public void setPhNumbers(List<PhoneNumber> phNumbers) {
		this.phNumbers = phNumbers;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", phNumbers=" + phNumbers + "]";
	}

}
