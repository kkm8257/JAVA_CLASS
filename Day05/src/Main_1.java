
public class Main_1 {

	public static void main(String[] args) {

		int num = 30;

		switch (num) {

		case 50:
			System.out.println("50");
		case 30:
			System.out.println("30");
		case 40:
			System.out.println("40");

		case 10:
			System.out.println("10");

		default:
			System.out.println("default");

		}
		// break가 없으면 case가 30인 부분부터 쭈욱 default까지 실행한다
		System.out.println("--------------------------------------------------");
	
		switch (num) {

		case 50:
			System.out.println("50");
		case 30:
			System.out.println("30");
			break;
		case 40:
			System.out.println("40");

		case 10:
			System.out.println("10");

		default:
			System.out.println("default");

		}

	}
}
