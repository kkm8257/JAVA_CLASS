package thread_main_3;

public class Main {

	public static void main(String[] args) {

		
		ShareArea share=new ShareArea();
		
		MyThread_1 th1= new MyThread_1();
		th1.share= share;
		
		MyThread_2 th2=new MyThread_2();
		th2.share =share;
		
		//�������� ���� share�� ���۷���Ÿ���̱⶧���� �ּҰ��� �����Ѵ�.
		
		
		th1.start();
		th2.start();
		
		//�ڵ峻�븸���� 2���� �����尡 �ξ������� ����
		//������ �������� t1�� ���� ���۵ǵ� t2������ ����� �ȴ�.
		
		
	}

}
