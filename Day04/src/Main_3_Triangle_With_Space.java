import java.util.Scanner;

public class Main_3_Triangle_With_Space {
public static void main(String[] args) {

	//�����ִ�
	
	
	Scanner sc= new Scanner(System.in);
	
	
	System.out.print("�ﰢ���� ���̸� �Է��ϼ��� >>>");
	
	int H=Integer.parseInt(sc.nextLine());
	int N=2*H-1;
	int count=1;
	
	int temp=H;

	
	for(int i=0;i<H;i++) {

		for(int j= 0; j<N;j++) {
			
			if((j==(temp-1))) {

				for(int k = 0;k<count;k++) {
					
					System.out.print("* ");
				}
			}
			else {
				System.out.print(" ");
			}
		
		}
		System.out.println();		
		temp--;
		count++;
		
	}
	
	
		
}
}
