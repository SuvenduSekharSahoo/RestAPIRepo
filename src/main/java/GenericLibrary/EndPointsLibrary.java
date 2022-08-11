package GenericLibrary;

/**
 * this interface contains all the endpoints
 * @author Dell
 *
 */
public interface EndPointsLibrary {

	String createProject = "/addProject";
	String getAllProjects = "/projects";
	String getSingleProject = "/projects/";
	String updateProject = "/projects/";
	String deleteProject = "/projects/";
}
