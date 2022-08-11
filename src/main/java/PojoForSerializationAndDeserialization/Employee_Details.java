package PojoForSerializationAndDeserialization;

public class Employee_Details {
	
	String name;
	String address;
	int mobile;
	double id;
	
	public Employee_Details(String name, String address, int mobile, double id) {
		super();
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.id = id;
	}
	
	public Employee_Details()
	{
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}	

}
