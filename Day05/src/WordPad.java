import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordPad {

	public static void main(String[] args) {

		// 단어장 만들기
		// 단어추가 , 수정 , 삭제 , 단어게임 (아직만들지말기) , 종료
		Scanner sc = new Scanner(System.in);

		ArrayList<String> Note = new ArrayList<String>();

		ArrayList<String> Menu = new ArrayList<String>();

		Random rd = new Random();

		int randomInt;

		// 단어게임
		int score = 0;
		String Word;
		String answer = "";
		////

		// HANGMANGAME
		String Hang_answer;

		Menu.add("삽입");
		Menu.add("수정");
		Menu.add("삭제");
		Menu.add("출력");
		Menu.add("종료");
		Menu.add("단어게임");
		Menu.add("HANGMAN GAME");
		Menu.add("스크럼블 게임");

		int MenuNum = 0;

		int input;
		int index;

		System.out.println("----------단어장----------");

		while (true) {
			System.out.println();
			System.out.println("(" + (MenuNum + 1) + ") " + Menu.get(MenuNum) + "    (" + (MenuNum + 2) + ") "
					+ Menu.get(MenuNum + 1) + "    (" + (MenuNum + 3) + ") " + Menu.get(MenuNum + 2) + "    ("
					+ (MenuNum + 4) + ") " + Menu.get(MenuNum + 3) + "    (" + (MenuNum + 5) + ") "
					+ Menu.get(MenuNum + 4) + "    (" + (MenuNum + 6) + ") " + Menu.get(MenuNum + 5) + "    ("
					+ (MenuNum + 7) + ") " + Menu.get(MenuNum + 6) + "    (" + (MenuNum + 8) + ") "
					+ Menu.get(MenuNum + 7));
			System.out.print(">>>");

			input = Integer.parseInt(sc.nextLine());

			if (input == 1) {
				// 삽입
				System.out.print("\n단어를 입력해주세요.\n>>>");
				Word = sc.nextLine();

				Note.add(Word);
			}

			else if (input == 2) {

				String FindWord;
				String ReWrite;
				int FindWord_Index = 0;

				boolean findFlag = false;

				System.out.print("\n수정 할 단어를 입력해주세요.\n>>>");
				FindWord = sc.nextLine();

				for (int i = 0; i < Note.size(); i++) {

					if (Note.get(i).equals(FindWord)) {

						findFlag = true;

						FindWord_Index = i;
						break;
					}

				}

				if (findFlag == true) {
					System.out.print("\n새로운 단어를 입력해주세요.\n>>>");
					ReWrite = sc.nextLine();

					Note.set(FindWord_Index, ReWrite);
					System.out.println("\n수정이 완료되었습니다.");

				} else {
					System.out.println("\n 없는 단어입니다.");
					break;
				}

			}

			else if (input == 3) {

				
				String removeWord;
				boolean removeFlag=false;
				
				
				System.out.print("\n삭제 할 단어를 입력해주세요.\n>>>");
				removeWord=sc.nextLine();
				
				
				
				for(int i =0; i< Note.size();i++) {
					
					if(Note.get(i).equals(removeWord)) {
						
						Note.remove(i);
						removeFlag=true;
						System.out.println("\n삭제하였습니다.");
						break;
					}
					
					
				}
				if(removeFlag==false) {
					
					System.out.println("\n삭제하려는 단어가 존재하지 않습니다.");
					
				}
				
		
				
				
				
				

			} else if (input == 4) {
				System.out.println("\n<<<<<<<<<<<<<단어목록>>>>>>>>>>>>>");
				System.out.println("\n-------------------------------------\n\n");

				for (int i = 0; i < Note.size(); i++) {

					System.out.println((i + 1) + ")  " + Note.get(i));
				}

				System.out.println("\n\n-------------------------------------");

			}

			else if (input == 5) {

				System.out.println("\n종료합니다.");
				System.out.println("-------------------------------------");

				for (int i = 0; i < Note.size(); i++) {

					System.out.println(i + ")  " + Note.get(i));
				}

				break;

			}

			else if (input == 6) {

				if (!(Note.size() == 0)) {

					System.out.println("\n<<<<<<<<<빈칸단어게임>>>>>>>>>");
					System.out.println("-------------------------------------");
					System.out.println("exit입력시 종료");

					String[] SPLIT_word;

					for (int i = 0; i < Note.size(); i++) {

						System.out.print((i + 1) + "번 문제 -->  ");

						SPLIT_word = Note.get(i).split("");
						randomInt = rd.nextInt(SPLIT_word.length);
						for (int j = 0; j < SPLIT_word.length; j++) {

							if (randomInt == j) {
								System.out.print("@  ");

							} else {
								System.out.print(SPLIT_word[j] + "  ");
							}

						}

						System.out.println("\n-----@ 에 들어갈 글자를 입력해주세요!-----");
						answer = sc.nextLine();

						if (answer.equals("exit")) {
							break;

						}

						else if (answer.equals(SPLIT_word[randomInt])) {

							System.out.println("-----정답입니다. 점수 획득!!-----");
							score = score + 1;

						} else {

							System.out.println("-----오답입니다!!-----");

						}

						System.out.println();
					}

					System.out.println("------------점수 집계 결과---------------");

					System.out.println("총 문제 수 : " + Note.size());
					System.out.println("맞은 문제 수 : " + score);
					System.out.println("틀린 문제 수 : " + (Note.size() - score));
					System.out.println("-------------------------------------");

				} else {

					System.out.println("\n노트에 아무런 단어가 저장되어있지 않습니다. 저장 후 다시 시도해주세요.\n");

				}

			} else if (input == 7) {

				if (!(Note.size() == 0)) {

					System.out.println("\n<<<<<<<<<HANGMAN GAME!!>>>>>>>>>");
					System.out.println();

					int correct = 0;
					int total = 7; // 머리 몸통 왼팔 오른팔 왼다리 오른다리 사망
					int count=0;
					
					boolean checkFlag = false;
					boolean FinishFlag=false;
					
					randomInt = rd.nextInt(Note.size());
					String[] Hang_SPLIT_word; // 단어리스트중 하나를 선택하여 , 쪼개어 배열에 저장
					String[] Hang_My_Answer; // 답을 맞추었을 때 담을 배열

					Hang_SPLIT_word = Note.get(randomInt).split("");
					Hang_My_Answer = new String[Hang_SPLIT_word.length];

					for (int i = 0; i < Hang_SPLIT_word.length; i++) {
						System.out.print("__ ");

					}

					while (total > 0) { // 총 7회의 기회

						System.out.print("\n빈칸에 들어갈 것 같은 글자를  입력하세요! (exit입력시 종료)\n>>>");
						Hang_answer = sc.nextLine();
						System.out.println();
						if (Hang_answer.equals("exit")) {

							break;
						}
						for (int j = 0; j < Hang_SPLIT_word.length; j++) { // 맞는지 확인하는 반복문

							if ((Hang_SPLIT_word[j].equals(Hang_answer))
									&& (!Hang_SPLIT_word[j].equals(Hang_My_Answer[j]))) { // &&뒤의 조건은 맞춘 글자를 또 입력했을 때

								Hang_My_Answer[j] = Hang_SPLIT_word[j];
								checkFlag = true;
							}

						}

						if (checkFlag == false) {

							total = total - 1;

						}
						else {
							correct += 1;
						}

						for (int i = 0; i < Hang_SPLIT_word.length; i++) {

							if (Hang_My_Answer[i] != null) {
								System.out.print(Hang_My_Answer[i] + "  ");
								count++;
								
							}

							else {
								System.out.print("__ ");
							}
							
							
							if(count==Hang_SPLIT_word.length) {
								System.out.println("\n\n<<<<<< 성공!! 게임 종료!! >>>>>>");
								FinishFlag=true;
								break;
							}
							
						}
						
						
						count=0;
						
						if(FinishFlag==false) {
							
							System.out.println("\n\n맞춘 글자 수 : " + correct);
							System.out.println("남은 목숨 : " + total + "\n");
							checkFlag = false;// 정답 flag 리셋
						}
						else {
							
							break;
						}
						
					}

					if (total == 0) {

						System.out.println("-------HANGMAN GAME 패배!!-------\n");
						System.out.println("정답은 <   " + Note.get(randomInt) + "   >입니다.\n");
					}

					System.out.println("-------------------------------------");
				}

			
			else {

				System.out.println("\n노트에 아무런 단어가 저장되어있지 않습니다. 저장 후 다시 시도해주세요.\n");

			}
		}
	
			else if (input == 8) {
				
				
				if (!(Note.size() == 0)) {
				

				System.out.println("\n<<<<<<<<<스크럼블 게임!!>>>>>>>>>");
				System.out.println();

				String scramble_answer;
				String scramble_My_answer;

				int total = 7;

				boolean[] randomArray; // false

				randomInt = rd.nextInt(Note.size());

				scramble_answer = Note.get(randomInt);

				String[] chooseWord = Note.get(randomInt).split("");
				
				
				for(int i =0; i<scramble_answer.length();i++) {
					
					chooseWord[i]=scramble_answer.substring(i,i+1);
					
				}
				
				randomArray = new boolean[chooseWord.length];
				

				
				/////////////////////////////////

				for (int i = 0; i < chooseWord.length; i++) {

					randomInt = rd.nextInt(chooseWord.length);

					if (randomArray[randomInt] == false) {

						System.out.print(chooseWord[randomInt] + "  ");
						randomArray[randomInt] = true;
					} 
					else {

						i--;

					}
				}
//				
				
				
				////////////////////////////////////////////////////썪

				System.out.println();

				while (total > 0) {
					System.out.print("\n정답 입력  >>>  ");
					scramble_My_answer = sc.nextLine();
					if (scramble_My_answer.equals(scramble_answer)) {

						System.out.println("\n정답입니다.");
						break;
					} else {
						total--;
						System.out.print("\n오답입니다!!  ");
						System.out.println("남은 기회 : " + total);
					}

				}
				if (total == 0) {
					System.out.println("\n스크럼블 게임 패배!!");
				}

			}
				
				else {
					
					System.out.println("\n노트에 아무런 단어가 저장되어있지 않습니다. 저장 후 다시 시도해주세요.\n");
				}
		}
			
			
			//////

			else {

				System.out.println("잘못된 input 값입니다. 다시 입력하세요.");
			}

		}

}

}
