import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Make_Calendar_Use_Array {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();// ���� 8���� 1�Ϸ� ����
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> ShowCal = new ArrayList<Integer>() ;
		
		
		while (true) {

			System.out.print("�޷��� ����մϴ�.  ��ȸ�� �޷��� ���� �Է����ּ���(123�Է½� ����)\n>>>");
			int input_Month = Integer.parseInt(sc.nextLine());

			if (input_Month == 123) { // ���� ����
				System.out.println("����");
				break;

			}
			ArrayList<String> day_List = new ArrayList<String>();
			day_List.add("��");
			day_List.add("��");
			day_List.add("ȭ");
			day_List.add("��");
			day_List.add("��");
			day_List.add("��");
			day_List.add("��");

			cal.set(Calendar.MONTH, input_Month-1);
//			////////////////////////////////////////
//			System.out.print(cal.get(Calendar.YEAR) + "�� ");
//			System.out.print((cal.get(Calendar.MONTH) + 1) + "�� �޷�");
//			////////////////////////////////////////
//			
//			
			
			cal.set(Calendar.DAY_OF_MONTH, 1);
//			int end_of_thisMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

			int firstdayNum = cal.get(Calendar.DAY_OF_WEEK);// 8�� 1�� �����(7��)
			
			
			
			////////////////////////////////////////
			System.out.print(cal.get(Calendar.YEAR) + "�� ");
			System.out.print((cal.get(Calendar.MONTH) + 1) + "�� �޷�");
			////////////////////////////////////////
			
			
			
			int ex_length = firstdayNum - 1;// �������� ���������Ͽ��ϰ� �̹��� ��¥������ ���� �Ÿ�
			
			System.out.println("\n---------------------------------------------");	
			for (int i = 0; i < day_List.size(); i++) { //�������
				System.out.print(day_List.get(i) + "          ");
			}
			
			
			cal.add(Calendar.DAY_OF_MONTH, -ex_length-1);

			for (int i = 1; i <= ex_length; i++) {//�������
				cal.add(Calendar.DAY_OF_MONTH, 1);
				ShowCal.add(cal.get(Calendar.DAY_OF_MONTH));
//				System.out.print(cal.get(Calendar.DAY_OF_MONTH) + "     ");
				
			}
			cal.set(Calendar.MONTH, cal.get(Calendar.MONTH) + 1);//����޷� ���� (+1)
			cal.set(Calendar.DAY_OF_MONTH, 1);//������� 1�Ϸ� ����(+1)
			
			for(int i =1;i<=cal.getActualMaximum(Calendar.DAY_OF_MONTH);i++) {
				
				ShowCal.add(i);
				// ����� ���� ���
			}
//			
			
			System.out.println("\n---------------------------------------------");	
			for(int i =0; i <ShowCal.size();i++) {//�޷����
				
				if(i%7==0) {
					System.out.println();
				}
				
				if((ShowCal.get(i)>=0)&&(ShowCal.get(i)<10)) {
					
					System.out.print(ShowCal.get(i)+"      ");
					
				}
				else {
					System.out.print(ShowCal.get(i)+"     ");
					
					
				}

				
				
			}
			

			System.out.println("\n---------------------------------------------\n\n");
			
			ShowCal.clear();
		}

	}

}
