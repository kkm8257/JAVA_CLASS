package thread_main;

public class control {

	
	public void init() {
		myThread th = new myThread();

//		th.run()// �߸��� ���
		th.start();
		for(int i =0;i < 50;i++) {
			System.out.println("��Ʈ�� : "+i);
		}
	}
}
