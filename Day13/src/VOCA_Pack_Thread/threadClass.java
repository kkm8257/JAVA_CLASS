package VOCA_Pack_Thread;

public class threadClass extends Thread {

	float count = 0;

	@Override
	public void run() {

		while (true) {
			try {

				Thread.sleep(1000);
				this.count = this.count + 1;
//				System.out.println(this.count + "√ ");

			} 
			catch (Exception e) {
				System.out.println(e);
			}

		}

	}

}
