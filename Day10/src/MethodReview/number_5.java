package MethodReview;

import java.util.Scanner;

public class number_5 {

	public static void cal(int[] arr, String str) {

		int result=arr[0];
		
		if (str.equals("+")) {
			System.out.println("더하기 실시");
			for(int i =1;i<arr.length;i++) {
				result=result+arr[i];
				
			}
			System.out.println(result);
		}

		else if (str.equals("-")) {
			System.out.println("빼기 실시");
			for(int i =1;i<arr.length;i++) {
				result=result-arr[i];
				
			}
			System.out.println(result);
		} else if (str.equals("*")) {
			System.out.println("곱하기 실시");
			for(int i =1;i<arr.length;i++) {
				result=result*arr[i];
				
			}
			System.out.println(result);
		} else if (str.equals("/")) {
			System.out.println("나누기 실시");
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
		
		System.out.println("연산기호  +  -  *  /   중 입력해주세요.");
		String temp =sc.nextLine();
		
		cal(arr,temp);
		
		
		
	}

}
