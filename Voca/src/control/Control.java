package control;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import model.Voca;

public class Control {
	ArrayList<Voca> vocaArr = new ArrayList<>();
	
	private void showVoca() {
		System.out.println("[ �� �ܾ��� " + vocaArr.size() + "�� ]");
		for (int i = 0; i < vocaArr.size(); i++) {
			System.out.println((i + 1) + ". " + vocaArr.get(i).getEng()  + " : " +vocaArr.get(i).getKor() );
		}
	}
	
	private void addVoca() {
		
	}
	
	public void init() {

		/**
		 * ��Ű��, �޼ҵ�, Ŭ����, ���������� Ȱ���ؼ�
		 * �׷����� ���� �ܾ����� ������
		 * ������Ʈ�� ����൵ ���� �߰�, ���� ������ �����͵���
		 * ���� �ǵ���
		 */
		
//		ArrayList<String> korArr = new ArrayList<>();
//		korArr.add("��");
//		korArr.add("å��");
//		korArr.add("�Ǹ�");
//		korArr.add("����");
//		
//		ArrayList<String> engArr = new ArrayList<>();
//		engArr.add("dog");
//		engArr.add("desk");
//		engArr.add("devil");
//		engArr.add("death");

		while (true) {
			System.out.println("����: " + vocaArr.size());
			System.out.println("----------------------");
			System.out.println("|  ���ҷ�?");
			System.out.println("|  1. �߰�    2. ����    3. ����   4. ����   5. ������");
			System.out.println("----------------------");
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();

			if (input.equals("1")) {
				// ������ �Է��� �ܾ���ֱ�
				showVoca();
				
				System.out.println();
				System.out.println("�߰��� �ܾ� �Է��ϼ�");
				input = scan.nextLine();
				System.out.println("�ѱ� ��?");
				String kor = scan.nextLine();
				vocaArr.add(new Voca(input, kor));

			} else if (input.equals("2")) {
				showVoca();
				System.out.println();
				System.out.println("������ �ܾ ������ �ּ���");
				input = scan.nextLine();
				int temp = Integer.parseInt(input);
				vocaArr.remove(temp-1) ;		
			} else if (input.equals("3")) {
				// �ܾ���ֱ�
				showVoca();
				System.out.println();
				System.out.println("������ �ܾ ������ �ּ���");
				input = scan.nextLine();
				int temp = Integer.parseInt(input);
				System.out.println("������ �ܾ� �Է��ϼ�");
				input = scan.nextLine();
				vocaArr.get(temp - 1).setEng(input);
//				engArr.set(temp - 1, input);
				System.out.println("������ �ѱ۶� �Է��ϼ�");
				input = scan.nextLine();
				vocaArr.get(temp - 1).setKor(input);
//				korArr.set(temp - 1, input);
			} else if (input.equals("4")) {
				Random rd = new Random();
				int ranNum = rd.nextInt(vocaArr.size());
				String answer = vocaArr.get(ranNum).getEng();

				String question = "";

				ArrayList<String> tempArr = new ArrayList<String>();
				for (int i = 0; i < answer.length(); i++) {
					tempArr.add(answer.substring(i, i + 1));
				}

				while (tempArr.size() > 0) {
					ranNum = rd.nextInt(tempArr.size());
					question = question + tempArr.get(ranNum);
					tempArr.remove(ranNum);
				}

				String temp = answer;
//				while(temp.length() > 0) {
//					ranNum = rd.nextInt(temp.length());
//					question = question + temp.substring(ranNum, ranNum+1);
//					temp = temp.substring(0, ranNum) + temp.substring(ranNum+1);					
//					System.out.println("ranNum: "+ ranNum +",  question: "+question +", temp: "+ temp);
//				}
				System.out.println("����: " + question);
				input = scan.nextLine();
				if (input.equals(answer)) {
					// ����
				} else {
					// ����
				}

			} else if (input.equals("5")) {
				break;
			} else {
				System.out.println("���� ���� �� ġ��??");
			}
			showVoca();

			System.out.println();
			System.out.println();
		}
	}
}
