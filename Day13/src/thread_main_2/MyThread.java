package thread_main_2;

public class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i<30 ; i++) {
			
			
			System.out.println("¾²·¹µå");
			try {
				
				Thread.sleep(10);
				
			}
			catch(InterruptedException e){
				e.printStackTrace();
				
			}
		}
		
		
	}

	
	
	
}
