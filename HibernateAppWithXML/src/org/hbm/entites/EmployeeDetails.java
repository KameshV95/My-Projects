package org.hbm.entites;

public class EmployeeDetails {
	
	private int    empId;
	private String empName;
	private long   empPhNum;
	private String empMailId; 
	
	public EmployeeDetails() {
	 System.out.println("This Is Zero Param Constructor");
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getEmpPhNum() {
		return empPhNum;
	}

	public void setEmpPhNum(long empPhNum) {
		this.empPhNum = empPhNum;
	}

	public String getEmpMailId() {
		return empMailId;
	}

	public void setEmpMailId(String empMailId) {
		this.empMailId = empMailId;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [empId=" + empId + ", empName=" + empName + ", empPhNum=" + empPhNum + ", empMailId="
				+ empMailId + "]";
	}

	
	 
		
 
}
