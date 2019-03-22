package hbm.entity;

public class PhoneNumber {
	
	private long phoneNumber;
	private String numberType;
	
	public PhoneNumber() {
		System.out.println("This Is PhoneNumber Zero Param Constructor");	
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getNumberType() {
		return numberType;
	}

	public void setNumberType(String numberType) {
		this.numberType = numberType;
	}

	@Override
	public String toString() {
		return "PhoneNumber [phoneNumber=" + phoneNumber + ", numberType=" + numberType + "]";
	}
}
