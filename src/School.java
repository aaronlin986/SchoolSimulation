
public abstract class School {
	Grid schoolGrid;
	private int numStudent;
	private int numTeacher;
	private int numJanitor;
	private int numChef;
	private int numSecurity;
	private int numDepartment;
	private int numClass;
	// double wealth;
	// double reputation;
	
	
	public School() {
		setNumStudent(0);
		setNumTeacher(0);
		setNumJanitor(0);
		setNumChef(0);
		setNumSecurity(0);
		setNumDepartment(0);
		setNumClass(0);
	}


	/**
	 * @return the numStudent
	 */
	public int getNumStudent() {
		return numStudent;
	}


	/**
	 * @param numStudent the numStudent to set
	 */
	public void setNumStudent(int numStudent) {
		this.numStudent = numStudent;
	}


	/**
	 * @return the numTeacher
	 */
	public int getNumTeacher() {
		return numTeacher;
	}


	/**
	 * @param numTeacher the numTeacher to set
	 */
	public void setNumTeacher(int numTeacher) {
		this.numTeacher = numTeacher;
	}


	/**
	 * @return the numJanitor
	 */
	public int getNumJanitor() {
		return numJanitor;
	}


	/**
	 * @param numJanitor the numJanitor to set
	 */
	public void setNumJanitor(int numJanitor) {
		this.numJanitor = numJanitor;
	}


	/**
	 * @return the numChef
	 */
	public int getNumChef() {
		return numChef;
	}


	/**
	 * @param numChef the numChef to set
	 */
	public void setNumChef(int numChef) {
		this.numChef = numChef;
	}


	/**
	 * @return the numDepartment
	 */
	public int getNumDepartment() {
		return numDepartment;
	}


	/**
	 * @param numDepartment the numDepartment to set
	 */
	public void setNumDepartment(int numDepartment) {
		this.numDepartment = numDepartment;
	}


	/**
	 * @return the numSecurity
	 */
	public int getNumSecurity() {
		return numSecurity;
	}


	/**
	 * @param numSecurity the numSecurity to set
	 */
	public void setNumSecurity(int numSecurity) {
		this.numSecurity = numSecurity;
	}


	/**
	 * @return the numClass
	 */
	public int getNumClass() {
		return numClass;
	}


	/**
	 * @param numClass the numClass to set
	 */
	public void setNumClass(int numClass) {
		this.numClass = numClass;
	} 
}
