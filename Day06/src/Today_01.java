import java.util.Scanner;

public class Today_01 {

	static void showGUGU(int num) {
		System.out.println("------------------������ ���------------------");
		for (int i = 1; i < 10; i++) {

			System.out.println(num + " X " + i);

		}
		System.out.println("------------------------------------------");

	}

	static void showCal(int num1, String sign, int num2) {
		System.out.println("------------------��Ģ���� ���------------------");

		if (sign.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

		} else if (sign.equals("-")) {

			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		} else if (sign.equals("*")) {

			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		}

		else if (sign.equals("/")) {

			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		}
		System.out.println("---------------------------------------------");

	}

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("�� ���� ��� �ұ��?");
		int tempNum=Integer.parseInt(sc.nextLine());
		showGUGU(tempNum);
		
		
		System.out.println("��Ģ������ �մϴ�.");
		System.out.println("ù�� ° ���ڸ� �Է��� �ּ���.");
		int num1=Integer.parseInt(sc.nextLine());
		System.out.println("�ι� ° ���ڸ� �Է��� �ּ���.");
		int num2=Integer.parseInt(sc.nextLine());
		System.out.println("�����ȣ�� �Է��� �ּ���.");
		String sign = sc.nextLine();
		
		showCal(num1, sign, num2);
		
	}
}
