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
		kinds.add("Car리스트 출력");
		kinds.add("Van리스트 출력");
		kinds.add("Truck리스트 출력");
		kinds.add("Bus리스트 출력");
		kinds.add("종료");

		while (true) {

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

				carClient.add(clientName);
				carModel.add(model);
				carColor.add(color);
				carGrade.add(model);

				carList.add(new Car(clientName, model, color, grade));

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

				VanClient.add(clientName);
				VanModel.add(model);
				VanColor.add(color);
				VanGrade.add(model);

				VanList.add(new Van(clientName, model, color, grade));

			} else if (input == 3) {

				System.out.println("고객명 입력 : ");
				clientName = sc.nextLine();

				System.out.println("모델 입력 : ");
				model = sc.nextLine();

				System.out.println("색상 입력 : ");
				color = sc.nextLine();

				System.out.println("등급 입력 : ");
				grade = sc.nextLine();

				TruckClient.add(clientName);
				TruckModel.add(model);
				TruckColor.add(color);
				TruckGrade.add(model);

				TruckList.add(new Truck(clientName, model, color, grade));

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

				BusClient.add(clientName);
				BusModel.add(model);
				BusColor.add(color);
				BusGrade.add(model);

				BusList.add(new Bus(clientName, model, color, grade));

			} else if (input == 5) {   ///////////////////////////조회///////////////////////////

				System.out.println("등록 된 Car의 수 : " + carList.size());
				for (int i = 0; i < carList.size(); i++) {

					System.out.println("고객명 : " + carList.get(i).clientName + "  모델 : " + carList.get(i).model
							+ "  색상 : " + carList.get(i).color + "  등급 : " + carList.get(i).grade);
					System.out.println("출발 여부 : " + carList.get(i).Start());
					System.out.println("가속 여부 : " + carList.get(i).Bust());
					System.out.println("커브 여부 : " + carList.get(i).Curve());
					System.out.println("도착 여부 : " + carList.get(i).Arrive());
					System.out.println("\n");
				}

			}
			
			else if (input == 6) {

				System.out.println("등록 된 Van의 수 : " + VanList.size());
				for (int i = 0; i < VanList.size(); i++) {

					System.out.println("고객명 : " + VanList.get(i).clientName + "  모델 : " + VanList.get(i).model
							+ "  색상 : " + VanList.get(i).color + "  등급 : " + VanList.get(i).grade);
					System.out.println("출발 여부 : " + VanList.get(i).Start());
					System.out.println("가속 여부 : " + VanList.get(i).Bust());
					System.out.println("커브 여부 : " + carList.get(i).Curve());
					System.out.println("도착 여부 : " + VanList.get(i).Arrive());
					System.out.println("\n");
				}

			}
			else if (input == 7) {

				System.out.println("등록 된 Truck의 수 : " + TruckList.size());
				for (int i = 0; i < TruckList.size(); i++) {

					System.out.println("고객명 : " + TruckList.get(i).clientName + "  모델 : " + TruckList.get(i).model
							+ "  색상 : " + TruckList.get(i).color + "  등급 : " + TruckList.get(i).grade);
					System.out.println("출발 여부 : " + TruckList.get(i).Start());
					System.out.println("가속 여부 : " + TruckList.get(i).Bust());
					System.out.println("커브 여부 : " + carList.get(i).Curve());
					System.out.println("도착 여부 : " + TruckList.get(i).Arrive());
					System.out.println("\n");
				}

			}
			else if (input == 8) {

				System.out.println("등록 된 Van의 수 : " + VanList.size());
				for (int i = 0; i < VanList.size(); i++) {

					System.out.println("고객명 : " + VanList.get(i).clientName + "  모델 : " + VanList.get(i).model
							+ "  색상 : " + VanList.get(i).color + "  등급 : " + VanList.get(i).grade);
					System.out.println("출발 여부 : " + VanList.get(i).Start());
					System.out.println("가속 여부 : " + VanList.get(i).Bust());
					System.out.println("커브 여부 : " + carList.get(i).Curve());
					System.out.println("도착 여부 : " + VanList.get(i).Arrive());
					System.out.println("\n");
				}

			}
			else if(input == 9) {
				System.out.println("종료");
				break;
			}
		}
	}
}
