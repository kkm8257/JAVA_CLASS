import java.util.Scanner;

public class Main_4_Scanner {

	public static void main(String[] args) {
		

		
		Scanner sc=new Scanner (System.in);
		System.out.println("----------      숫자 계산      ----------");
		System.out.print("첫 숫자를 입력하세요 : ");
		int first = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 숫자를 입력하세요 : ");
		int second = Integer.parseInt(sc.nextLine());
		
		int result= first + second;
		System.out.println("결과 값 : "+result);
		System.out.println("----------      끝         ----------");


//		String a="10";
//		String b="20";
//		System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
	}
	




}





