import java.util.Scanner;

public class HW_1 {
	public static void main(String[] args) {
		// �����ϳ��� �Է¹޾Ƽ� for�� �̿�, �Է¹��� ������ �������� ȭ�鿡 ���

		Scanner sc= new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i =1;i<10;i++) {
			
			System.out.println(num+" X "+ i +" = "+i*num);
			
		}
		
		
	}
}
