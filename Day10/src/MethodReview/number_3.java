package MethodReview;

public class number_3 { // Ŭ���� -> ��ü

	public static void gugu(int[] A) {// �޼ҵ�

		System.out.println("������ ��� ������ ������ ���");
		for (int i = 0; i < A.length; i++) {
			System.out.println((i + 1) + "�� ��");
			for (int j = 1; j < 10; j++) {
				System.out.println(A[i] + " x " + j + " = " + (A[i] * j));

			}

		}

	}

	public static void main(String[] args) {// ���θ޼ҵ�

		int[] array = new int[5];

		array[0] = 5;
		array[1] = 4;
		array[2] = 7;
		array[3] = 9;
		array[4] = 4;

	
		gugu(array);

	}

}
