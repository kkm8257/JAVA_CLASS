import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Calendar_2 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();// ���� 8���� 1�Ϸ� ����
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է����ּ���(���Ḧ ���� �� exit �Է�) \n>>>");
		String input = sc.nextLine();

		if (input.equals("exit")) {
			System.out.println("����");
		}

		String MovePoint; // 1�� ������ 2�� �������� �̵��ϴ� ����� ���� ����

		
		cal.set(Calendar.MONTH, Integer.parseInt(input) - 1); // MONTH�� 0���ͽ��� , 0�� 1��

		while ((true) && !(input.equals("exit"))) {

			ArrayList<Integer> ShowCal = new ArrayList<Integer>();
			ArrayList<String> day_List = new ArrayList<String>();

			day_List.add("��");
			day_List.add("��");
			day_List.add("ȭ");
			day_List.add("��");
			day_List.add("��");
			day_List.add("��");
			day_List.add("��");


			cal.set(Calendar.DAY_OF_MONTH, 1); // ������ ���� MONTH�� 7�� �ھƳ�����, 8����. �׸��� �̹����� ���� 1�Ϸμ���. ���� cal�� 8�� 1��

			System.out.println("�� : " + (cal.get(Calendar.MONTH) + 1)); // ���� ����� ���� 1��
			// ���ؼ� ���
			// System.out.println("�� : " + cal.get(Calendar.DAY_OF_MONTH));// ���� �״�� ���

			// cal.set(Calendar.MONTH, 6);// ���޷� �ѹ��̵� ex_LastDay ã������, 8��1�Ͽ��� ���� �����Ͽ� 7��1�Ϸ�
			// ����� add�� �����Ұ�

			// System.out.println(cal.get(Calendar.MONTH)); (Ȯ��)
			cal.add(Calendar.MONTH, -1);
			// System.out.println(cal.get(Calendar.MONTH)); (Ȯ��)
			int ex_LastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // ������ ��������
			// System.out.println("������ ������ �� : " + ex_LastDay);

			//////
			cal.add(Calendar.MONTH, 1);// �ٽ� �̹��޷� �����ؾ���, �����޿� ���� ������ �پ���� ����. add�� �����Ұ�
			//////

			int this_LastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // �̹����� ������ �ϼ�, 31���̰ų� 30���̰ų� 29���̰ų�
			int position_this = cal.get(Calendar.DAY_OF_WEEK); // �̹��� ù���� ���� ��ġ . �Ͽ����� 1. ������ 8�� 1�Ϸ� ���õǾ������ϱ� 8��1���� �����

//		System.out.println(position_this);  //8�������̸� 1���� �����, 7�� ���´�  (Ȯ��)

			int range_this_ex = position_this - 1; // �� ������ ������ (������� 7��) �� ���������� 26��(�Ͽ���)�� 8�� 1���� �Ÿ����̸� ����. 6�̳�������.
//		System.out.println(position_this);  (Ȯ��)
//		System.out.println(range_this_ex);  (Ȯ��)
//		for (int i = range_this_ex - 1; i >= 0; i--) {
//
//			System.out.println(ex_LastDay - i); // 26~31 , �� ������ ��¥���� �����°� Ȯ��. for���� �׳� �˸°� �������ָ� ��. ���� ��Ģ�� ����. ����غ��鼭
//												// ��������
//
//		}

			for (int i = range_this_ex - 1; i >= 0; i--) {
				// ArrayList�� ���� ���� ����

				ShowCal.add(ex_LastDay - i);

			}

			for (int i = 1; i <= this_LastDay; i++) {
				// ArrayList�� �̹��� ���� ����
				ShowCal.add(i);
			}

			////////
			// ���� ������ ������ ���� �ֱ�
			////////

			cal.add(Calendar.MONTH, 1);// �����޷� �̵� add�� �����Ұ�

			int position_next = cal.get(Calendar.DAY_OF_WEEK); // ������ 1���� ���� ��ġ.

//		System.out.println(position_next); //8���� ���� ��. �����̾ƴ϶� , ��Ģ�� ã�ƺ�.

			// position_next���� 3�϶�, ������ �־���ϴ� ���ϼ��� 5 . 2�϶� ������ �־���ϴ� ���ϼ��� 6. 1�϶� ������ �־���ϴ�
			// ���ϼ��� 7 . �׷��� 8���� position���� ���ָ� �־���� ���� ���� ����

			// System.out.println(position_next);
			for (int i = 1; i <= 8 - position_next; i++) {// ������ ����
				ShowCal.add(i);
			}
			cal.add(Calendar.MONTH, -1);// �ٽ� �̹��޷� �̵� add�� �����Ұ�

			System.out.println(cal.get(Calendar.YEAR) + "��  " + (cal.get(Calendar.MONTH) + 1) + "��");

			System.out.println("\n---------------------------------------------");
			for (int i = 0; i < day_List.size(); i++) { // �������
				System.out.print(day_List.get(i) + "          ");
			}

			System.out.println("\n---------------------------------------------");

			for (int i = 0; i < ShowCal.size(); i++) {// �޷����

				if (i % 7 == 0) { // �Ͽ����� 1. �״ϱ� 7�γ���� ����������, ���� �ٲ����. 0 1 2 3 4 5 6 �� ù°�� ��~�� �̰�. 7�̵Ǵ¼��� �� ������
									// �Ͽ����̴ϱ�. �̰͵� �׳� ���� �����
					System.out.println();
				}

				if ((ShowCal.get(i) >= 0) && (ShowCal.get(i) < 10)) { // ���� ���ڸ��� ������ �� ĭ �� �־��༭ ���� �̻ڰ� �����Բ� . ū �ǹ̴� ����

					System.out.print(ShowCal.get(i) + "      ");

				} else {// ���ڸ��� �̸� �׳� ���
					System.out.print(ShowCal.get(i) + "     ");

				}

			}
			System.out.println("\n---------------------------------------------");

			System.out.print("<1> �� ������ ������ �̵� , <2>�� ������ ���� �޷� �̵� (���Ḧ ���� �� exit �Է�) \n>>>");
			MovePoint = sc.nextLine();

			if (MovePoint.equals("exit")) {
				System.out.println("����");
				break;
			}

			else if (Integer.parseInt(MovePoint) == 1) {

				// �����̵�
				cal.add(Calendar.MONTH, -1); 

			} else if (Integer.parseInt(MovePoint)==2) {
				cal.add(Calendar.MONTH, 1);

			}

		}
	}
}
