package POJOClasses;

public class Family {

	String mother;
	String father;
	String brother;
	
	public Family(String mother, String father, String brother)
	{
		this.mother=mother;
		this.father=father;
		this.brother=brother;
	}
	
	public Family()
	{
		
	}

	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getBrother() {
		return brother;
	}

	public void setBrother(String brother) {
		this.brother = brother;
	}
	
}
