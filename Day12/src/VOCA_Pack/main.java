package VOCA_Pack;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		
		//패키지 메소드 클래스 파일저장을 활용해서
		//영어 단어장만들기
	    //재실행후에도 추가 삭제 수정 가능
		//데이터 유지
		
		
		//영어 뜻 한글입력시 혹은 한글입력시 콘솔에 마우스를 한번 클릭해서  >>>위치옆에 이쁘게 입력되게끔 눌러줄것
		
		Scanner sc= new Scanner(System.in);
		String numinput;

		
		ArrayList<Voca> myVoca = new ArrayList<>();
		Control ctr = new Control();
		
		ctr.openFile(myVoca);
//		
		
		while(true) {
			System.out.println("---------------입력 ---------------");
			System.out.println("1. 단어 등록     2. 단어장리스트 출력    3. 단어 검색 후 수정      4. 단어 삭제     5. 프로그램종료");
			numinput=sc.nextLine();
			
			if(numinput.equals("1")) {
				ctr.newWord(myVoca);
				ctr.create(myVoca);
			}
			else if(numinput.equals("2")) {
				ctr.read(myVoca);
			}
			else if(numinput.equals("3")) {
				ctr.update(myVoca);
				ctr.create(myVoca);
			}
			else if(numinput.equals("4")) {
				ctr.delete(myVoca);
				ctr.create(myVoca);
			}
			else if(numinput.equals("5")) {
				System.exit(0);
			}
			
			
		}
		
		

	}
	
	
	

}
