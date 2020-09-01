package Pack01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main_01 {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		// Car Van Truck Bus

		String clientName;
		String model;
		String color;
		String grade;

		int Ranint = 0;

		ArrayList<String> kinds = new ArrayList<>();

		kinds.add("Car");
		kinds.add("Van");
		kinds.add("Truck");
		kinds.add("Bus");

		for (int i = 0; i < kinds.size(); i++) {

			System.out.print("(" + (i + 1) + ")" + kinds.get(i) + "   ");

		}

		System.out.print("\n차종을 선택하세요\n>>>");
		int input = Integer.parseInt(sc.nextLine());

		if (input == 1) {

			System.out.println("고객명 입력 : ");
			clientName = sc.nextLine();

			System.out.println("모델 입력 : ");
			model = sc.nextLine();

			System.out.println("색상 입력 : ");
			color = sc.nextLine();

			System.out.println("등급 입력 : ");
			grade = sc.nextLine();
			Car c1 = new Car(clientName, model, color, grade);
			System.out.println("--------------------------------------");
			System.out.println("달립니다!");
			System.out.println("--------------------------------------");

			System.out.println(c1.Start());
			for (int i = 0; i < 10; i++) {

				Ranint = rd.nextInt(4);
				if (Ranint == 0) {
					System.out.println(c1.Straight());

				} else if (Ranint == 1) {

					System.out.println(c1.Uturn());
				} else if (Ranint == 2) {

					System.out.println(c1.Bust());
				}

				else if (Ranint == 3) {

					System.out.println(c1.Curve());
				}

			}

			System.out.println(c1.Arrive());
		}

		else if (input == 2) {

			System.out.println("고객명 입력 : ");
			clientName = sc.nextLine();

			System.out.println("모델 입력 : ");
			model = sc.nextLine();

			System.out.println("색상 입력 : ");
			color = sc.nextLine();

			System.out.println("등급 입력 : ");
			grade = sc.nextLine();

			Van c1 = new Van(clientName, model, color, grade);
			System.out.println("--------------------------------------");
			System.out.println("달립니다!");
			System.out.println("--------------------------------------");

			System.out.println(c1.Start());
			for (int i = 0; i < 10; i++) {

				Ranint = rd.nextInt(4);
				if (Ranint == 0) {
					System.out.println(c1.Straight());

				} else if (Ranint == 1) {

					System.out.println(c1.Uturn());
				} else if (Ranint == 2) {

					System.out.println(c1.Bust());
				}

				else if (Ranint == 3) {

					System.out.println(c1.Curve());
				}

			}
			System.out.println(c1.Arrive());

		} else if (input == 3) {

			System.out.println("고객명 입력 : ");
			clientName = sc.nextLine();

			System.out.println("모델 입력 : ");
			model = sc.nextLine();

			System.out.println("색상 입력 : ");
			color = sc.nextLine();

			System.out.println("등급 입력 : ");
			grade = sc.nextLine();

			Truck c1 = new Truck(clientName, model, color, grade);

			System.out.println("--------------------------------------");
			System.out.println("달립니다!");
			System.out.println("--------------------------------------");

			System.out.println(c1.Start());
			for (int i = 0; i < 10; i++) {

				Ranint = rd.nextInt(4);
				if (Ranint == 0) {
					System.out.println(c1.Straight());

				} else if (Ranint == 1) {

					System.out.println(c1.Uturn());
				} else if (Ranint == 2) {

					System.out.println(c1.Bust());
				}

				else if (Ranint == 3) {

					System.out.println(c1.Curve());
				}

			}
			System.out.println(c1.Arrive());
			
			

		}

		else if (input == 4) {

			System.out.println("고객명 입력 : ");
			clientName = sc.nextLine();

			System.out.println("모델 입력 : ");
			model = sc.nextLine();

			System.out.println("색상 입력 : ");
			color = sc.nextLine();

			System.out.println("등급 입력 : ");
			grade = sc.nextLine();

			Bus c1 = new Bus(clientName, model, color, grade);
			System.out.println("--------------------------------------");
			System.out.println("달립니다!");
			System.out.println("--------------------------------------");

			System.out.println(c1.Start());
			for (int i = 0; i < 10; i++) {

				Ranint = rd.nextInt(4);
				if (Ranint == 0) {
					System.out.println(c1.Straight());

				} else if (Ranint == 1) {

					System.out.println(c1.Uturn());
				} else if (Ranint == 2) {

					System.out.println(c1.Bust());
				}

				else if (Ranint == 3) {

					System.out.println(c1.Curve());
				}

			}
			System.out.println(c1.Arrive());

		}

	}
}
