package ClassReview;

import java.util.ArrayList;
import java.util.Random;

public class number_4 {


	public static float resultCal(int a, int b, String c) {
		
		
		if(c.equals("+")) {
			return a+b;
		}
		else if(c.equals("-")) {
			return a-b;
		}
		else if(c.equals("*")) {
			return a*b;
		}
		else if(c.equals("/")) {
			return a/b;
		}
		else {
			//�߸��� �Է�
			return 999999;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		
		
		
		ArrayList<number_1> array = new ArrayList<>();
		
		for (int i = 0 ;  i <5;i++) {
			
			array.add(new number_1(rd.nextInt(10)+1, rd.nextInt(10)+1, number_3.randomSign()));
			//1~10
		}
		
		for (int i = 0 ;  i <5;i++) {//������ ��ü���� ���� ArrayList���� ���� ��� ���
			
			System.out.print("index ("+i+") =>  "+array.get(i).num_1+ "   "+array.get(i).num_2+"   "+array.get(i).str);
			//0~9������ ���� �������� �޾Ƽ� 2�� �Է� �� , ��Ģ���� �������� ����
			System.out.println();
		}
		
		
		//////////////���������� number_3Ŭ������ ����/////
		
		//��� ���
	
		
		
		
	}
	
}
