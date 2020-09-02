package Thread_EggGame;

public class Duck extends Thread {

	Egg_Box eggBox;

	@Override
	public void run() {

		while (true) {

			synchronized (eggBox) {
				eggBox.egg_count += 1;
				System.out.println("´Þ°¿ÀÇ °³¼ö : " + eggBox.egg_count);
				
			}
			
			try {
				
				Thread.sleep(2000);

			} catch (Exception e) {

				System.out.println(e);

			}


		}

	}

}
