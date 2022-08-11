package PojoForObject;

public class EmployeeDetailsWithObject {

	String name;
	int[] phoneno;
	String[] emailid;
	Spouse s;


	public EmployeeDetailsWithObject(String name, int[] phoneno, String[] emailid, Spouse s) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.emailid = emailid;
		this.s = s;
	}

	public EmployeeDetailsWithObject()
	{
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Spouse getS() {
		return s;
	}

	public void setS(Spouse s) {
		this.s = s;
	}
	
	

//	public Object getSpouse() {
//		return Spouse;
//	}
//
//	public void setSpouse(Object spouse) {
//		this.Spouse = spouse;
//	}
	

}
