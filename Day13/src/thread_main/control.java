package thread_main;

public class control {

	
	public void init() {
		myThread th = new myThread();

//		th.run()// 肋给等 规侥
		th.start();
		for(int i =0;i < 50;i++) {
			System.out.println("牧飘费 : "+i);
		}
	}
}
