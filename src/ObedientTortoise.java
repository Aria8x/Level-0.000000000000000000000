import org.teachingextensions.logo.Tortoise;

public class ObedientTortoise 
{
	public static void main(String[] args) 
	{
		Tortoise.penUp();
		Tortoise.move(100);
		Tortoise.move(-100);
		Tortoise.penDown();
		Tortoise.setPenWidth(500);
		Tortoise.setSpeed(3);

		drawSquare();
		
		Tortoise.setSpeed(6);
		Tortoise.penUp();
		
		Tortoise.setAngle(90);
		Tortoise.move(1000);
		Tortoise.setPenWidth(100);
		Tortoise.penDown();
		
		Tortoise.setSpeed(3);
		drawTraingle();
		
		Tortoise.penUp();
		
		Tortoise.setAngle(90);
		Tortoise.move(100);
		Tortoise.setPenWidth(25);
		Tortoise.setAngle(0);
		Tortoise.move(300);
		Tortoise.penDown();
		
		Tortoise.setSpeed(10);
		drawCircle();
	}

	private static void drawCircle() {
		for (int i = 0; i < 99999; i++) {
			Tortoise.move(5);
			Tortoise.turn(1.3);
		}
	}

	private static void drawTraingle() {
		for (int i = 0; i < 3; i++) {
		Tortoise.turn(-120);
		Tortoise.move(500);
		}
	}

	private static void drawSquare() {
		Tortoise.move(-450);
	}
}
