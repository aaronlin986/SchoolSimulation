import util.Errors;

public class Grid {
	
	private final static int DEFAULT_GRID_SIZE = 60;
	private final int sizeX;
	private final int sizeY;
	private Tile[][] gridMap;
	
	/**
	 * initializes an empty grid of square size 60
	 * default constructor
	 * constructor that takes in one parameter
	 */
	public Grid() {
		this(DEFAULT_GRID_SIZE);
	}
	
	/**
	 * @param size x
	 * initializes an empty grid of square size
	 * constructor that takes in one parameter
	 */
	public Grid(int x) {
		if(x <= 0) {		//Checks for invalid input
			System.err.println(Errors.INVALID_GRID_SIZE.toString());
		}
		sizeX = x;
		sizeY = x;
		drawGridMap(sizeX, sizeY);
	}
	

	/**
	 * @param size x
	 * @param size y
	 * initializes an empty grid of rectangular size
	 * constructor that takes in two parameters
	 */
	public Grid(int x, int y) {
		if(x <= 0 || y <= 0) {		//Checks for invalid input
			System.err.println(Errors.INVALID_GRID_SIZE.toString());
		}
		sizeX = x;
		sizeY = y;
		gridMap = new Tile[x][y];
		drawGridMap(sizeX, sizeY);
	}
	
	/**
	 * @param int x
	 * @param int y
	 * Create an empty grid of default tiles with dimensions x,y
	 */
	private void drawGridMap(int x, int y) {
		gridMap = new Tile[x][y];
		for(int i = 0; i < gridMap.length; i++) {
			for(int j = 0; j < gridMap[0].length; j++) {
				Tile t = new Tile(i, j);	//Create new empty tile with coordinate informations
				gridMap[i][j] = t;
			}
		}
	}

	/**
	 * @return the sizeX
	 */
	public int getX() {
		return sizeX;
	}

	/**
	 * @return the sizeY
	 */
	public int getY() {
		return sizeY;
	}
	
	/**
	 * @return gridMap
	 */
	public Tile[][] getGridMap() {
		return gridMap;
	}
	
}
