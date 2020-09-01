package ClassReview;

import java.util.ArrayList;
import java.util.Random;

public class number_4 {


	public static float resultCal(int a, int b, String c) {
		
		
		if(c.equals("+")) {
			return a+b;
		}
		else if(c.equals("-")) {
			return a-b;
		}
		else if(c.equals("*")) {
			return a*b;
		}
		else if(c.equals("/")) {
			return a/b;
		}
		else {
			//잘못된 입력
			return 999999;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		
		
		
		ArrayList<number_1> array = new ArrayList<>();
		
		for (int i = 0 ;  i <5;i++) {
			
			array.add(new number_1(rd.nextInt(10)+1, rd.nextInt(10)+1, number_3.randomSign()));
			//1~10
		}
		
		for (int i = 0 ;  i <5;i++) {//생성된 객체들을 담은 ArrayList안의 값들 모두 출력
			
			System.out.print("index ("+i+") =>  "+array.get(i).num_1+ "   "+array.get(i).num_2+"   "+array.get(i).str);
			//0~9까지의 숫자 랜덤으로 받아서 2개 입력 후 , 사칙연산 랜덤으로 설정
			System.out.println();
		}
		
		
		//////////////위에까지는 number_3클래스와 동일/////
		
		//결과 출력
	
		
		
		
	}
	
}
