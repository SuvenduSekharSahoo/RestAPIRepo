package PojoForSerializationAndDeserialization;

public class Employee_DetailsWithArray {
	
	String name;
	double id;
	int[] phoneno;
	String[] emailid;
	String address;
	
	public Employee_DetailsWithArray(String name, double id, int[] phoneno, String[] emailid, String address) {
		super();
		this.name = name;
		this.id = id;
		this.phoneno = phoneno;
		this.emailid = emailid;
		this.address = address;
	}
	
	public Employee_DetailsWithArray()
	{
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public int[] getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int[] phoneno) {
		this.phoneno = phoneno;
	}

	public String[] getEmailid() {
		return emailid;
	}

	public void setEmailid(String[] emailid) {
		this.emailid = emailid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
