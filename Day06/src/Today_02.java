import java.util.ArrayList;
import java.util.Scanner;

public class Today_02 {
	
		
	

	public int plusMethod(int num1, int num2) {

		int result = num1 + num2;

		return result;

	}
	

	static int plusArrayAll(int[] array) {

		int result = 0;

		System.out.println("�迭�� ��� ���� ���մϴ�.");
		for (int i = 0; i < array.length; i++) {

			if (i == (array.length - 1)) {

				System.out.println(array[i]);
				result = result + array[i];

			} else {
				System.out.print(array[i] + " + ");
				result = result + array[i];

			}

		}

		return result;

	}

	static int plusList(ArrayList<Integer> array) {

		int result = 0;

		System.out.println("�迭�� ��� ���� ���մϴ�.");
		for (int i = 0; i < array.size(); i++) {

			if (i == (array.size() - 1)) {

				System.out.println(array.get(i));
				result = result + array.get(i);

			} else {
				System.out.print(array.get(i) + " + ");
				result = result + array.get(i);

			}

		}

		return result;

	}
	

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� 1 �Է� : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("���� 2 �Է� : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		
		///
		Today_02 AD = new Today_02();
	
		///

		System.out.println("1�� �޼ҵ��� ��� �� : " + AD.plusMethod(num1, num2) + "\n\n");

		System.out.println("���̰� 5�� INT �迭�� ����ڽ��ϴ�. ");
		int[] array = new int[5];
		ArrayList<Integer> Listarray= new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "��° ���ڸ� �Է����ּ���\n>>>");
			array[i] = Integer.parseInt(sc.nextLine());
			Listarray.add(array[i]);
		}
		System.out.println("\n");
		System.out.println("\n\n2��° �޼ҵ��� ��� ���� " + plusArrayAll(array));
		
		System.out.println("\n");
		System.out.println("\n\n3��° �޼ҵ��� ��� ���� " + plusList(Listarray));
		

		sc.close();

		
		
	}
	
	

	
}

