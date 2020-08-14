import java.util.Scanner;

public class Today_01 {

	static void showGUGU(int num) {
		System.out.println("------------------구구단 출력------------------");
		for (int i = 1; i < 10; i++) {

			System.out.println(num + " X " + i);

		}
		System.out.println("------------------------------------------");

	}

	static void showCal(int num1, String sign, int num2) {
		System.out.println("------------------사칙연산 출력------------------");

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
		
		System.out.println("몇 단을 출력 할까요?");
		int tempNum=Integer.parseInt(sc.nextLine());
		showGUGU(tempNum);
		
		
		System.out.println("사칙연산을 합니다.");
		System.out.println("첫번 째 숫자를 입력해 주세요.");
		int num1=Integer.parseInt(sc.nextLine());
		System.out.println("두번 째 숫자를 입력해 주세요.");
		int num2=Integer.parseInt(sc.nextLine());
		System.out.println("연산기호를 입력해 주세요.");
		String sign = sc.nextLine();
		
		showCal(num1, sign, num2);
		
	}
}
