package thread_main;

public class control {

	
	public void init() {
		myThread th = new myThread();

//		th.run()// 잘못된 방식
		th.start();
		for(int i =0;i < 50;i++) {
			System.out.println("컨트롤 : "+i);
		}
	}
}
