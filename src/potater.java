public class potater 
{
	public static void main(String[] args) 
	{	
		
		String meow = "po-tate-ere";
		
		for (int w = 0; w < 3; w++) {
		
		for (int i = 1; i < 4; i++) {
			
			speak(i + meow);
		}
			speak("4");
			try {
				Thread.sleep(540);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for (int h = 5; h < 8; h++) {
			
			speak(h + meow);
			}
			
			speak("and more!"); 
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
	static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	    }

}
