package ClassReview;

import java.util.ArrayList;
import java.util.Random;

public class number_3 {

	// 3. A Ŭ������ 2���� ���� ���ڿ� ���� ��Ģ ������ ���� ��ü�� 5���� ���� ��� ����Ʈ�� �����ϱ�

	public static String randomSign() {
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

	public static void main(String[] args) {

		// ���� ��ü �����

		Random rd = new Random();

		ArrayList<number_1> array = new ArrayList<>();
		
		for (int i = 0 ;  i <5;i++) {
			
			array.add(new number_1(rd.nextInt(10)+1, rd.nextInt(10)+1, randomSign()));
			//0~9������ ���� �������� �޾Ƽ� 2�� �Է� �� , ��Ģ���� �������� ����
			
		}
		
		for (int i = 0 ;  i <5;i++) {//������ ��ü���� ���� ArrayList ���
			
			System.out.print(array.get(i).num_1+ "   "+array.get(i).num_2+"   "+array.get(i).str);
			//0~9������ ���� �������� �޾Ƽ� 2�� �Է� �� , ��Ģ���� �������� ����
			System.out.println();
		}
		
	
	}

}
