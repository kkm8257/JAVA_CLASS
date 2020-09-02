package Thread_bank_before_Sync;

public class CheckAmount_before extends Thread {

	Share_before sh;

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("гу╟Х : " + (sh.ac1.money + sh.ac2.money));

		}
	}

}
