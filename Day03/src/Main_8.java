import java.util.Scanner;

public class Main_8 {

	//Day02 ���� for�� ����
	
	
	public static void main(String[] args) {
	
		
		float Kor = 100;
		float Eng = 100;
		float Math = 100;
		float Sci = 100;

		float total = 400;

		int count=0;
		boolean flag=true;
		
		Scanner sc = new Scanner(System.in);

		String str;
		
		
		
		for(int i =0; i < 3;i++) {
			
			System.out.println("������ ���� �� ������ �Է��ϼ���. ���Ḧ ���� ��� exit�� �Է��ϼ���.");
			str = sc.nextLine();
			
			if(str.equals("exit")) {
				
				flag=false;
				System.out.println("���� : " + (int) total);
				System.out
						.println("���� : " + (int) Kor + " ���� : " + (int) Eng + " ���� : " + (int) Math + " ���� : " + (int) Sci);
				System.out.println("��� : " +  (total / 4));
				System.out.println("�����մϴ�.");
				
			}
			
			else if (str.equals("����") ) {

				System.out.println("���� �� ������ �Է��ϼ���.");
				Kor = Integer.parseInt(sc.nextLine());
				count = count + 1;
				System.out.println("---------------------------------------");
				System.out.println(count + "ȸ �����Ͽ����ϴ�.");
				total = Kor + Eng + Math + Sci;
				System.out.println("���� : " + (int) total);
				System.out
						.println("���� : " + (int) Kor + " ���� : " + (int) Eng + " ���� : " + (int) Math + " ���� : " + (int) Sci);
				System.out.println("��� : " + (total / 4));
				System.out.println("---------------------------------------");

			}

			else if (str.equals("����")) {

				System.out.println("���� �� ������ �Է��ϼ���.");
				Eng = Integer.parseInt(sc.nextLine());
				count = count + 1;
				System.out.println("---------------------------------------");
				System.out.println(count + "ȸ �����Ͽ����ϴ�.");
				total = Kor + Eng + Math + Sci;
				System.out.println("���� : " + (int) total);
				System.out
						.println("���� : " + (int) Kor + " ���� : " + (int) Eng + " ���� : " + (int) Math + " ���� : " + (int) Sci);
				System.out.println("��� : " + (total / 4));
				System.out.println("---------------------------------------");

			}

			else if (str.equals("����")) {

				System.out.println("���� �� ������ �Է��ϼ���.");
				Math = Integer.parseInt(sc.nextLine());
				count = count + 1;
				System.out.println("---------------------------------------");
				System.out.println(count + "ȸ �����Ͽ����ϴ�.");
				total = Kor + Eng + Math + Sci;
				System.out.println("���� : " + (int) total);
				System.out
						.println("���� : " + (int) Kor + " ���� : " + (int) Eng + " ���� : " + (int) Math + " ���� : " + (int) Sci);
				System.out.println("��� : " + (total / 4));
				System.out.println("---------------------------------------");

			} else if (str.equals("����")) {

				System.out.println("���� �� ������ �Է��ϼ���.");
				Sci = Integer.parseInt(sc.nextLine());
				count = count + 1;
				System.out.println("---------------------------------------");
				System.out.println(count + "ȸ �����Ͽ����ϴ�.");
				total = Kor + Eng + Math + Sci;
				System.out.println("���� : " + (int) total);
				System.out
						.println("���� : " + (int) Kor + " ���� : " + (int) Eng + " ���� : " + (int) Math + " ���� : " + (int) Sci);
				System.out.println("��� : " + (total / 4));
				System.out.println("---------------------------------------");

			}
			
			
			if(flag==false) {
				i=4;
				
			}
			
			
			
		}
		
		
	}
	
}
