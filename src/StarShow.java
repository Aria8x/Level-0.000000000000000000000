import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/* Before beginning recipe: 
* 1. ask students to find and explain the method in this recipe. 
* 2. ask students how they might use the method to make the picture in the laminated hand-outs. */

public class StarShow {
	
	Robot robot = new Robot("batman");
	
	void makeStars() {
		
		drawStar(150);	//5. delete this line. you will draw the star again in step 8.
		// 13. Set the speed to 1

		int Xposition = 10;

		int Yposition = 950;

		int starSize = 25;

		// 12. Repeat the steps #19 to #18, 30 times

			// 19. Set the pen width to i 

			robot.setX(Xposition);

			robot.setY(Yposition);
	
		drawStar(starSize );
	
			// 14. Increase the X position by star size. See Figure 2.
	
			// 15. decrease the Y position by star size. See Figure 3.
	
			// 16. Increase the star size by 20
	
			// 17. Turn the robot 12 degrees
	
			// 18. Make each star a different random color like in Figure 4. 

	}

	private void drawStar(int starSize) {
		robot.penDown();

		for (int i = 0; i < 4; i++) {

			robot.move(starSize);
	
			robot.turn(144);
		}
			
	}
	
	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}





