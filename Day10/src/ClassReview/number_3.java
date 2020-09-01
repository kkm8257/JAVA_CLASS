package ClassReview;

import java.util.ArrayList;
import java.util.Random;

public class number_3 {

	// 3. A 클래스에 2개의 랜덤 숫자와 랜덤 사칙 연산을 가진 객체를 5개를 만들어서 어레이 리스트에 저장하기

	public static String randomSign() {
		Random rd = new Random();
		int temp = rd.nextInt(4);

		if (temp == 0) {
			return "+";
		} else if (temp == 1) {
			return "-";
		} else if (temp == 2) {

			return "*";

		} else if (temp == 3) {
			return "/";
		} else {
			return "잘못된 입력";
		}

	}

	public static void main(String[] args) {

		// 랜덤 객체 만들기

		Random rd = new Random();

		ArrayList<number_1> array = new ArrayList<>();
		
		for (int i = 0 ;  i <5;i++) {
			
			array.add(new number_1(rd.nextInt(10)+1, rd.nextInt(10)+1, randomSign()));
			//0~9까지의 숫자 랜덤으로 받아서 2개 입력 후 , 사칙연산 랜덤으로 설정
			
		}
		
		for (int i = 0 ;  i <5;i++) {//생성된 객체들을 담은 ArrayList 모두
			
			System.out.print(array.get(i).num_1+ "   "+array.get(i).num_2+"   "+array.get(i).str);
			//0~9까지의 숫자 랜덤으로 받아서 2개 입력 후 , 사칙연산 랜덤으로 설정
			System.out.println();
		}
		
	
	}

}
