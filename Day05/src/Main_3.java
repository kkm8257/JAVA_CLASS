import java.util.Calendar;

public class Main_3 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;// �ڹٴ� 0�� 1���̴�.
		int day = cal.get(Calendar.DATE);

		int dow = cal.get(Calendar.DAY_OF_WEEK); // 1 �� �Ͽ���
		int max = cal.getActualMaximum(Calendar.DATE);

		System.out.println("year : " + year + "   month : " + (month) + "   day : " + day);
		System.out.println(dow);
		System.out.println(max);

		/////
		System.out.println("------------------------------------");
		cal.set(2020, 5, 4);

		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;// �ڹٴ� 0�� 1���̴�.
		day = cal.get(Calendar.DATE);

		System.out.println("year : " + year + "   month : " + (month) + "   day : " + day);
		System.out.println(dow);
		System.out.println(max);

/////////////
		///cal2 ����
		Calendar cal2 = Calendar.getInstance();//���ó�¥
		 cal2.add(Calendar.MONTH, -1);
		 year = cal2.get(Calendar.YEAR);
		 month = cal2.get(Calendar.MONTH) + 1;// �ڹٴ� 0�� 1���̴�.
		 day = cal2.get(Calendar.DATE);
		
		
			System.out.println("year : " + year + "   month : " + (month) + "   day : " + day);
		 
		 
			// add(int field, int amount)�� ����ϸ� ������ �ʵ��� ���� ���ϴ� ��ŭ ���� �Ǵ� ���� ��ų �� �ֱ� ������
			// add�޼��带 �̿��ϸ� Ư�� ��¥ �Ǵ� �ð��� �������� �ؼ� ���� �Ⱓ ������ ��¥�� �ð��� �˾Ƴ� �� �ִ�.

		
	}
}
