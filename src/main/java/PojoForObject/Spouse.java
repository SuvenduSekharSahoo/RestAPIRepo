package PojoForObject;

public class Spouse {

	String name;
	int age;
	int[] mobile;
	
	public Spouse(String name, int age, int[] mobile) {
		super();
		this.name = name;
		this.age = age;
		this.mobile = mobile;
	}

	public Spouse()
	{
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int[] getMobile() {
		return mobile;
	}

	public void setMobile(int[] mobile) {
		this.mobile = mobile;
	}
	
}
