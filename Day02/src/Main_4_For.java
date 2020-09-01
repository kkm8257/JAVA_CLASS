import java.util.Scanner;

public class Main_4_For {

	public static void main(String[] args) {
		
		float Kor = 100;
		float Eng = 100;
		float Math = 100;
		float Sci = 100;

		int count=0;
		
		float total = 400;

		
		
		Scanner sc = new Scanner(System.in);

		String str;
		
		
		
		for (int i=0; i<3;i++) {
			
			System.out.println("점수를 변경 할 과목을 입력하세요. 종료를 원할 경우 exit를 입력하세요.");
			str = sc.nextLine();
			
			
			if(str.equals("exit")) {
				
				System.out.println("총점 : " + (int) total);
				System.out
						.println("국어 : " + (int) Kor + " 영어 : " + (int) Eng + " 수학 : " + (int) Math + " 과학 : " + (int) Sci);
				System.out.println("평균 : " + (total / 4));
				System.out.println("종료합니다.");
				break;
				
			}
			else if (str.equals("국어")) {

				System.out.println("변경 할 점수를 입력하세요.");
				Kor = Integer.parseInt(sc.nextLine());
				count = count + 1;
				System.out.println("---------------------------------------");
				System.out.println(count + "회 변경하였습니다.");
				total = Kor + Eng + Math + Sci;
				System.out.println("총점 : " + (int) total);
				System.out
						.println("국어 : " + (int) Kor + " 영어 : " + (int) Eng + " 수학 : " + (int) Math + " 과학 : " + (int) Sci);
				System.out.println("평균 : " + (total / 4));
				System.out.println("---------------------------------------");

			}
			else if (str.equals("영어")) {

				System.out.println("변경 할 점수를 입력하세요.");
				Eng = Integer.parseInt(sc.nextLine());
				count = count + 1;
				System.out.println("---------------------------------------");
				System.out.println(count + "회 변경하였습니다.");
				total = Kor + Eng + Math + Sci;
				System.out.println("총점 : " + (int) total);
				System.out
						.println("국어 : " + (int) Kor + " 영어 : " + (int) Eng + " 수학 : " + (int) Math + " 과학 : " + (int) Sci);
				System.out.println("평균 : " + (total / 4));
				System.out.println("---------------------------------------");

			}

			else if (str.equals("수학")) {

				System.out.println("변경 할 점수를 입력하세요.");
				Math = Integer.parseInt(sc.nextLine());
				count = count + 1;
				System.out.println("---------------------------------------");
				System.out.println(count + "회 변경하였습니다.");
				total = Kor + Eng + Math + Sci;
				System.out.println("총점 : " + (int) total);
				System.out
						.println("국어 : " + (int) Kor + " 영어 : " + (int) Eng + " 수학 : " + (int) Math + " 과학 : " + (int) Sci);
				System.out.println("평균 : " + (total / 4));
				System.out.println("---------------------------------------");

			} else if (str.equals("과학")) {

				System.out.println("변경 할 점수를 입력하세요.");
				Sci = Integer.parseInt(sc.nextLine());
				count = count + 1;
				System.out.println("---------------------------------------");
				System.out.println(count + "회 변경하였습니다.");
				total = Kor + Eng + Math + Sci;
				System.out.println("총점 : " + (int) total);
				System.out
						.println("국어 : " + (int) Kor + " 영어 : " + (int) Eng + " 수학 : " + (int) Math + " 과학 : " + (int) Sci);
				System.out.println("평균 : " + (total / 4));
				System.out.println("---------------------------------------");

			}
			
			
			
		}
		
		
		
		
		
	}
	
}
