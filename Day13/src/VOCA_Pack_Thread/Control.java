package VOCA_Pack_Thread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Control  {

	int memoSize = 0;
	int count=0;
	int count_problem=0;

	
	
	// c r u d

	Scanner sc = new Scanner(System.in);

	public void newWord(ArrayList<Voca> tempVoca) {
		String eng_input;
		String kor_input;

		boolean flag = false;

		while (true) {
			System.out.print("���ܾ �Է��ϼ���.\n��");
			eng_input = sc.nextLine();

			for (int i = 0; i < tempVoca.size(); i++) {
				// �ߺ�üũ
				if (tempVoca.get(i).getEng().equals(eng_input)) {
					// �ߺ��߰�
					System.out.println("�ߺ��Ǵ� �ܾ��Դϴ�.");
					flag = true;
					break;
				}

			}

			if (flag == false) {
				// �ߺ� �������
				System.out.print("���ܾ� ���� �Է��ϼ���.\n��");
				kor_input = sc.nextLine();
				tempVoca.add(new Voca(eng_input, kor_input));// �ܾ��忡 �ܾ� ���

				break;
			} else {
				flag = false;
			}

		}
		this.memoSize = tempVoca.size();

	}

	public void create(ArrayList<Voca> tempVoca) {
//		System.out.println("����Ʈ ���� "+this.memoSize);
		// �޸��忡 �ۼ�
		int count = 0;

		try {

			FileWriter fw = new FileWriter("c:/my/test_mine.txt", false);

			while (this.memoSize > count) {

				fw.write("��  " + tempVoca.get(count).getEng() + "\r\n");
				fw.write("��  " + tempVoca.get(count).getKor() + "\r\n");
				fw.write("\r\n");

				count++;
			}
			fw.close();

		} catch (Exception e) {
			System.out.println("����");
		}

		this.count_problem=tempVoca.size();
		
		System.out.println("�Է³�");
	}

	public void read(ArrayList<Voca> tempVoca) {
		// ��� ���
		for (int i = 0; i < tempVoca.size(); i++) {
			System.out.println("-----" + (i + 1) + "�� �ܾ�" + "-----");
			System.out.println("��   : " + tempVoca.get(i).getEng());
			System.out.println("��   : " + tempVoca.get(i).getKor());
			System.out.println();
		}

	}

	public void update(ArrayList<Voca> tempVoca) {
		String eng_input;
		String kor_input;
		boolean flag = false;
		int findIndex;

		// �ܾ� �˻��� ����
		try {
			// �޸��忡�� ã���� arrayList Ŭ������ �ٽ� ��

			System.out.print("���� �� ���ܾ �Է��ϼ���.\n��");
			eng_input = sc.nextLine();

			for (int i = 0; i < tempVoca.size(); i++) {
				// �ߺ�üũ
				if (tempVoca.get(i).getEng().equals(eng_input)) {
					// �ߺ��߰�
					System.out.println("�ܾ ã�ҽ��ϴ�.");
					findIndex = i;
					System.out.print("���ο� ���ܾ� �Է�\n>>>");
					eng_input = sc.nextLine();
					System.out.print("���ο� ���ܾ� �� �Է�\n>>>");
					kor_input = sc.nextLine();

					tempVoca.set(findIndex, new Voca(eng_input, kor_input));

					flag = true;// ã�Ƽ� ������
					System.out.println((findIndex + 1) + "��° ��ġ �ܾ ���� ���� �Ǿ����ϴ�.");

				}

			}

			if (flag == false) {
				System.out.println("�ܾ ã�� �� �Ͽ����ϴ�.");
			}

		} catch (Exception e) {

			System.out.println("����");
		}
//		System.out.println("����Ʈ ���� "+this.memoSize);

	}

	public void delete(ArrayList<Voca> tempVoca) {
		String eng_input;
		boolean flag = false;
		int findIndex;

		try {

			System.out.print("���� �� ���ܾ �Է��ϼ���.\n��");
			eng_input = sc.nextLine();

			for (int i = 0; i < tempVoca.size(); i++) {
				// �ߺ�üũ
				if (tempVoca.get(i).getEng().equals(eng_input)) {
					// �ߺ��߰�
					System.out.println("�ܾ ã�ҽ��ϴ�.");
					findIndex = i;

					tempVoca.remove(findIndex);
					flag = true;// ����Ʈ���� ã�Ƽ� ������
					System.out.println((findIndex + 1) + "��° ��ġ �ܾ ���� ���� �Ǿ����ϴ�.");
				}

			}

			if (flag == false) {
				System.out.println("�ܾ ã�� �� �Ͽ����ϴ�.");
			}

		} catch (Exception e) {
			System.out.println("����");
		}

	}

	public void game(ArrayList<Voca> tempVoca) {

		threadClass th = new threadClass();
		th.start();
		
		
		
		String inputString;
		this.count_problem=tempVoca.size();
		for (int i = 0; i < tempVoca.size(); i++) {

			
			
			
			System.out.print(tempVoca.get(i).getKor() + " ��(��) ����� �Է��ϼ���\n��");

			inputString = sc.nextLine();
			if (inputString.equals(tempVoca.get(i).getEng())) {

				System.out.println("����!");
				this.count++;

			} else {
				System.out.println("����!");
				this.count++;
			}
			
			if(this.count==this.count_problem) {
				System.out.println("������");
				System.out.println("�� �ɸ� �ð� : "+th.count);
				System.out.println("��� �ð� : "+ (th.count/this.count_problem));
			}

		}

	}



	///////////////////////////////////////////////////////

	public void openFile(ArrayList<Voca> FileVoca) {

		String eng_temp;
		String kor_temp;
		String line;

		try {

			BufferedReader br = new BufferedReader(new FileReader("c:/my/test_mine.txt"));
			while (true) {
				line = br.readLine();
				if (line == null)
					break;
				eng_temp = line.substring(3);
				line = br.readLine();
				kor_temp = line.substring(3);
				line = br.readLine();
				FileVoca.add(new Voca(eng_temp, kor_temp));
			}

			br.close();

		} catch (Exception e) {

			System.out.println("���� �ܾ����� �������� �ʽ��ϴ�. ���� �ۼ��ϼ���.");
		}

	}

}
