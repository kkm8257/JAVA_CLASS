package Thread_EggGame;

import java.util.Scanner;

public class Duck_Owner extends Thread {

	Egg_Box eggBox;
	Scanner sc = new Scanner(System.in);

	int countSec = 0;

	String input = " ";

	@Override
	public void run() {

		while (true) {

			if (sc.nextLine() != null) {

				System.out.println("HIHIHIHI");
				synchronized (eggBox) {
					System.out.println("�ް��� ��� ȸ���մϴ�.");

					eggBox.packed_egg += eggBox.egg_count;
					eggBox.egg_count = 0;

					System.out.println("---------------------------");
					System.out.println("���� �ް� : " + eggBox.egg_count);
					System.out.println("����� �ް� : " + eggBox.packed_egg);
					System.out.println("---------------------------");

					
					try {
						Thread.sleep(7000);
					} catch (Exception e) {
						System.out.println(e);
					}
					
					
					//�̰� syncronized �Ҷ�, try catch�� ���� , sleep ���� ������ִ°�����
					//try �ȿ��ٰ� ��ũ�γ����� �ϴ� �ְ� �� ���ȴ���, �ٸ� Ŭ������ ��ũ�γ������ �浹�߻�
					
				}

				

			}
		}

	}
}
