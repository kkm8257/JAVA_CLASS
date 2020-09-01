package MethodReview;

import java.util.Scanner;

public class number_2 {

	//파라미터로 입력받은 int형을 숫자에 해당하는 구구단을 출력하는 메소드 만들기
	
	
	public static void guguInput(int A) {
		
		int temp = A;
		
		System.out.println("<<<<  "+temp+"단 출력    >>>>");
		
		for(int i =1;i<10;i++) {
			System.out.println(temp+ " x "+i+" = "+(i*temp));
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int A;
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자하나 입력 :");
		A=Integer.parseInt(sc.nextLine());
		guguInput(A);
		
	}
	
}
