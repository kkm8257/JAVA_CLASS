import java.util.Scanner;

public class Main_2 {
	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);
		
		System.out.println("1���� 100������ ���� �Է��غ�����. ");
		int Temp = Integer.parseInt(sc.nextLine());
		
		if(Temp<=0) {
			System.out.println("0������ ���� �Է�����������.");
		}
		
		else if(Temp<10) {
			System.out.println("Temp �� 10�̸��̴�.");
		}
		else if(Temp<40&&Temp>=10) {
			
			System.out.println("Temp�� 10�̻� 40�̸��̴�.");
		}
		else if(Temp<80 && Temp>=40) {
			System.out.println("Temp�� 40�̻� 80�̸��̴�.");
		}
		else if(Temp<=100 && Temp >=80){
			
			System.out.println("Temp�� 80�̻� 100�����̴�.");
		}
		else {
			
			System.out.println("���� ��� �Է����� ���� �� �Դϴ�.");
		}
	
	}
}
