import java.util.ArrayList;
import java.util.Scanner;

public class Main_9_WordNote {

	public static void main(String[] args) {

		// 단어장 만들기
		// 단어추가 , 수정 , 삭제 , 단어게임 (아직만들지말기) , 종료
		Scanner sc = new Scanner(System.in);

		ArrayList<String> Note = new ArrayList<String>();
		
		ArrayList<String> Menu = new ArrayList<String>();

		Menu.add("삽입");
		Menu.add("수정");
		Menu.add("삭제");
		Menu.add("출력");
		Menu.add("종료");
		Menu.add("단어게임");
		
		
		int MenuNum = 0;

		int input;
		int index;

		String Word;

		System.out.println("----------단어장----------");

		while (true) {

			System.out.println("(" + (MenuNum + 1) + ") " + Menu.get(MenuNum) + "    (" + (MenuNum + 2) + ") "
					+ Menu.get(MenuNum + 1) + "    (" + (MenuNum + 3) + ") " + Menu.get(MenuNum + 2) + "    ("
					+ (MenuNum + 4) + ") " + Menu.get(MenuNum + 3) + "    (" + (MenuNum + 5) + ") "
					+ Menu.get(MenuNum + 4) + "    (" + (MenuNum + 6) + ") "
							+ Menu.get(MenuNum + 5));
			System.out.print(">>>");

			input = Integer.parseInt(sc.nextLine());

			if (input == 1) {
				// 삽입
				System.out.print("단어를 입력해주세요.\n>>>");
				Word = sc.nextLine();

				Note.add(Word);
				System.out.println("--완료--");
			}

			else if (input == 2) {

				System.out.print("수정 할 단어의 인덱스를 입력해주세요.\n>>>");
				index = Integer.parseInt(sc.nextLine());
				System.out.print("새로운 단어를 입력해주세요.\n>>>");
				Word = sc.nextLine();
				Note.set(index, Word);
				System.out.println("--완료--");
			}

			else if (input == 3) {

				System.out.print("삭제 할 단어의 인덱스를 입력해주세요.\n>>>");
				index = Integer.parseInt(sc.nextLine());

				Note.remove(index);
				System.out.println("--완료--");

			} else if (input == 4) {

				System.out.println("-------------------------------------");

				for (int i = 0; i < Note.size(); i++) {

					System.out.println(i + ")  " + Note.get(i));
				}

				System.out.println("-------------------------------------");

			}

			else if (input == 5) {

				System.out.println("종료합니다.");
				System.out.println("-------------------------------------");

				for (int i = 0; i < Note.size(); i++) {

					System.out.println(i + ")  " + Note.get(i));
				}

				System.out.println("-------------------------------------");

			}
			
			else if (input == 6) {

				System.out.println("단어게임");
				System.out.println("-------------------------------------");

				
				
				System.out.println("미구현");
				
				
				
				

				System.out.println("-------------------------------------");

			}
			
			
			

			else {

				System.out.println("잘못된 input 값입니다. 다시 입력하세요.");
			}
		}

	}

}




