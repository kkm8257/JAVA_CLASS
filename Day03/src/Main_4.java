import java.util.Random;
import java.util.Scanner;

public class Main_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int quizCount = 1;
		int quizNum = 0; // 퀴즈 번호 count

		int input=0;
		int score=0;
		
		String[] QuizArray = new String[3]; // 문제 array
		QuizArray[quizNum] = (quizNum+1) + "번 문제입니다. 1+1=?\n";
		quizNum++;
		QuizArray[quizNum] = (quizNum+1) + "번 문제입니다. 지금 우리가 배우고 있는 언어는?\n";
		quizNum++;
		QuizArray[quizNum] = (quizNum+1) + "번 문제입니다. 컴퓨터는 영어로?\n";
		quizNum++;

		String[] num1 = new String[3];
		num1[0] = "2";
		num1[1] = "C";
		num1[2] = "conputer";

		String[] num2 = new String[3];
		num2[0] = "3";
		num2[1] = "C++";
		num2[2] = "TV";

		String[] num3 = new String[3];
		num3[0] = "4";
		num3[1] = "JAVA";
		num3[2] = "commmputer";

		String[] num4 = new String[3];
		num4[0] = "5";
		num4[1] = "Python";
		num4[2] = "computer";

		
		int AnswerArray[]=new int[3];
		AnswerArray[0]=1;
		AnswerArray[1]=3;
		AnswerArray[2]=4;


		
		System.out.println(
				"------------------------------------------퀴즈를 시작합니다------------------------------------------\n당신이 먼저 푸실 퀴즈 문제는 ?\n");

		
		
		for(int A=0; A<2;A++) {
			
			System.out.println((A+1)+"차 시도!\n\n");
			
			int RandomNum = rd.nextInt(3); // 랜덤 퀴즈번호

			System.out.println(QuizArray[RandomNum]);
			
			System.out.println("보기 : "+"("+quizCount+") "+num1[RandomNum]+"    ("+(quizCount+1)+") "+num2[RandomNum]+"    ("+(quizCount+2)+") "+num3[RandomNum]+"    ("+(quizCount+3)+") "+num4[RandomNum]);
			
			input=Integer.parseInt(sc.nextLine());
			
			if(input==AnswerArray[RandomNum]) {
				System.out.println("정답입니다.  50점 득점!\n");
				score=score+50;
				
			}
			else {
				
				System.out.println("오답입니다. ");
			}
			
		}
		
		
		System.out.println("\n----------------------------------------------\n");
		System.out.println("본인의 점수는 "+score+"점 입니다.");
		System.out.println("\n----------------------------------------------\n");
	}
}
