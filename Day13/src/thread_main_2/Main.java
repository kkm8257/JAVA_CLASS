package thread_main_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread th = new Thread(new MyThread());
		
		th.start();
		
	}

}
