import java.util.Random;
import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		// 3庚薦

		int score = 0; // 繊呪

		int count = 1;  //左奄 庚薦腰硲 遂
		int Input;
		int quizNum = 1;  //訂綜 腰硲 count

		String[] QuizArray = new String[3]; // 庚薦 array

		String[] Quiz_1 = new String[4]; // 庚薦紺 左奄亜 眼延 array
		String[] Quiz_2 = new String[4];
		String[] Quiz_3 = new String[4];

		int[] AnswerArray = new int[3]; // 岩戚 眼延 array

		///////////////////////////////////////////////

		Quiz_1[0] = "2";
		Quiz_1[1] = "3";
		Quiz_1[2] = "4";
		Quiz_1[3] = "5";
		QuizArray[0] = quizNum + "腰 庚薦脊艦陥. 1+1=?\n";
		quizNum++;
		AnswerArray[0] = 1;

		Quiz_2[0] = "C";
		Quiz_2[1] = "C++";
		Quiz_2[2] = "JAVA";
		Quiz_2[3] = "Python";
		QuizArray[1] = quizNum + "腰 庚薦脊艦陥. 走榎 酔軒亜 壕酔壱 赤澗 情嬢澗?\n";
		quizNum++;
		AnswerArray[1] = 3;

		Quiz_3[0] = "conputer";
		Quiz_3[1] = "TV";
		Quiz_3[2] = "commputer";
		Quiz_3[3] = "computer";
		QuizArray[2] = quizNum  + "腰 庚薦脊艦陥. 陳濃斗澗 慎嬢稽?\n";
		quizNum++;
		AnswerArray[2] = 4;

		
		
		/////////////////////////////////////////////////
		/////////////////////////////////////////////////
		
		
		System.out.println(
				"------------------------------------------訂綜研 獣拙杯艦陥------------------------------------------\n雁重戚 胡煽 祢叔 訂綜 庚薦澗 ?\n");
		int QuizNum = rd.nextInt(3);

		if (QuizNum == 0) {
			System.out.println(QuizArray[QuizNum]);

			System.out.println("左奄 : " + "(" + count + ")" + Quiz_1[0] + "  " + "(" + (count + 1) + ")" + Quiz_1[1]
					+ "  " + "(" + (count + 2) + ")" + Quiz_1[2] + "  " + "(" + (count + 3) + ")" + Quiz_1[3]);

			Input = Integer.parseInt(sc.nextLine());
			System.out.println("脊径馬重 舛岩 : " + Input);

			if (Input == AnswerArray[0]) {
				System.out.println("舛岩脊艦陥. 50繊 塙究!");
				score = score + 50;
			} else {
				System.out.println("神岩脊艦陥. 繊呪澗 蒸柔艦陥 ばば");
			}

		}

		else if (QuizNum == 1) {
			System.out.println(QuizArray[QuizNum]);

			System.out.println("左奄 : " + "(" + count + ")" + Quiz_2[0] + "  " + "(" + (count + 1) + ")" + Quiz_2[1]
					+ "  " + "(" + (count + 2) + ")" + Quiz_2[2] + "  " + "(" + (count + 3) + ")" + Quiz_2[3]);

			Input = Integer.parseInt(sc.nextLine());
			System.out.println("脊径馬重 舛岩 : " + Input);

			if (Input == AnswerArray[1]) {
				System.out.println("舛岩脊艦陥. 50繊 塙究!");
				score = score + 50;
			} else {
				System.out.println("神岩脊艦陥. 繊呪澗 蒸柔艦陥 ばば");
			}

		}

		else if (QuizNum == 2) {
			System.out.println(QuizArray[QuizNum]);

			System.out.println("左奄 : " + "(" + count + ")" + Quiz_3[0] + "  " + "(" + (count + 1) + ")" + Quiz_3[1]
					+ "  " + "(" + (count + 2) + ")" + Quiz_3[2] + "  " + "(" + (count + 3) + ")" + Quiz_3[3]);

			Input = Integer.parseInt(sc.nextLine());
			System.out.println("脊径馬重 舛岩 : " + Input);

			if (Input == AnswerArray[2]) {
				System.out.println("舛岩脊艦陥. 50繊 塙究!");
				score = score + 50;
			} else {
				System.out.println("神岩脊艦陥. 繊呪澗 蒸柔艦陥 ばば");
			}

		}

		//////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////
		System.out.println("\n廃腰 希 庚薦研 熱畏柔艦陥. 砧腰属稽 祢叔 庚薦澗?\n");
		QuizNum = rd.nextInt(3);

		if (QuizNum == 0) {
			System.out.println(QuizArray[QuizNum]);

			System.out.println("左奄 : " + "(" + count + ")" + Quiz_1[0] + "  " + "(" + (count + 1) + ")" + Quiz_1[1]
					+ "  " + "(" + (count + 2) + ")" + Quiz_1[2] + "  " + "(" + (count + 3) + ")" + Quiz_1[3]);

			Input = Integer.parseInt(sc.nextLine());
			System.out.println("脊径馬重 舛岩 : " + Input);

			if (Input == AnswerArray[0]) {
				System.out.println("舛岩脊艦陥. 50繊 塙究!");
				score = score + 50;
			} else {
				System.out.println("神岩脊艦陥. 繊呪澗 蒸柔艦陥 ばば");
			}

		}

		else if (QuizNum == 1) {
			System.out.println(QuizArray[QuizNum]);

			System.out.println("左奄 : " + "(" + count + ")" + Quiz_2[0] + "  " + "(" + (count + 1) + ")" + Quiz_2[1]
					+ "  " + "(" + (count + 2) + ")" + Quiz_2[2] + "  " + "(" + (count + 3) + ")" + Quiz_2[3]);

			Input = Integer.parseInt(sc.nextLine());
			System.out.println("脊径馬重 舛岩 : " + Input);

			if (Input == AnswerArray[1]) {
				System.out.println("舛岩脊艦陥. 50繊 塙究!");
				score = score + 50;
			} else {
				System.out.println("神岩脊艦陥. 繊呪澗 蒸柔艦陥 ばば");
			}

		}

		else if (QuizNum == 2) {
			System.out.println(QuizArray[QuizNum]);

			System.out.println("左奄 : " + "(" + count + ")" + Quiz_3[0] + "  " + "(" + (count + 1) + ")" + Quiz_3[1]
					+ "  " + "(" + (count + 2) + ")" + Quiz_3[2] + "  " + "(" + (count + 3) + ")" + Quiz_3[3]);

			Input = Integer.parseInt(sc.nextLine());
			System.out.println("脊径馬重 舛岩 : " + Input);

			if (Input == AnswerArray[2]) {
				System.out.println("舛岩脊艦陥. 50繊 塙究!");
				score = score + 50;
			} else {
				System.out.println("神岩脊艦陥. 繊呪澗 蒸柔艦陥 ばば");
			}

		}

		System.out.println("\n\n------------------------------------------置曽 塙究 繊呪澗 <" + score
				+ ">繊 脊艦陥!------------------------------------------");

	}

}
