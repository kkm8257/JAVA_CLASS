import java.util.Scanner;

public class Main_4_Triangle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("�ﰢ���� ���̸� �Է��ϼ��� >>>");
	
	
	int H =Integer.parseInt(sc.nextLine());
	
	for(int i=0;i<H;i++){
		
		for(int j=0;j<(H-1)-i;j++){
			System.out.print(" "); 
			
			//���� ����
		}
		
		
		for(int j=0;j<2*i+1;j++){
			System.out.print("*"); 
			//Ȧ�������� ���
		}
		
		System.out.println("");
	}
}
}
