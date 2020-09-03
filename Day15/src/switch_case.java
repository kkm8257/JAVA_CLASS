

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("수학점수를 입력하세요 =>");
		int math = Integer.parseInt(sc.nextLine()); 
		// nextInt 쓰지마그냥. 쓸일 없음 쓰지마셈 무조건 nextLine()으로 써 ㅇㅋ? nextInt()는 정수를 받아오는거고
		//nextLine()은  문자열 한줄을받아오는건데, 둘의 모양이 비슷한데 안에 구조가 달라서
		//nextLine()을 쓰면 엔터까지 인식을하는데 , nextInt()는 엔터를 인식 안하는걸로 알고있음 자세히는 나도모름
		//그니까 그냥 nextLine()써
		
		//근데 nextLine()을 쓰면 질문이 생김
		//아니 math변수는 int를 햇는데 어떻게 문자열로 받아?
		
//		그래서 앞에 달아주는게 Integer.parseInt()  임
//		이게무슨뜻이냐. 그냥 메소드. 즉 그냥 기능임 기능 . 이름이 왜 저러냐고?
//		그냥 기능인데 이해하면댐 저렇게쓴다로
		
//		Integer 이라는  클래스 안에 있는   메소드를 쓸껀데    .  을 찍어서 참고하고
//		그안에 있는 parseInt()  , 이거는 파싱한다는 뜻인데 즉   Int로 파싱! 문자열을 int로 바꾼다는 의미야!!

//		문자열 11과 int 11은 다르다 . 근데 문자열 11을 int 11로 바꿀수있는 기능이라는거야
		
//		참고로 만약에 파싱하려고 했는데 문자열 11 뭐 이런게아니라   "kimkyungmin"이런거를 파싱하면 오류뜰꺼임
		//그것까지는 알필요도없음   지금 알아야할거는
//		문자열을 숫자 int로 바꾸는 방법이
		//Integer.parseInt(  -바꿀 문자열-  )  이다
		//근데 -바꿀문자열- 여기안에다가     스캐너.nextLine()을 입력하면
		//입력받은 문자열을 한번에 바꾸어서 int에 넣어준다.
		

		//int 입력이 끝낫으면 임의로 국어 영어점수는 그냥 정해줄꼐
		
		int kor = 80;
		int eng = 90;
		int tot= kor +eng+math;
		
		
		int avg = tot/3;
		
		//그담에 여기서 니가 String grade를 줫는데
		//코드를 쭉내려가다봐도 너가 grade를 쓴 흔적이없다.
		//왜 쓴건지 ㅇㅇ 생각해봐야해
		
		String grade;
//	      if(avg>= 90)
//	         grade = "수";
//	      else if(avg>=80)
//	         grade = "우";
//	      else if(avg>=70)
//	         grade = "미";
//	      else if(avg>=60)
//	         grade = "양";
//	      else 
//	         grade = "가";
		
		switch (avg/3){
			
			
			case 100 : //300점 만점에 3으로 나누었을 때 100이면 만점이잖어
			case 90 : //3과목 평균 90 인경우
				grade="A";//이게 스위치케이스문의 특징임. case : 100에 들어가도 break문이 없으면
				//쭉 내려옴 break를 만날때까지 ㅇㅋ? 그러면 내가 case : 90에 break를 박으면
				//100이하 고 , 90이상 인 모든 경우를 체크하는거임 즉    90<= (avg/3) <=100
				//이런거지 ㅇㅋ?
				break;
			
		}
		
		
		
	}

}
