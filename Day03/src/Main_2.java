import java.util.Random;
import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		// 3����

		int score = 0; // ����

		int count = 1;  //���� ������ȣ ��
		int Input;
		int quizNum = 1;  //���� ��ȣ count

		String[] QuizArray = new String[3]; // ���� array

		String[] Quiz_1 = new String[4]; // ������ ���Ⱑ ��� array
		String[] Quiz_2 = new String[4];
		String[] Quiz_3 = new String[4];

		int[] AnswerArray = new int[3]; // ���� ��� array

		///////////////////////////////////////////////

		Quiz_1[0] = "2";
		Quiz_1[1] = "3";
		Quiz_1[2] = "4";
		Quiz_1[3] = "5";
		QuizArray[0] = quizNum + "�� �����Դϴ�. 1+1=?\n";
		quizNum++;
		AnswerArray[0] = 1;

		Quiz_2[0] = "C";
		Quiz_2[1] = "C++";
		Quiz_2[2] = "JAVA";
		Quiz_2[3] = "Python";
		QuizArray[1] = quizNum + "�� �����Դϴ�. ���� �츮�� ���� �ִ� ����?\n";
		quizNum++;
		AnswerArray[1] = 3;

		Quiz_3[0] = "conputer";
		Quiz_3[1] = "TV";
		Quiz_3[2] = "commputer";
		Quiz_3[3] = "computer";
		QuizArray[2] = quizNum  + "�� �����Դϴ�. ��ǻ�ʹ� �����?\n";
		quizNum++;
		AnswerArray[2] = 4;

		
		
		/////////////////////////////////////////////////
		/////////////////////////////////////////////////
		
		
		System.out.println(
				"------------------------------------------��� �����մϴ�------------------------------------------\n����� ���� Ǫ�� ���� ������ ?\n");
		int QuizNum = rd.nextInt(3);

		if (QuizNum == 0) {
			System.out.println(QuizArray[QuizNum]);

			System.out.println("���� : " + "(" + count + ")" + Quiz_1[0] + "  " + "(" + (count + 1) + ")" + Quiz_1[1]
					+ "  " + "(" + (count + 2) + ")" + Quiz_1[2] + "  " + "(" + (count + 3) + ")" + Quiz_1[3]);

			Input = Integer.parseInt(sc.nextLine());
			System.out.println("�Է��Ͻ� ���� : " + Input);

			if (Input == AnswerArray[0]) {
				System.out.println("�����Դϴ�. 50�� ȹ��!");
				score = score + 50;
			} else {
				System.out.println("�����Դϴ�. ������ �����ϴ� �Ф�");
			}

		}

		else if (QuizNum == 1) {
			System.out.println(QuizArray[QuizNum]);

			System.out.println("���� : " + "(" + count + ")" + Quiz_2[0] + "  " + "(" + (count + 1) + ")" + Quiz_2[1]
					+ "  " + "(" + (count + 2) + ")" + Quiz_2[2] + "  " + "(" + (count + 3) + ")" + Quiz_2[3]);

			Input = Integer.parseInt(sc.nextLine());
			System.out.println("�Է��Ͻ� ���� : " + Input);

			if (Input == AnswerArray[1]) {
				System.out.println("�����Դϴ�. 50�� ȹ��!");
				score = score + 50;
			} else {
				System.out.println("�����Դϴ�. ������ �����ϴ� �Ф�");
			}

		}

		else if (QuizNum == 2) {
			System.out.println(QuizArray[QuizNum]);

			System.out.println("���� : " + "(" + count + ")" + Quiz_3[0] + "  " + "(" + (count + 1) + ")" + Quiz_3[1]
					+ "  " + "(" + (count + 2) + ")" + Quiz_3[2] + "  " + "(" + (count + 3) + ")" + Quiz_3[3]);

			Input = Integer.parseInt(sc.nextLine());
			System.out.println("�Է��Ͻ� ���� : " + Input);

			if (Input == AnswerArray[2]) {
				System.out.println("�����Դϴ�. 50�� ȹ��!");
				score = score + 50;
			} else {
				System.out.println("�����Դϴ�. ������ �����ϴ� �Ф�");
			}

		}

		//////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////
		System.out.println("\n�ѹ� �� ������ Ǯ�ڽ��ϴ�. �ι�°�� Ǫ�� ������?\n");
		QuizNum = rd.nextInt(3);

		if (QuizNum == 0) {
			System.out.println(QuizArray[QuizNum]);

			System.out.println("���� : " + "(" + count + ")" + Quiz_1[0] + "  " + "(" + (count + 1) + ")" + Quiz_1[1]
					+ "  " + "(" + (count + 2) + ")" + Quiz_1[2] + "  " + "(" + (count + 3) + ")" + Quiz_1[3]);

			Input = Integer.parseInt(sc.nextLine());
			System.out.println("�Է��Ͻ� ���� : " + Input);

			if (Input == AnswerArray[0]) {
				System.out.println("�����Դϴ�. 50�� ȹ��!");
				score = score + 50;
			} else {
				System.out.println("�����Դϴ�. ������ �����ϴ� �Ф�");
			}

		}

		else if (QuizNum == 1) {
			System.out.println(QuizArray[QuizNum]);

			System.out.println("���� : " + "(" + count + ")" + Quiz_2[0] + "  " + "(" + (count + 1) + ")" + Quiz_2[1]
					+ "  " + "(" + (count + 2) + ")" + Quiz_2[2] + "  " + "(" + (count + 3) + ")" + Quiz_2[3]);

			Input = Integer.parseInt(sc.nextLine());
			System.out.println("�Է��Ͻ� ���� : " + Input);

			if (Input == AnswerArray[1]) {
				System.out.println("�����Դϴ�. 50�� ȹ��!");
				score = score + 50;
			} else {
				System.out.println("�����Դϴ�. ������ �����ϴ� �Ф�");
			}

		}

		else if (QuizNum == 2) {
			System.out.println(QuizArray[QuizNum]);

			System.out.println("���� : " + "(" + count + ")" + Quiz_3[0] + "  " + "(" + (count + 1) + ")" + Quiz_3[1]
					+ "  " + "(" + (count + 2) + ")" + Quiz_3[2] + "  " + "(" + (count + 3) + ")" + Quiz_3[3]);

			Input = Integer.parseInt(sc.nextLine());
			System.out.println("�Է��Ͻ� ���� : " + Input);

			if (Input == AnswerArray[2]) {
				System.out.println("�����Դϴ�. 50�� ȹ��!");
				score = score + 50;
			} else {
				System.out.println("�����Դϴ�. ������ �����ϴ� �Ф�");
			}

		}

		System.out.println("\n\n------------------------------------------���� ȹ�� ������ <" + score
				+ ">�� �Դϴ�!------------------------------------------");

	}

}
