import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GridTest {
	private Grid classTester1;
	private Grid classTester2;
	private Grid classTester3;
	
	@Test
	void testGrid() {
		boolean exit = false;
		classTester1 = new Grid();
		Tile[][] tempArr = classTester1.gridMap;
		for(int i = 0; i < 60; i++) {
			for(int j = 0; j < 60; j++) {
				if(tempArr[i][j].isOccupied != false && tempArr[i][j].occupant != null && tempArr[i][j].locX != i && tempArr[i][j].locY != j) {
					exit = true;
					break;
				}
			}
			if(exit == true) {
				break;
			}
		}
		assertFalse(exit);
	}

	@Test
	void testGridInt() {
		boolean exit = false;
		classTester2 = new Grid(5);
		Tile[][] tempArr = classTester2.gridMap;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(tempArr[i][j].isOccupied != false && tempArr[i][j].occupant != null && tempArr[i][j].locX != i && tempArr[i][j].locY != j) {
					exit = true;
					break;
				}
			}
			if(exit == true) {
				break;
			}
		}
		assertFalse(exit);
	}

	@Test
	void testGridIntInt() {
		boolean exit = false;
		classTester3 = new Grid(4, 5);
		Tile[][] tempArr = classTester3.gridMap;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				if(tempArr[i][j].isOccupied != false && tempArr[i][j].occupant != null && tempArr[i][j].locX != i && tempArr[i][j].locY != j) {
					exit = true;
					break;
				}
			}
			if(exit == true) {
				break;
			}
		}
		assertFalse(exit);
	}
}
