import java.util.Scanner;

public class Quiz_sam {

	Scanner sc = new Scanner(System.in);

	String problem;
	String num1;
	String num2;
	String num3;
	String num4;
	String ans;
	String input;
//	boolean checkFlag = false;

	public Quiz_sam(String problem, String num1, String num2, String num3, String num4, String ans) {

		this.problem = problem;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		this.ans = ans;
	}

	public boolean ShowQuiz() {

		System.out.println(this.problem);
		System.out.println("(1)  " + this.num1 + "  (2)  " + this.num2 + "  (3)  " + this.num3 + "  (4)  " + this.num4);
		System.out.print("단어 입력 >>>");
		input = sc.nextLine();
		if (input.equals(ans)) {
			// 답체크
			System.out.println("정답입니다!");
			return true;

		} else {
			System.out.println("오답입니다!");
			return false;
		}

	}

}
