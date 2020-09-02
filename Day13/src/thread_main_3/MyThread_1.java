package thread_main_3;

public class MyThread_1 extends Thread{

	ShareArea share;
	
	
	@Override
	public void run() {

		
		share.num = 0;
	
		for(int i =0; i<100000;i++) {
			
			
			for(int j =0;j<10000;j++) {
				if(j%2==0) {
					share.num+=100;
				}
				else {
					share.num-=50;
				}
				
				
			}
		}
		
		share.num=-1;
		share.isDone=true;
		
	
	}
	
}
