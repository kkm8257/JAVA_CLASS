package MethodReview;

import java.util.Scanner;

public class number_2 {

	//�Ķ���ͷ� �Է¹��� int���� ���ڿ� �ش��ϴ� �������� ����ϴ� �޼ҵ� �����
	
	
	public static void guguInput(int A) {
		
		int temp = A;
		
		System.out.println("<<<<  "+temp+"�� ���    >>>>");
		
		for(int i =1;i<10;i++) {
			System.out.println(temp+ " x "+i+" = "+(i*temp));
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int A;
		Scanner sc= new Scanner(System.in);
		System.out.println("�����ϳ� �Է� :");
		A=Integer.parseInt(sc.nextLine());
		guguInput(A);
		
	}
	
}
