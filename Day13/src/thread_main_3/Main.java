package thread_main_3;

public class Main {

	public static void main(String[] args) {

		
		ShareArea share=new ShareArea();
		
		MyThread_1 th1= new MyThread_1();
		th1.share= share;
		
		MyThread_2 th2=new MyThread_2();
		th2.share =share;
		
		//여기위에 적은 share는 레퍼런스타입이기때문에 주소값을 공유한다.
		
		
		th1.start();
		th2.start();
		
		//코드내용만봐도 2번쨰 쓰레드가 훨씬업무가 적다
		//실제로 돌려보면 t1이 먼저 시작되도 t2가먼저 출력이 된다.
		
		
	}

}
