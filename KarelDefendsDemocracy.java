package week1;

import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	// Checks Rectangle for Chad
	public void run() {
		move();
		while (frontIsClear()) {
			if (beepersPresent()) {
				moveTwice();
			} else {
				checkSouthForBeepers();
				checkNorthForBeepers();
				moveTwice();
			}
		}

			
	}
	// Checks for Chad to the South
	public void checkSouthForBeepers() {
		turnRight();
		move();
				if (beepersPresent()) {
					pickAllBeeper();
					repositionSouth();
				} else {
					repositionSouth();
				}
	}
		
	
	
	// Checks for Chad to the North
	public void checkNorthForBeepers() {
		if (beepersPresent()) {
			pickAllBeeper();
			repositionNorth();
		} else {
			repositionNorth();
		}
	}	
	
	public void repositionSouth() {
		turnAround();
		moveTwice();
	}
	
	
	public void repositionNorth() {
		turnAround();
		move();
		turnLeft();
	}
		
	public void moveTwice() {
		move();
		move();
	}
	//Picks up all beepers
	public void pickAllBeeper() {
		while (beepersPresent()) {
			pickBeeper();
		}
	}	
	
}	
