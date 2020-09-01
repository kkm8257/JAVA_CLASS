package Pack02.copy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Car Van Truck Bus

		String clientName;
		String model;
		String color;
		String grade;

		ArrayList<Car> carList = new ArrayList<>();
		ArrayList<String> carClient = new ArrayList<>();
		ArrayList<String> carModel = new ArrayList<>();
		ArrayList<String> carColor = new ArrayList<>();
		ArrayList<String> carGrade = new ArrayList<>();

		ArrayList<Van> VanList = new ArrayList<>();
		ArrayList<String> VanClient = new ArrayList<>();
		ArrayList<String> VanModel = new ArrayList<>();
		ArrayList<String> VanColor = new ArrayList<>();
		ArrayList<String> VanGrade = new ArrayList<>();

		ArrayList<Truck> TruckList = new ArrayList<>();
		ArrayList<String> TruckClient = new ArrayList<>();
		ArrayList<String> TruckModel = new ArrayList<>();
		ArrayList<String> TruckColor = new ArrayList<>();
		ArrayList<String> TruckGrade = new ArrayList<>();

		ArrayList<Bus> BusList = new ArrayList<>();
		ArrayList<String> BusClient = new ArrayList<>();
		ArrayList<String> BusModel = new ArrayList<>();
		ArrayList<String> BusColor = new ArrayList<>();
		ArrayList<String> BusGrade = new ArrayList<>();

		ArrayList<String> kinds = new ArrayList<>();

		kinds.add("Car");
		kinds.add("Van");
		kinds.add("Truck");
		kinds.add("Bus");
		kinds.add("Car����Ʈ ���");
		kinds.add("Van����Ʈ ���");
		kinds.add("Truck����Ʈ ���");
		kinds.add("Bus����Ʈ ���");
		kinds.add("����");

		while (true) {

			for (int i = 0; i < kinds.size(); i++) {

				System.out.print("(" + (i + 1) + ")" + kinds.get(i) + "   ");

			}

			System.out.print("\n������ �����ϼ���\n>>>");
			int input = Integer.parseInt(sc.nextLine());

			if (input == 1) {

				System.out.println("���� �Է� : ");
				clientName = sc.nextLine();

				System.out.println("�� �Է� : ");
				model = sc.nextLine();

				System.out.println("���� �Է� : ");
				color = sc.nextLine();

				System.out.println("��� �Է� : ");
				grade = sc.nextLine();

				carClient.add(clientName);
				carModel.add(model);
				carColor.add(color);
				carGrade.add(model);

				carList.add(new Car(clientName, model, color, grade));

			}

			else if (input == 2) {

				System.out.println("���� �Է� : ");
				clientName = sc.nextLine();

				System.out.println("�� �Է� : ");
				model = sc.nextLine();

				System.out.println("���� �Է� : ");
				color = sc.nextLine();

				System.out.println("��� �Է� : ");
				grade = sc.nextLine();

				VanClient.add(clientName);
				VanModel.add(model);
				VanColor.add(color);
				VanGrade.add(model);

				VanList.add(new Van(clientName, model, color, grade));

			} else if (input == 3) {

				System.out.println("���� �Է� : ");
				clientName = sc.nextLine();

				System.out.println("�� �Է� : ");
				model = sc.nextLine();

				System.out.println("���� �Է� : ");
				color = sc.nextLine();

				System.out.println("��� �Է� : ");
				grade = sc.nextLine();

				TruckClient.add(clientName);
				TruckModel.add(model);
				TruckColor.add(color);
				TruckGrade.add(model);

				TruckList.add(new Truck(clientName, model, color, grade));

			}

			else if (input == 4) {

				System.out.println("���� �Է� : ");
				clientName = sc.nextLine();

				System.out.println("�� �Է� : ");
				model = sc.nextLine();

				System.out.println("���� �Է� : ");
				color = sc.nextLine();

				System.out.println("��� �Է� : ");
				grade = sc.nextLine();

				BusClient.add(clientName);
				BusModel.add(model);
				BusColor.add(color);
				BusGrade.add(model);

				BusList.add(new Bus(clientName, model, color, grade));

			} else if (input == 5) {   ///////////////////////////��ȸ///////////////////////////

				System.out.println("��� �� Car�� �� : " + carList.size());
				for (int i = 0; i < carList.size(); i++) {

					System.out.println("���� : " + carList.get(i).clientName + "  �� : " + carList.get(i).model
							+ "  ���� : " + carList.get(i).color + "  ��� : " + carList.get(i).grade);
					System.out.println("��� ���� : " + carList.get(i).Start());
					System.out.println("���� ���� : " + carList.get(i).Bust());
					System.out.println("Ŀ�� ���� : " + carList.get(i).Curve());
					System.out.println("���� ���� : " + carList.get(i).Arrive());
					System.out.println("\n");
				}

			}
			
			else if (input == 6) {

				System.out.println("��� �� Van�� �� : " + VanList.size());
				for (int i = 0; i < VanList.size(); i++) {

					System.out.println("���� : " + VanList.get(i).clientName + "  �� : " + VanList.get(i).model
							+ "  ���� : " + VanList.get(i).color + "  ��� : " + VanList.get(i).grade);
					System.out.println("��� ���� : " + VanList.get(i).Start());
					System.out.println("���� ���� : " + VanList.get(i).Bust());
					System.out.println("Ŀ�� ���� : " + carList.get(i).Curve());
					System.out.println("���� ���� : " + VanList.get(i).Arrive());
					System.out.println("\n");
				}

			}
			else if (input == 7) {

				System.out.println("��� �� Truck�� �� : " + TruckList.size());
				for (int i = 0; i < TruckList.size(); i++) {

					System.out.println("���� : " + TruckList.get(i).clientName + "  �� : " + TruckList.get(i).model
							+ "  ���� : " + TruckList.get(i).color + "  ��� : " + TruckList.get(i).grade);
					System.out.println("��� ���� : " + TruckList.get(i).Start());
					System.out.println("���� ���� : " + TruckList.get(i).Bust());
					System.out.println("Ŀ�� ���� : " + carList.get(i).Curve());
					System.out.println("���� ���� : " + TruckList.get(i).Arrive());
					System.out.println("\n");
				}

			}
			else if (input == 8) {

				System.out.println("��� �� Van�� �� : " + VanList.size());
				for (int i = 0; i < VanList.size(); i++) {

					System.out.println("���� : " + VanList.get(i).clientName + "  �� : " + VanList.get(i).model
							+ "  ���� : " + VanList.get(i).color + "  ��� : " + VanList.get(i).grade);
					System.out.println("��� ���� : " + VanList.get(i).Start());
					System.out.println("���� ���� : " + VanList.get(i).Bust());
					System.out.println("Ŀ�� ���� : " + carList.get(i).Curve());
					System.out.println("���� ���� : " + VanList.get(i).Arrive());
					System.out.println("\n");
				}

			}
			else if(input == 9) {
				System.out.println("����");
				break;
			}
		}
	}
}
