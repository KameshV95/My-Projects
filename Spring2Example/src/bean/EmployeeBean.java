package bean;

public class EmployeeBean {
	  int id;
	 String name;
	  float salary;
	
	
	/*public void EmployeeBean() {
		System.out.println("Zero Param Constructor");
	}
	*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
