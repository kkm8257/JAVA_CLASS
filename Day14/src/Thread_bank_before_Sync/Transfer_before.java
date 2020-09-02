package Thread_bank_before_Sync;

public class Transfer_before extends Thread {

	Share_before sh;

	@Override
	public void run() {

		for (int i = 0; i < 30; i++) {

			System.out.println("ac1 출금");
			sh.ac1.money -= 10;
			System.out.println("ac2 입금");
			sh.ac2.money += 10;

		}

	}

}
