import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordPad {

	public static void main(String[] args) {

		// �ܾ��� �����
		// �ܾ��߰� , ���� , ���� , �ܾ���� (��������������) , ����
		Scanner sc = new Scanner(System.in);

		ArrayList<String> Note = new ArrayList<String>();

		ArrayList<String> Menu = new ArrayList<String>();

		Random rd = new Random();

		int randomInt;

		// �ܾ����
		int score = 0;
		String Word;
		String answer = "";
		////

		// HANGMANGAME
		String Hang_answer;

		Menu.add("����");
		Menu.add("����");
		Menu.add("����");
		Menu.add("���");
		Menu.add("����");
		Menu.add("�ܾ����");
		Menu.add("HANGMAN GAME");
		Menu.add("��ũ���� ����");

		int MenuNum = 0;

		int input;
		int index;

		System.out.println("----------�ܾ���----------");

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
				// ����
				System.out.print("\n�ܾ �Է����ּ���.\n>>>");
				Word = sc.nextLine();

				Note.add(Word);
			}

			else if (input == 2) {

				String FindWord;
				String ReWrite;
				int FindWord_Index = 0;

				boolean findFlag = false;

				System.out.print("\n���� �� �ܾ �Է����ּ���.\n>>>");
				FindWord = sc.nextLine();

				for (int i = 0; i < Note.size(); i++) {

					if (Note.get(i).equals(FindWord)) {

						findFlag = true;

						FindWord_Index = i;
						break;
					}

				}

				if (findFlag == true) {
					System.out.print("\n���ο� �ܾ �Է����ּ���.\n>>>");
					ReWrite = sc.nextLine();

					Note.set(FindWord_Index, ReWrite);
					System.out.println("\n������ �Ϸ�Ǿ����ϴ�.");

				} else {
					System.out.println("\n ���� �ܾ��Դϴ�.");
					break;
				}

			}

			else if (input == 3) {

				
				String removeWord;
				boolean removeFlag=false;
				
				
				System.out.print("\n���� �� �ܾ �Է����ּ���.\n>>>");
				removeWord=sc.nextLine();
				
				
				
				for(int i =0; i< Note.size();i++) {
					
					if(Note.get(i).equals(removeWord)) {
						
						Note.remove(i);
						removeFlag=true;
						System.out.println("\n�����Ͽ����ϴ�.");
						break;
					}
					
					
				}
				if(removeFlag==false) {
					
					System.out.println("\n�����Ϸ��� �ܾ �������� �ʽ��ϴ�.");
					
				}
				
		
				
				
				
				

			} else if (input == 4) {
				System.out.println("\n<<<<<<<<<<<<<�ܾ���>>>>>>>>>>>>>");
				System.out.println("\n-------------------------------------\n\n");

				for (int i = 0; i < Note.size(); i++) {

					System.out.println((i + 1) + ")  " + Note.get(i));
				}

				System.out.println("\n\n-------------------------------------");

			}

			else if (input == 5) {

				System.out.println("\n�����մϴ�.");
				System.out.println("-------------------------------------");

				for (int i = 0; i < Note.size(); i++) {

					System.out.println(i + ")  " + Note.get(i));
				}

				break;

			}

			else if (input == 6) {

				if (!(Note.size() == 0)) {

					System.out.println("\n<<<<<<<<<��ĭ�ܾ����>>>>>>>>>");
					System.out.println("-------------------------------------");
					System.out.println("exit�Է½� ����");

					String[] SPLIT_word;

					for (int i = 0; i < Note.size(); i++) {

						System.out.print((i + 1) + "�� ���� -->  ");

						SPLIT_word = Note.get(i).split("");
						randomInt = rd.nextInt(SPLIT_word.length);
						for (int j = 0; j < SPLIT_word.length; j++) {

							if (randomInt == j) {
								System.out.print("@  ");

							} else {
								System.out.print(SPLIT_word[j] + "  ");
							}

						}

						System.out.println("\n-----@ �� �� ���ڸ� �Է����ּ���!-----");
						answer = sc.nextLine();

						if (answer.equals("exit")) {
							break;

						}

						else if (answer.equals(SPLIT_word[randomInt])) {

							System.out.println("-----�����Դϴ�. ���� ȹ��!!-----");
							score = score + 1;

						} else {

							System.out.println("-----�����Դϴ�!!-----");

						}

						System.out.println();
					}

					System.out.println("------------���� ���� ���---------------");

					System.out.println("�� ���� �� : " + Note.size());
					System.out.println("���� ���� �� : " + score);
					System.out.println("Ʋ�� ���� �� : " + (Note.size() - score));
					System.out.println("-------------------------------------");

				} else {

					System.out.println("\n��Ʈ�� �ƹ��� �ܾ ����Ǿ����� �ʽ��ϴ�. ���� �� �ٽ� �õ����ּ���.\n");

				}

			} else if (input == 7) {

				if (!(Note.size() == 0)) {

					System.out.println("\n<<<<<<<<<HANGMAN GAME!!>>>>>>>>>");
					System.out.println();

					int correct = 0;
					int total = 7; // �Ӹ� ���� ���� ������ �޴ٸ� �����ٸ� ���
					int count=0;
					
					boolean checkFlag = false;
					boolean FinishFlag=false;
					
					randomInt = rd.nextInt(Note.size());
					String[] Hang_SPLIT_word; // �ܾ��Ʈ�� �ϳ��� �����Ͽ� , �ɰ��� �迭�� ����
					String[] Hang_My_Answer; // ���� ���߾��� �� ���� �迭

					Hang_SPLIT_word = Note.get(randomInt).split("");
					Hang_My_Answer = new String[Hang_SPLIT_word.length];

					for (int i = 0; i < Hang_SPLIT_word.length; i++) {
						System.out.print("__ ");

					}

					while (total > 0) { // �� 7ȸ�� ��ȸ

						System.out.print("\n��ĭ�� �� �� ���� ���ڸ�  �Է��ϼ���! (exit�Է½� ����)\n>>>");
						Hang_answer = sc.nextLine();
						System.out.println();
						if (Hang_answer.equals("exit")) {

							break;
						}
						for (int j = 0; j < Hang_SPLIT_word.length; j++) { // �´��� Ȯ���ϴ� �ݺ���

							if ((Hang_SPLIT_word[j].equals(Hang_answer))
									&& (!Hang_SPLIT_word[j].equals(Hang_My_Answer[j]))) { // &&���� ������ ���� ���ڸ� �� �Է����� ��

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
								System.out.println("\n\n<<<<<< ����!! ���� ����!! >>>>>>");
								FinishFlag=true;
								break;
							}
							
						}
						
						
						count=0;
						
						if(FinishFlag==false) {
							
							System.out.println("\n\n���� ���� �� : " + correct);
							System.out.println("���� ��� : " + total + "\n");
							checkFlag = false;// ���� flag ����
						}
						else {
							
							break;
						}
						
					}

					if (total == 0) {

						System.out.println("-------HANGMAN GAME �й�!!-------\n");
						System.out.println("������ <   " + Note.get(randomInt) + "   >�Դϴ�.\n");
					}

					System.out.println("-------------------------------------");
				}

			
			else {

				System.out.println("\n��Ʈ�� �ƹ��� �ܾ ����Ǿ����� �ʽ��ϴ�. ���� �� �ٽ� �õ����ּ���.\n");

			}
		}
	
			else if (input == 8) {
				
				
				if (!(Note.size() == 0)) {
				

				System.out.println("\n<<<<<<<<<��ũ���� ����!!>>>>>>>>>");
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
				
				
				////////////////////////////////////////////////////��

				System.out.println();

				while (total > 0) {
					System.out.print("\n���� �Է�  >>>  ");
					scramble_My_answer = sc.nextLine();
					if (scramble_My_answer.equals(scramble_answer)) {

						System.out.println("\n�����Դϴ�.");
						break;
					} else {
						total--;
						System.out.print("\n�����Դϴ�!!  ");
						System.out.println("���� ��ȸ : " + total);
					}

				}
				if (total == 0) {
					System.out.println("\n��ũ���� ���� �й�!!");
				}

			}
				
				else {
					
					System.out.println("\n��Ʈ�� �ƹ��� �ܾ ����Ǿ����� �ʽ��ϴ�. ���� �� �ٽ� �õ����ּ���.\n");
				}
		}
			
			
			//////

			else {

				System.out.println("�߸��� input ���Դϴ�. �ٽ� �Է��ϼ���.");
			}

		}

}

}
