 import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		System.out.println(random);
		
		// 11. do the following 10 times
		for (int i = 0; i < 10; i++) {
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
		String answer = JOptionPane.showInputDialog("I Want To Play A Game.");

			// 4. convert the users’ answer to an int (Integer.parseInt(string))
		
		int answer1 = Integer.parseInt(answer);
		
			// 5. if the guess is correct
		
		if (answer1 == random)
		{
			JOptionPane.showMessageDialog(null, "Someday, and that day may never come,\nI will call upon you to do a service for me. \nBut until that day, accept this win as a gift on my \ndaughter's wedding day.");
			System.exit(0);
		}
		else if(answer1 > random)
		{
			JOptionPane.showMessageDialog(null, "Your A Wizard Harry, But You Must Go Lower To Defeat He-Who-Must-Not-Be-Named.");
		}
		
		else if (answer1 < random)
		{
			JOptionPane.showMessageDialog(null, "Go Boldly Where No Man's Gone Before, Captain, We Must Go Higher.");
		}
		
		}
		
			JOptionPane.showMessageDialog(null, "The Force is Weak with this one");

		// 12. tell them they lose
	}
}

