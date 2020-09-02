package thread_main_3;

public class MyThread_2 extends Thread{
	ShareArea share;
	
	@Override
	public void run() {

		
		while(true) {
			
			System.out.println(share.isDone);
			
			if(share.isDone) {
				System.out.println("гоюл  "+share.num);
				break;
			}
			
			
		}
		
		
			
	
		
	
	}
}
