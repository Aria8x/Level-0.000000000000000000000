import java.net.URI;

import javax.swing.JOptionPane;

public class m {
	
	public static void main(String[] args) {
	
		String answer = JOptionPane.showInputDialog("What is ur favorite thingamagiceeeeer?");
		
		if(answer.equalsIgnoreCase("imagination"))
		{
			playVideo("https://www.youtube.com/watch?v=NaSd2d5rwPE");
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "WRONG! IT WAS IMAAAAAAAAAAAAAAGINATION!!!!!!");
		}
		
	}
	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
