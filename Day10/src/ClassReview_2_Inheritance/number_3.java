package ClassReview_2_Inheritance;

import java.util.Random;

public class number_3 extends number_2 {

	// 3. A Ŭ������ 2���� ���� ���ڿ� ���� ��Ģ ������ ���� ��ü�� 5���� ���� ��� ����Ʈ�� �����ϱ�

	number_3 nm3_result;
	
	public String randomSign() {
		Random rd = new Random();
		int temp = rd.nextInt(4);

		if (temp == 0) {
			return "+";
		} else if (temp == 1) {
			return "-";
		} else if (temp == 2) {

			return "*";

		} else if (temp == 3) {
			return "/";
		} else {
			return "�߸��� �Է�";
		}

	}

	public number_3 insert(number_3 nm3) {

		Random rd = new Random();
		
		for (int i = 0; i < 5; i++) {

			nm3.array.add(new number_2());
			nm3.array.get(i).num_1 = rd.nextInt(10) + 1;
			nm3.array.get(i).num_2 = rd.nextInt(10) + 1;
			nm3.array.get(i).str = nm3.randomSign();
			// 0~9������ ���� �������� �޾Ƽ� 2�� �Է� �� , ��Ģ���� �������� ����

		}
		this.nm3_result=nm3;
		
		return nm3;

	}
	
	public void processPrint() {
		
		
		for (int i = 0; i < 5; i++) {// ���

			System.out.print(nm3_result.array.get(i).num_1 + "   " + nm3_result.array.get(i).num_2 + "   " + nm3_result.array.get(i).str);
			// 0~9������ ���� �������� �޾Ƽ� 2�� �Է� �� , ��Ģ���� �������� ����
			System.out.println();
		}
		
		
		
	}

	public static void main(String[] args) {
		// ���� ��ü �����

		number_3 nm3 = new number_3();
		
		nm3.insert(nm3);
		nm3.processPrint();
		

	}

}
