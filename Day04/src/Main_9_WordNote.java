import java.util.ArrayList;
import java.util.Scanner;

public class Main_9_WordNote {

	public static void main(String[] args) {

		// �ܾ��� �����
		// �ܾ��߰� , ���� , ���� , �ܾ���� (��������������) , ����
		Scanner sc = new Scanner(System.in);

		ArrayList<String> Note = new ArrayList<String>();
		
		ArrayList<String> Menu = new ArrayList<String>();

		Menu.add("����");
		Menu.add("����");
		Menu.add("����");
		Menu.add("���");
		Menu.add("����");
		Menu.add("�ܾ����");
		
		
		int MenuNum = 0;

		int input;
		int index;

		String Word;

		System.out.println("----------�ܾ���----------");

		while (true) {

			System.out.println("(" + (MenuNum + 1) + ") " + Menu.get(MenuNum) + "    (" + (MenuNum + 2) + ") "
					+ Menu.get(MenuNum + 1) + "    (" + (MenuNum + 3) + ") " + Menu.get(MenuNum + 2) + "    ("
					+ (MenuNum + 4) + ") " + Menu.get(MenuNum + 3) + "    (" + (MenuNum + 5) + ") "
					+ Menu.get(MenuNum + 4) + "    (" + (MenuNum + 6) + ") "
							+ Menu.get(MenuNum + 5));
			System.out.print(">>>");

			input = Integer.parseInt(sc.nextLine());

			if (input == 1) {
				// ����
				System.out.print("�ܾ �Է����ּ���.\n>>>");
				Word = sc.nextLine();

				Note.add(Word);
				System.out.println("--�Ϸ�--");
			}

			else if (input == 2) {

				System.out.print("���� �� �ܾ��� �ε����� �Է����ּ���.\n>>>");
				index = Integer.parseInt(sc.nextLine());
				System.out.print("���ο� �ܾ �Է����ּ���.\n>>>");
				Word = sc.nextLine();
				Note.set(index, Word);
				System.out.println("--�Ϸ�--");
			}

			else if (input == 3) {

				System.out.print("���� �� �ܾ��� �ε����� �Է����ּ���.\n>>>");
				index = Integer.parseInt(sc.nextLine());

				Note.remove(index);
				System.out.println("--�Ϸ�--");

			} else if (input == 4) {

				System.out.println("-------------------------------------");

				for (int i = 0; i < Note.size(); i++) {

					System.out.println(i + ")  " + Note.get(i));
				}

				System.out.println("-------------------------------------");

			}

			else if (input == 5) {

				System.out.println("�����մϴ�.");
				System.out.println("-------------------------------------");

				for (int i = 0; i < Note.size(); i++) {

					System.out.println(i + ")  " + Note.get(i));
				}

				System.out.println("-------------------------------------");

			}
			
			else if (input == 6) {

				System.out.println("�ܾ����");
				System.out.println("-------------------------------------");

				
				
				System.out.println("�̱���");
				
				
				
				

				System.out.println("-------------------------------------");

			}
			
			
			

			else {

				System.out.println("�߸��� input ���Դϴ�. �ٽ� �Է��ϼ���.");
			}
		}

	}

}




