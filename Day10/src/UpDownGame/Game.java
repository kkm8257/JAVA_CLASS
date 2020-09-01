package UpDownGame;

import java.util.Random;
import java.util.Scanner;

public class Game {
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);

	int my_ans;
	int com_ans;
	int number_range;

	int my_input;
	int com_input;

	int my_min;
	int my_max;
	int com_min;
	int com_max;

	boolean myflag;
	boolean comflag;

	
	int count=1;
//	���� ��ǻ���� ���
//	���ڹ����� 0���� ����. �ѹ� ���� �ؼ� ������ ���Ϳ� ����
//	
//	�������
//	
//	�������Ѽ��ں��� up�̸� �����Ͽ��� �� ����+1
//	�������Ѽ��ں��� down�̸� �����Ͽ��� �� ����-1
//	
//	���� ������ Ƚ���� ���� ī��Ʈ (������ ��������� while �������ϱ�)
//	
//	���� �Ѹ��� ���� ������ �Ѵ�

	public Game() {

		System.out.println("<<<<���ӽ���>>>>");
		System.out.print("������ �������ϴ�. 1���� ������� ���ڸ� �Ұ��ΰ���?\n>>>");
		number_range = Integer.parseInt(sc.nextLine());
		my_ans = rd.nextInt(number_range) + 1;
		com_ans = rd.nextInt(number_range) + 1;

		my_min = 1;
		my_max = number_range;
		com_min = 1;
		com_max = number_range;

	}

	public void mycheck() {
		System.out.println("�� ������ :  " + this.my_min + " ~ " + this.my_max);
		while (true) {

			
			System.out.print("�� ���� ==>  ");
			int my_input = Integer.parseInt(sc.nextLine());
			if (this.my_min > my_input) { // �� �ּҰ����� �� ���� ���� �Է½�
				System.out.println("������ �°� �� ū���� �Է�");
				continue;
			}

			else if (this.my_max < my_input) { // �� �ִ밪���� �� ū ���� �Է½�
				System.out.println("������ �°� �� �������� �Է�");
				continue;
			}

			else if (my_input > this.my_ans) {
				System.out.println("DOWN!");
				this.my_max = my_input-1;
				break;

			} else if (my_input < this.my_ans) {
				System.out.println("UP!");
				this.my_min = my_input+1;
				break;

			} else if (my_input == this.my_ans) {
				System.out.println("����! ���� �¸�!");
				this.myflag = true;
				break;
			}
		}

	}

	public void comcheck() {
		System.out.println("��ǻ���� ������ :  " + this.com_min + " ~ " + this.com_max); 
		System.out.print("��ǻ�� ���� ==>  ");

		while (true) {
			int com_input = rd.nextInt(this.com_max) + 1;
			
			if((this.com_min > com_input)||(this.com_max < com_input) ) {
				
				continue;
			}
			

			else if (com_input > this.com_ans) {
				System.out.println(com_input);
				System.out.println("DOWN!");
				this.com_max = com_input-1;
				break;
			} else if (com_input < this.com_ans) {
				System.out.println(com_input);
				System.out.println("UP!");
				this.com_min = com_input+1;
				break;
			} else if (com_input == this.com_ans) {
				System.out.println(com_input);
				System.out.println("��ǻ�Ͱ� ������ ���߾����ϴ�!  ��ǻ���� �¸�");
				this.comflag = true;
				break;
			}
		}

	}

	public static void main(String[] args) {

		Game gm = new Game();
		
		while (true) {
			System.out.println("-------------------"+gm.count+"�� �õ�"+"-------------------");
			gm.mycheck();
			if (gm.myflag == true)
				break;
			gm.comcheck();
			if (gm.comflag == true)
				break;
		}

	}

}
