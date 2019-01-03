import util.Errors;

public class Tile{
	protected boolean isOccupied;
	protected Object occupant;
	protected final int locX;		//Blank final variable, must be initialized in constructors
	protected final int locY;
	
	/**
	 * @param x location 
	 * @param y location
	 * create an empty new tile at location x,y
	 */
	public Tile(int x, int y) {
		locX = x;
		locY = y;
		isOccupied = false;
		occupant = null;
	}
	
	/**
	 * @param occupant
	 * Takes an object and tries to lays it on the tile.
	 * Returns an error if it is already occupied
	 */
	public void addOccupant(Object occupant) {
		if(isOccupied == true) {
			System.err.println(Errors.ALREADY_OCCUPIED_TILE.toString());
			return;
		}
		else {
			this.occupant = occupant;
			this.isOccupied = true;
		}
	}
	
	/**
	 * Atempts to delete occupant from a tile
	 * Returns an error if the tile is empty
	 */
	public void delOccupant() {
		if(isOccupied == false) {
			System.err.println(Errors.NON_OCCUPIED_TILE.toString());
			return;
		}
		else {
			this.occupant = null;
			this.isOccupied = false;
		}
	}
}
