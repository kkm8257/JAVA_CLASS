package MethodReview;

import java.util.Scanner;

public class number_5 {

	public static void cal(int[] arr, String str) {

		int result=arr[0];
		
		if (str.equals("+")) {
			System.out.println("���ϱ� �ǽ�");
			for(int i =1;i<arr.length;i++) {
				result=result+arr[i];
				
			}
			System.out.println(result);
		}

		else if (str.equals("-")) {
			System.out.println("���� �ǽ�");
			for(int i =1;i<arr.length;i++) {
				result=result-arr[i];
				
			}
			System.out.println(result);
		} else if (str.equals("*")) {
			System.out.println("���ϱ� �ǽ�");
			for(int i =1;i<arr.length;i++) {
				result=result*arr[i];
				
			}
			System.out.println(result);
		} else if (str.equals("/")) {
			System.out.println("������ �ǽ�");
			for(int i =1;i<arr.length;i++) {
				result=result/arr[i];
				
			}
			System.out.println(result);
		}

	}

	public static void main(String[] args) {

		int arr[]=new int[4];
		arr[0]=104;
		arr[1]=4;
		arr[2]=2;
		arr[3]=3;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("�����ȣ  +  -  *  /   �� �Է����ּ���.");
		String temp =sc.nextLine();
		
		cal(arr,temp);
		
		
		
	}

}
