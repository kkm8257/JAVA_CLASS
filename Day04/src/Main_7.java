import java.util.Random;
import java.util.Scanner;

public class Main_7 {

	public static void main(String[] args) {

		int num[] = new int[2];
		int result=0;
		Scanner sc = new Scanner(System.in);

		Random rd = new Random();

		String[] Sign = new String[3];

		Sign[0] = "+";
		Sign[1] = "-";
		Sign[2] = "*";

		for (int i = 0; i < 2; i++) {

			System.out.print((i + 1) + "번째 숫자 입력 >>>");
			num[i] = Integer.parseInt(sc.nextLine());

		}

		int checkSign = rd.nextInt(3);

		System.out.println("선택된 연산기호 : " + Sign[checkSign]);
		
		if(checkSign==0) {
			
			result=num[0]+num[1];
			System.out.println("결과값 : "+result);
		}
		else if(checkSign==1) {
			result=num[0]-num[1];
			System.out.println("결과값 : "+result);
			
		}
		else if(checkSign==2) {
			result=num[0]*num[1];
			System.out.println("결과값 : "+result);
			
		}

	}
}
