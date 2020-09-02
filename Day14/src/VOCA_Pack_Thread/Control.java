package VOCA_Pack_Thread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Control {

	int memoSize = 0;
	int count = 0;
	int count_problem = 0;

	int ranInt;
	int attPower;
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	

	SharePart share = new SharePart();
	
	
	
	public void init(Player A,Player B,ArrayList<Voca> tempVoca) {
		
		
		A.share=share;
		B.share=share;
		
		A.start();
		B.start();
		
		
		while(true) {
			
			Player attP;
			Player defP;
			
			
			//공격자 설정
			if(share.idx%2==0) {
				
				attP=A;
				A.check=true;
				defP=B;

				B.check=false;
			}
			else {
				attP=B;
				B.check=true;
				defP=A;

				A.check=false;
			}
			
			quizTime(tempVoca,attP,defP);

			share.idx++;
	
		}
		
		
		
		
	}
	
	
	public void quizTime(ArrayList<Voca> tempVoca,Player attP,Player defP) {
		attPower=rd.nextInt(20)+1;
		String ans;
		System.out.println("----퀴즈 풀기----");
		ranInt=rd.nextInt(tempVoca.size());
		System.out.println(tempVoca.get(ranInt).getKor()+"를 영어로?");
		ans=sc.nextLine();
		if(ans.equals(tempVoca.get(ranInt).getEng())) {
			System.out.println("------공격성공!------");
			System.out.println(attP.name+"의 공격!  " + attPower+"의 피해를 입혔다.\n");
			defP.hp-=attPower;
			System.out.println(attP.name+"의 남은 체력 : "+attP.hp);
			System.out.println(defP.name+"의 남은 체력 : "+defP.hp);
			
			
		}
		else {
			
			System.out.println("------공격실패!------");
			defP.hp+=20;
			System.out.println(attP.name+"의 남은 체력 : "+attP.hp);
			System.out.println(defP.name+"의 남은 체력 : "+defP.hp);
		}
		
		
		
	}

	public void read(ArrayList<Voca> tempVoca) {
		// 모두 출력
		for (int i = 0; i < tempVoca.size(); i++) {
			System.out.println("-----" + (i + 1) + "번 단어" + "-----");
			System.out.println("▷   : " + tempVoca.get(i).getEng());
			System.out.println("▶   : " + tempVoca.get(i).getKor());
			System.out.println();
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

			System.out.println(e);
		}

	}

}
