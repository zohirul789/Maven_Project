package abstraction;

public class Test_Abstraction {

	public static void main(String[] args) {
		MobileUser mu;
		mu = new Jobrul();
		mu.sendMessege();
		mu.recived();
		mu.call();
		
		mu = new Kamrul();
		mu.sendMessege();
		mu.recived();
		mu.call();

	}

}
