package ClassReview_2_Inheritance;

import java.util.Random;

public class number_3 extends number_2 {

	// 3. A 클래스에 2개의 랜덤 숫자와 랜덤 사칙 연산을 가진 객체를 5개를 만들어서 어레이 리스트에 저장하기

	number_3 nm3_result;
	
	public String randomSign() {
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

	public number_3 insert(number_3 nm3) {

		Random rd = new Random();
		
		for (int i = 0; i < 5; i++) {

			nm3.array.add(new number_2());
			nm3.array.get(i).num_1 = rd.nextInt(10) + 1;
			nm3.array.get(i).num_2 = rd.nextInt(10) + 1;
			nm3.array.get(i).str = nm3.randomSign();
			// 0~9까지의 숫자 랜덤으로 받아서 2개 입력 후 , 사칙연산 랜덤으로 설정

		}
		this.nm3_result=nm3;
		
		return nm3;

	}
	
	public void processPrint() {
		
		
		for (int i = 0; i < 5; i++) {// 출력

			System.out.print(nm3_result.array.get(i).num_1 + "   " + nm3_result.array.get(i).num_2 + "   " + nm3_result.array.get(i).str);
			// 0~9까지의 숫자 랜덤으로 받아서 2개 입력 후 , 사칙연산 랜덤으로 설정
			System.out.println();
		}
		
		
		
	}

	public static void main(String[] args) {
		// 랜덤 객체 만들기

		number_3 nm3 = new number_3();
		
		nm3.insert(nm3);
		nm3.processPrint();
		

	}

}
