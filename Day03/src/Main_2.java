import java.util.Random;
import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		// 3문제

		int score = 0; // 점수

		int count = 1;  //보기 문제번호 용
		int Input;
		int quizNum = 1;  //퀴즈 번호 count

		String[] QuizArray = new String[3]; // 문제 array

		String[] Quiz_1 = new String[4]; // 문제별 보기가 담긴 array
		String[] Quiz_2 = new String[4];
		String[] Quiz_3 = new String[4];

		int[] AnswerArray = new int[3]; // 답이 담긴 array

		///////////////////////////////////////////////

		Quiz_1[0] = "2";
		Quiz_1[1] = "3";
		Quiz_1[2] = "4";
		Quiz_1[3] = "5";
		QuizArray[0] = quizNum + "번 문제입니다. 1+1=?\n";
		quizNum++;
		AnswerArray[0] = 1;

		Quiz_2[0] = "C";
		Quiz_2[1] = "C++";
		Quiz_2[2] = "JAVA";
		Quiz_2[3] = "Python";
		QuizArray[1] = quizNum + "번 문제입니다. 지금 우리가 배우고 있는 언어는?\n";
		quizNum++;
		AnswerArray[1] = 3;

		Quiz_3[0] = "conputer";
		Quiz_3[1] = "TV";
		Quiz_3[2] = "commputer";
		Quiz_3[3] = "computer";
		QuizArray[2] = quizNum  + "번 문제입니다. 컴퓨터는 영어로?\n";
		quizNum++;
		AnswerArray[2] = 4;

		
		
		/////////////////////////////////////////////////
		/////////////////////////////////////////////////
		
		
		System.out.println(
				"------------------------------------------퀴즈를 시작합니다------------------------------------------\n당신이 먼저 푸실 퀴즈 문제는 ?\n");
		int QuizNum = rd.nextInt(3);

		if (QuizNum == 0) {
			System.out.println(QuizArray[QuizNum]);

			System.out.println("보기 : " + "(" + count + ")" + Quiz_1[0] + "  " + "(" + (count + 1) + ")" + Quiz_1[1]
					+ "  " + "(" + (count + 2) + ")" + Quiz_1[2] + "  " + "(" + (count + 3) + ")" + Quiz_1[3]);

			Input = Integer.parseInt(sc.nextLine());
			System.out.println("입력하신 정답 : " + Input);

			if (Input == AnswerArray[0]) {
				System.out.println("정답입니다. 50점 획득!");
				score = score + 50;
			} else {
				System.out.println("오답입니다. 점수는 없습니다 ㅠㅠ");
			}

		}

		else if (QuizNum == 1) {
			System.out.println(QuizArray[QuizNum]);

			System.out.println("보기 : " + "(" + count + ")" + Quiz_2[0] + "  " + "(" + (count + 1) + ")" + Quiz_2[1]
					+ "  " + "(" + (count + 2) + ")" + Quiz_2[2] + "  " + "(" + (count + 3) + ")" + Quiz_2[3]);

			Input = Integer.parseInt(sc.nextLine());
			System.out.println("입력하신 정답 : " + Input);

			if (Input == AnswerArray[1]) {
				System.out.println("정답입니다. 50점 획득!");
				score = score + 50;
			} else {
				System.out.println("오답입니다. 점수는 없습니다 ㅠㅠ");
			}

		}

		else if (QuizNum == 2) {
			System.out.println(QuizArray[QuizNum]);

			System.out.println("보기 : " + "(" + count + ")" + Quiz_3[0] + "  " + "(" + (count + 1) + ")" + Quiz_3[1]
					+ "  " + "(" + (count + 2) + ")" + Quiz_3[2] + "  " + "(" + (count + 3) + ")" + Quiz_3[3]);

			Input = Integer.parseInt(sc.nextLine());
			System.out.println("입력하신 정답 : " + Input);

			if (Input == AnswerArray[2]) {
				System.out.println("정답입니다. 50점 획득!");
				score = score + 50;
			} else {
				System.out.println("오답입니다. 점수는 없습니다 ㅠㅠ");
			}

		}

		//////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////
		System.out.println("\n한번 더 문제를 풀겠습니다. 두번째로 푸실 문제는?\n");
		QuizNum = rd.nextInt(3);

		if (QuizNum == 0) {
			System.out.println(QuizArray[QuizNum]);

			System.out.println("보기 : " + "(" + count + ")" + Quiz_1[0] + "  " + "(" + (count + 1) + ")" + Quiz_1[1]
					+ "  " + "(" + (count + 2) + ")" + Quiz_1[2] + "  " + "(" + (count + 3) + ")" + Quiz_1[3]);

			Input = Integer.parseInt(sc.nextLine());
			System.out.println("입력하신 정답 : " + Input);

			if (Input == AnswerArray[0]) {
				System.out.println("정답입니다. 50점 획득!");
				score = score + 50;
			} else {
				System.out.println("오답입니다. 점수는 없습니다 ㅠㅠ");
			}

		}

		else if (QuizNum == 1) {
			System.out.println(QuizArray[QuizNum]);

			System.out.println("보기 : " + "(" + count + ")" + Quiz_2[0] + "  " + "(" + (count + 1) + ")" + Quiz_2[1]
					+ "  " + "(" + (count + 2) + ")" + Quiz_2[2] + "  " + "(" + (count + 3) + ")" + Quiz_2[3]);

			Input = Integer.parseInt(sc.nextLine());
			System.out.println("입력하신 정답 : " + Input);

			if (Input == AnswerArray[1]) {
				System.out.println("정답입니다. 50점 획득!");
				score = score + 50;
			} else {
				System.out.println("오답입니다. 점수는 없습니다 ㅠㅠ");
			}

		}

		else if (QuizNum == 2) {
			System.out.println(QuizArray[QuizNum]);

			System.out.println("보기 : " + "(" + count + ")" + Quiz_3[0] + "  " + "(" + (count + 1) + ")" + Quiz_3[1]
					+ "  " + "(" + (count + 2) + ")" + Quiz_3[2] + "  " + "(" + (count + 3) + ")" + Quiz_3[3]);

			Input = Integer.parseInt(sc.nextLine());
			System.out.println("입력하신 정답 : " + Input);

			if (Input == AnswerArray[2]) {
				System.out.println("정답입니다. 50점 획득!");
				score = score + 50;
			} else {
				System.out.println("오답입니다. 점수는 없습니다 ㅠㅠ");
			}

		}

		System.out.println("\n\n------------------------------------------최종 획득 점수는 <" + score
				+ ">점 입니다!------------------------------------------");

	}

}
