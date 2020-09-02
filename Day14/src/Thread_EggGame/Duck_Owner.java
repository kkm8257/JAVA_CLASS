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
					System.out.println("달걀을 모두 회수합니다.");

					eggBox.packed_egg += eggBox.egg_count;
					eggBox.egg_count = 0;

					System.out.println("---------------------------");
					System.out.println("남은 달걀 : " + eggBox.egg_count);
					System.out.println("포장된 달걀 : " + eggBox.packed_egg);
					System.out.println("---------------------------");

					
					try {
						Thread.sleep(7000);
					} catch (Exception e) {
						System.out.println(e);
					}
					
					
					//이거 syncronized 할때, try catch문 사용시 , sleep 에만 사용해주는게좋음
					//try 안에다가 싱크로나이즈 싹다 넣고 막 돌렸더니, 다른 클래스의 싱크로나이즈와 충돌발생
					
				}

				

			}
		}

	}
}
