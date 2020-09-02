package Thread_bank_after_Sync;

public class Transfer extends Thread {

	Share sh;

	@Override
	public void run() {

		synchronized (sh) {

			for (int i = 0; i < 20; i++) {

				System.out.println("ac1 출금");
				sh.ac1.money -= 10;
				System.out.println("ac2 입금");
				sh.ac2.money += 10;

			}
		}

	}

}
