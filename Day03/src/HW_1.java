import java.util.Scanner;

public class HW_1 {
	public static void main(String[] args) {
		// 숫자하나를 입력받아서 for문 이용, 입력받은 숫자의 구구단을 화면에 출력

		Scanner sc= new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i =1;i<10;i++) {
			
			System.out.println(num+" X "+ i +" = "+i*num);
			
		}
		
		
	}
}
