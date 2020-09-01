package MethodReview;

public class number_3 { // 클래스 -> 객체

	public static void gugu(int[] A) {// 메소드

		System.out.println("각방의 모든 숫자의 구구단 출력");
		for (int i = 0; i < A.length; i++) {
			System.out.println((i + 1) + "번 방");
			for (int j = 1; j < 10; j++) {
				System.out.println(A[i] + " x " + j + " = " + (A[i] * j));

			}

		}

	}

	public static void main(String[] args) {// 메인메소드

		int[] array = new int[5];

		array[0] = 5;
		array[1] = 4;
		array[2] = 7;
		array[3] = 9;
		array[4] = 4;

	
		gugu(array);

	}

}
