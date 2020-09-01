package control;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import model.Voca;

public class Control {
	ArrayList<Voca> vocaArr = new ArrayList<>();
	
	private void showVoca() {
		System.out.println("[ 현 단어장 " + vocaArr.size() + "개 ]");
		for (int i = 0; i < vocaArr.size(); i++) {
			System.out.println((i + 1) + ". " + vocaArr.get(i).getEng()  + " : " +vocaArr.get(i).getKor() );
		}
	}
	
	private void addVoca() {
		
	}
	
	public void init() {

		/**
		 * 패키지, 메소드, 클래스, 파일저장을 활용해서
		 * 그럴듯한 영어 단어장을 만들어보자
		 * 프로젝트를 재실행도 내가 추가, 삭제 수정한 데이터들이
		 * 유지 되도록
		 */
		
//		ArrayList<String> korArr = new ArrayList<>();
//		korArr.add("개");
//		korArr.add("책상");
//		korArr.add("악마");
//		korArr.add("죽음");
//		
//		ArrayList<String> engArr = new ArrayList<>();
//		engArr.add("dog");
//		engArr.add("desk");
//		engArr.add("devil");
//		engArr.add("death");

		while (true) {
			System.out.println("길이: " + vocaArr.size());
			System.out.println("----------------------");
			System.out.println("|  뭐할래?");
			System.out.println("|  1. 추가    2. 삭제    3. 수정   4. 게임   5. 끝내기");
			System.out.println("----------------------");
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();

			if (input.equals("1")) {
				// 이전에 입력한 단어보여주기
				showVoca();
				
				System.out.println();
				System.out.println("추가할 단어 입력하셈");
				input = scan.nextLine();
				System.out.println("한글 뜻?");
				String kor = scan.nextLine();
				vocaArr.add(new Voca(input, kor));

			} else if (input.equals("2")) {
				showVoca();
				System.out.println();
				System.out.println("삭제할 단어를 선택해 주세요");
				input = scan.nextLine();
				int temp = Integer.parseInt(input);
				vocaArr.remove(temp-1) ;		
			} else if (input.equals("3")) {
				// 단어보여주기
				showVoca();
				System.out.println();
				System.out.println("수정할 단어를 선택해 주세요");
				input = scan.nextLine();
				int temp = Integer.parseInt(input);
				System.out.println("수정할 단어 입력하셈");
				input = scan.nextLine();
				vocaArr.get(temp - 1).setEng(input);
//				engArr.set(temp - 1, input);
				System.out.println("수정할 한글뜻 입력하셈");
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
				System.out.println("문제: " + question);
				input = scan.nextLine();
				if (input.equals(answer)) {
					// 정답
				} else {
					// 오답
				}

			} else if (input.equals("5")) {
				break;
			} else {
				System.out.println("또이 또이 안 치냐??");
			}
			showVoca();

			System.out.println();
			System.out.println();
		}
	}
}
