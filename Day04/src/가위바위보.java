import java.util.Random;
import java.util.Scanner;

public class ���������� {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Random rd= new Random();
		
		int check;
		
		int my;
		int com;
		
		String[] str=new String[3];
		str[0]="����";
		str[1]="����";
		str[2]="��";
		
		
		
		
		System.out.println("------------���� ���� �� ����------------");
		
		
		
		while(true) {
			
			System.out.println("1) "+str[0]+ "  2) "+str[1]+"  3) "+str[2]+"  4) ���� ������");
			System.out.print("�ش� ���⸦ �Է��ϼ���.>>>");
			check=Integer.parseInt(sc.nextLine());
			
			
			my=check-1;
			com=rd.nextInt(3);
			
			
			if(check==4) {
				
				System.out.println("����");
				break;
				
			}
			
			else if(  ((my==0)&&(com==0))||((my==1)&&(com==1))||((my==2)&&(com==2))) {
				//�����
				System.out.println("�����ϴ�~ �ٽ�! ");
				continue;
				
			}
			
			//������ ������ �ο�
			else if(my==0&&com==1)   {
				System.out.println("���� : ����");
				System.out.println("�� : ����");
				System.out.println("���� �¸�");
				
			}
			else if(my==1&&com==0)   {
				System.out.println("���� : ����");
				System.out.println("�� : ����");
				System.out.println("������ �¸�");
				
			}
			
			else if(my==0&&com==2)   {
				System.out.println("���� : ����");
				System.out.println("�� : ��");
				System.out.println("������ �¸�");
				
			}
			
			else if(my==2&&com==0)   {
				System.out.println("���� : ��");
				System.out.println("�� : ����");
				System.out.println("���� �¸�");
				
			}
			
			
			else if(my==1&&com==2)   {
				System.out.println("���� : ����");
				System.out.println("�� : ��");
				System.out.println("���� �¸�");
				
			}
			else if(my==2&&com==1)   {
				System.out.println("���� : ��");
				System.out.println("�� : ����");
				System.out.println("������ �¸�");
				
			}
			
		
		}
		
		
		System.out.println("------------------------------------");
		

		
	}
	
}
