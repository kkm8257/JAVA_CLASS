import java.util.Random;
import java.util.Scanner;

public class Main_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int quizCount = 1;
		int quizNum = 0; // ���� ��ȣ count

		int input=0;
		int score=0;
		
		String[] QuizArray = new String[3]; // ���� array
		QuizArray[quizNum] = (quizNum+1) + "�� �����Դϴ�. 1+1=?\n";
		quizNum++;
		QuizArray[quizNum] = (quizNum+1) + "�� �����Դϴ�. ���� �츮�� ���� �ִ� ����?\n";
		quizNum++;
		QuizArray[quizNum] = (quizNum+1) + "�� �����Դϴ�. ��ǻ�ʹ� �����?\n";
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
				"------------------------------------------��� �����մϴ�------------------------------------------\n����� ���� Ǫ�� ���� ������ ?\n");

		
		
		for(int A=0; A<2;A++) {
			
			System.out.println((A+1)+"�� �õ�!\n\n");
			
			int RandomNum = rd.nextInt(3); // ���� �����ȣ

			System.out.println(QuizArray[RandomNum]);
			
			System.out.println("���� : "+"("+quizCount+") "+num1[RandomNum]+"    ("+(quizCount+1)+") "+num2[RandomNum]+"    ("+(quizCount+2)+") "+num3[RandomNum]+"    ("+(quizCount+3)+") "+num4[RandomNum]);
			
			input=Integer.parseInt(sc.nextLine());
			
			if(input==AnswerArray[RandomNum]) {
				System.out.println("�����Դϴ�.  50�� ����!\n");
				score=score+50;
				
			}
			else {
				
				System.out.println("�����Դϴ�. ");
			}
			
		}
		
		
		System.out.println("\n----------------------------------------------\n");
		System.out.println("������ ������ "+score+"�� �Դϴ�.");
		System.out.println("\n----------------------------------------------\n");
	}
}
