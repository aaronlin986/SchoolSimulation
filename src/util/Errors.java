package util;

public enum Errors {
	
	INVALID_GRID_SIZE("The size of the newly created grid is invalid!");
	
	private final String errorString;
	
	Errors(String errorString) {
		this.errorString = errorString;
	}
	
	public String toString() {
		return this.errorString;
	}
}
