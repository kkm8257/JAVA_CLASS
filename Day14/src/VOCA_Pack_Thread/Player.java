package VOCA_Pack_Thread;

import java.util.Random;

public class Player  extends Thread{

	int hp = 80;
	String name=" ";
	SharePart share;
	
	boolean check=false;
	
	
	@Override
	public void run() {
		
		while(true) {
			
			if((share.idx%2==0)&&check==true) {
				
				hp+=2;
				try {
					Thread.sleep(1000);
//					System.out.println(hp);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
		
		
	}
	
	
	
}
