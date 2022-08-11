package POJOClasses;

public class ProjectLibrary {

	String createdBy;
	String projectName;
	String status;
	int teamSize;
	//Family Family;
	
	public ProjectLibrary(String createdBy, String projectName, String status, int teamSize)
	{
		this.createdBy=createdBy;
		this.projectName=projectName;
		this.status=status;
		this.teamSize=teamSize;
		//this.Family=Family;
	}
	
	public ProjectLibrary()
	{
		
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

//	public Family getFamily() {
//		return Family;
//	}
//
//	public void setFamily(Family family) {
//		this.Family = family;
//	}
	
	
	
}
