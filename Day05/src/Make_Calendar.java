import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Make_Calendar {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		
		cal.set(Calendar.MONTH,7);//8��    //set ��ſ� add�� ���ؼ� ���� ������ �ڵ� ���� �Ұ�
		cal.set(Calendar.DAY_OF_MONTH, 1); // �ش� ���� 1�Ϸ� ����
		int firstdayNum=cal.get(Calendar.DAY_OF_WEEK);
		
		
		int date_Length=firstdayNum-1;// �Ÿ� 
		int end_of_ExMonth;
		System.out.println("8���� ù ���� ��ȣ  (�����) : "+firstdayNum);
		System.out.println("8�� ù���� 7�������� ���� �Ÿ� : "+date_Length); //�Ÿ� ����
		
		cal.set(Calendar.MONDAY,6);//7��
		end_of_ExMonth=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("�������� ������ �� : "+cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		System.out.println("--------------------");
		
//		System.out.println("\n\n"+weekCount);
		
		
		//7������ 31�ϱ���
		for(int i =date_Length; i>0;i--) {
			

			System.out.print((end_of_ExMonth+1-i)+"  ");
		}
		
		//�̹��޷� �̵�
		cal.set(Calendar.MONTH,7);
		int thisDay=cal.getActualMaximum(Calendar.DAY_OF_MONTH);//�̹��� ������
		
		int weekCount=cal.get(Calendar.WEEK_OF_MONTH);//���� ��¥���� ������� �� ���ϱ�
		int change=2;//�ٹٲ� üũ
		for(int i =1; i <=thisDay;i++) {
			cal.set(Calendar.DAY_OF_MONTH, i);
			weekCount=cal.get(Calendar.WEEK_OF_MONTH);
			
//			System.out.println("week : "+weekCount  + "change : "+ change);
			if(weekCount==change) {
				change++;
				System.out.println();
				i--;
			}
			else {
				System.out.print(i+"  ");
			}
			
			
		}
		
		
		
		///������ ���
		
		
		
		
		
		
		
	}
}
