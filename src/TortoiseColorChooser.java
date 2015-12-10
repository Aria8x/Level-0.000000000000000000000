// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {
		
		int random = new Random().nextInt(200);
		int random2 = new Random().nextInt(200);
		int random3 = new Random().nextInt(200);
		int random4 = new Random().nextInt(200);
		
		
		
		//3. ask the user what color they would like the tortoise to draw
		String color = JOptionPane.showInputDialog("What is your least favorite color? \n");
		
		for (int i = 0; i < 10; i++) {
		
		//4. use an if/else statement to set the pen color that the user requested
		if(color.equalsIgnoreCase("red"))
		{
			Tortoise.setPenColor(Colors.Yellows.Khaki);
		}
		
		else
		{
			Tortoise.setPenColor(Colors.Yellows.Khaki);
		} 

//5. if the user doesn’t enter anything, choose a random color

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		Tortoise.setPenWidth(10);
		
		//1. make the tortoise draw a shape (this will take more than one line of code)
	Tortoise.penDown();
	{
		{
			Tortoise.setAngle(90);
			Tortoise.move(100);
			for (int j = 0; j < 100; j++) {
				
				Tortoise.setSpeed(10);
				Tortoise.move(random);
				Tortoise.turn(random);
			}
			Tortoise.setAngle(90);
			Tortoise.move(100);
			for (int j = 0; j < 100; j++) {
				
				Tortoise.setSpeed(10);
				Tortoise.move(random2);
				Tortoise.turn(random2);	
			}
		}
	}
}
		}
}
}