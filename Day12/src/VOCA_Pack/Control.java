package VOCA_Pack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Control {
	

	int memoSize=0;
	
	// c r u d

	Scanner sc =new Scanner(System.in);

	
	public void newWord(ArrayList<Voca> tempVoca) {
		String eng_input;
		String kor_input;
		
		boolean flag = false;
		
		
		while (true) {
			System.out.print("영단어를 입력하세요.\n→");
			eng_input = sc.nextLine();

			for (int i = 0; i < tempVoca.size(); i++) {
				// 중복체크
				if (tempVoca.get(i).getEng().equals(eng_input)) {
					// 중복발견
					System.out.println("중복되는 단어입니다.");
					flag = true;
					break;
				}

			}

			if (flag == false) {
				// 중복 무사통과
				System.out.print("영단어 뜻을 입력하세요.\n→");
				kor_input = sc.nextLine();
				tempVoca.add(new Voca(eng_input,kor_input));//단어장에 단어 등록
				
				break;
			} else {
				flag = false;
			}

		}
		this.memoSize=tempVoca.size();
		
	}

	public void create(ArrayList<Voca> tempVoca) {
//		System.out.println("리스트 길이 "+this.memoSize);
		//메모장에 작성
		int count=0;
		
		try {
			
			FileWriter fw=new FileWriter("c:/my/test_mine.txt",false);

			
			while(this.memoSize>count) {
				
				fw.write("▶  " + tempVoca.get(count).getEng()+"\r\n");
				fw.write("▷  "+tempVoca.get(count).getKor()+"\r\n");
				fw.write("\r\n");
				

				count++;
			}
			fw.close();
			

		} catch (Exception e) {
			System.out.println("에러");
		}
	
		System.out.println("입력끝");
	}

	public void read(ArrayList<Voca> tempVoca) {
		// 모두 출력
		for (int i = 0; i < tempVoca.size(); i++) {
			System.out.println("-----"+(i+1)+"번 단어"+"-----");
			System.out.println("▷   : " + tempVoca.get(i).getEng());
			System.out.println("▶   : " + tempVoca.get(i).getKor());
			System.out.println();
		}

	}

	public void update(ArrayList<Voca> tempVoca) {
		String eng_input;
		String kor_input;
		boolean flag = false;
		int findIndex;
		
		
		// 단어 검색후 수정
		try {
			//메모장에서 찾은후 arrayList 클리어후 다시 사

			
			System.out.print("수정 할 영단어를 입력하세요.\n→");
			eng_input = sc.nextLine();

			for (int i = 0; i < tempVoca.size(); i++) {
				// 중복체크
				if (tempVoca.get(i).getEng().equals(eng_input)) {
					// 중복발견
					System.out.println("단어를 찾았습니다.");
					findIndex=i;
					System.out.print("새로운 영단어 입력\n>>>");
					eng_input=sc.nextLine();
					System.out.print("새로운 영단어 뜻 입력\n>>>");
					kor_input=sc.nextLine();

				
					tempVoca.set(findIndex, new Voca(eng_input,kor_input));
					
					flag=true;//찾아서 삭제함
					System.out.println((findIndex+1)+"번째 위치 단어가 정상 수정 되었습니다.");
					
				}

			}
			
			if(flag==false) {
				System.out.println("단어를 찾지 못 하였습니다.");
			}

			
		} catch (Exception e) {

			System.out.println("에러");
		}
//		System.out.println("리스트 길이 "+this.memoSize);

	}

	public void delete(ArrayList<Voca> tempVoca) {
		String eng_input;
		boolean flag = false;
		int findIndex;

		try {
	
			System.out.print("삭제 할 영단어를 입력하세요.\n→");
			eng_input = sc.nextLine();

			for (int i = 0; i < tempVoca.size(); i++) {
				// 중복체크
				if (tempVoca.get(i).getEng().equals(eng_input)) {
					// 중복발견
					System.out.println("단어를 찾았습니다.");
					findIndex=i;

					
					tempVoca.remove(findIndex);
					flag=true;//리스트에서 찾아서 삭제함
					System.out.println((findIndex+1)+"번째 위치 단어가 정상 삭제 되었습니다.");
				}

			}
			
			if(flag==false) {
				System.out.println("단어를 찾지 못 하였습니다.");
			}
			
		} catch (Exception e) {
			System.out.println("에러");
		}
		
		

	}
	
	
	///////////////////////////////////////////////////////
	
	public void openFile(ArrayList<Voca> FileVoca) {
		
		String eng_temp;
		String kor_temp;
		String line;
		
		try {
			
			
			BufferedReader br = new BufferedReader(new FileReader("c:/my/test_mine.txt"));
			while(true) {
				line = br.readLine();
				if(line ==null)
					break;
				eng_temp=line.substring(3);
				line = br.readLine();
				kor_temp=line.substring(3);
				line = br.readLine();
				FileVoca.add(new Voca(eng_temp,kor_temp));
			}
			
			br.close();
			
		} catch (Exception e) {

			
		System.out.println("아직 단어장이 존재하지 않습니다. 새로 작성하세요.");
		}

	}

	

	
}


