package VOCA_Pack;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		
		//��Ű�� �޼ҵ� Ŭ���� ���������� Ȱ���ؼ�
		//���� �ܾ��常���
	    //������Ŀ��� �߰� ���� ���� ����
		//������ ����
		
		
		//���� �� �ѱ��Է½� Ȥ�� �ѱ��Է½� �ֿܼ� ���콺�� �ѹ� Ŭ���ؼ�  >>>��ġ���� �̻ڰ� �ԷµǰԲ� �����ٰ�
		
		Scanner sc= new Scanner(System.in);
		String numinput;

		
		ArrayList<Voca> myVoca = new ArrayList<>();
		Control ctr = new Control();
		
		ctr.openFile(myVoca);
//		
		
		while(true) {
			System.out.println("---------------�Է� ---------------");
			System.out.println("1. �ܾ� ���     2. �ܾ��帮��Ʈ ���    3. �ܾ� �˻� �� ����      4. �ܾ� ����     5. ���α׷�����");
			numinput=sc.nextLine();
			
			if(numinput.equals("1")) {
				ctr.newWord(myVoca);
				ctr.create(myVoca);
			}
			else if(numinput.equals("2")) {
				ctr.read(myVoca);
			}
			else if(numinput.equals("3")) {
				ctr.update(myVoca);
				ctr.create(myVoca);
			}
			else if(numinput.equals("4")) {
				ctr.delete(myVoca);
				ctr.create(myVoca);
			}
			else if(numinput.equals("5")) {
				System.exit(0);
			}
			
			
		}
		
		

	}
	
	
	

}
