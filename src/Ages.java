public class Ages {

	public static void main(String[] args) {

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			speak(i + "");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("BLAST OFF!");
		speak("BLAST OFF!");
	}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
