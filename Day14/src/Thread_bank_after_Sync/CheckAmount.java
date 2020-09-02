package Thread_bank_after_Sync;

public class CheckAmount extends Thread {

	Share sh;

	@Override
	public void run() {

		synchronized (sh) {
			for (int i = 0; i < 7; i++) {
				System.out.println("гу╟Х : " + (sh.ac1.money + sh.ac2.money));

			}
		}
		
	}

}
