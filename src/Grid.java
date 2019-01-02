
public class Grid {
	
	protected int sizeX;
	protected int sizeY;
	Tile[][] gridMap;
	
	/**
	 * @param size x
	 * @param size y
	 * initializes an empty grid
	 * default constructor
	 */
	public Grid(int x, int y) {
		gridMap = new Tile[x][y];
		for(int i = 0; i < gridMap.length; i++) {
			for(int j = 0; j < gridMap[0].length; j++) {
				Tile t = new Tile();
				gridMap[i][j] = t;
			}
		}
	}
	
}
