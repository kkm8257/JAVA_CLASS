import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Calendar_2 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();// 현재 8월의 1일로 세팅
		Scanner sc = new Scanner(System.in);

		System.out.print("월을 입력해주세요(종료를 원할 시 exit 입력) \n>>>");
		String input = sc.nextLine();

		if (input.equals("exit")) {
			System.out.println("종료");
		}

		String MovePoint; // 1은 전월로 2는 다음월로 이동하는 기능을 위한 변수

		
		cal.set(Calendar.MONTH, Integer.parseInt(input) - 1); // MONTH는 0부터시작 , 0이 1월

		while ((true) && !(input.equals("exit"))) {

			ArrayList<Integer> ShowCal = new ArrayList<Integer>();
			ArrayList<String> day_List = new ArrayList<String>();

			day_List.add("일");
			day_List.add("월");
			day_List.add("화");
			day_List.add("수");
			day_List.add("목");
			day_List.add("금");
			day_List.add("토");


			cal.set(Calendar.DAY_OF_MONTH, 1); // 지금은 위에 MONTH를 7로 박아놨으니, 8월임. 그리고 이문장을 통해 1일로세팅. 지금 cal은 8월 1일

			System.out.println("월 : " + (cal.get(Calendar.MONTH) + 1)); // 월을 출력할 때는 1일
			// 더해서 출력
			// System.out.println("일 : " + cal.get(Calendar.DAY_OF_MONTH));// 일은 그대로 출력

			// cal.set(Calendar.MONTH, 6);// 전달로 한번이동 ex_LastDay 찾기위함, 8월1일에서 월을 수정하여 7월1일로
			// 변경됨 add로 수정할것

			// System.out.println(cal.get(Calendar.MONTH)); (확인)
			cal.add(Calendar.MONTH, -1);
			// System.out.println(cal.get(Calendar.MONTH)); (확인)
			int ex_LastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 전달의 마지막날
			// System.out.println("전달의 마지막 날 : " + ex_LastDay);

			//////
			cal.add(Calendar.MONTH, 1);// 다시 이번달로 복귀해야함, 저번달에 관한 정보는 다얻었기 때문. add로 수정할것
			//////

			int this_LastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 이번달의 마지막 일수, 31일이거나 30일이거나 29일이거나
			int position_this = cal.get(Calendar.DAY_OF_WEEK); // 이번달 첫날의 요일 위치 . 일요일이 1. 지금은 8월 1일로 세팅되어있으니까 8월1일은 토요일

//		System.out.println(position_this);  //8월기준이면 1일은 토요일, 7이 나온다  (확인)

			int range_this_ex = position_this - 1; // 이 변수는 저번달 (여기기준 7월) 의 마지막날인 26일(일요일)과 8월 1일의 거리차이를 말함. 6이나오겠지.
//		System.out.println(position_this);  (확인)
//		System.out.println(range_this_ex);  (확인)
//		for (int i = range_this_ex - 1; i >= 0; i--) {
//
//			System.out.println(ex_LastDay - i); // 26~31 , 즉 전월의 날짜들이 나오는거 확인. for문은 그냥 알맞게 수정해주면 댐. 딱히 규칙은 없음. 출력해보면서
//												// 때려맞춤
//
//		}

			for (int i = range_this_ex - 1; i >= 0; i--) {
				// ArrayList에 전월 내용 삽입

				ShowCal.add(ex_LastDay - i);

			}

			for (int i = 1; i <= this_LastDay; i++) {
				// ArrayList에 이번달 내용 삽입
				ShowCal.add(i);
			}

			////////
			// 이제 남은건 다음달 정보 넣기
			////////

			cal.add(Calendar.MONTH, 1);// 다음달로 이동 add로 수정할것

			int position_next = cal.get(Calendar.DAY_OF_WEEK); // 다음달 1일의 요일 위치.

//		System.out.println(position_next); //8에서 빼면 됨. 공식이아니라 , 규칙을 찾아봄.

			// position_next값이 3일때, 실제로 넣어야하는 요일수는 5 . 2일때 실제로 넣어야하는 요일수는 6. 1일때 실제로 넣어야하는
			// 요일수는 7 . 그러면 8에서 position값을 빼주면 넣어야할 요일 수가 나옴

			// System.out.println(position_next);
			for (int i = 1; i <= 8 - position_next; i++) {// 다음달 내용
				ShowCal.add(i);
			}
			cal.add(Calendar.MONTH, -1);// 다시 이번달로 이동 add로 수정할것

			System.out.println(cal.get(Calendar.YEAR) + "년  " + (cal.get(Calendar.MONTH) + 1) + "월");

			System.out.println("\n---------------------------------------------");
			for (int i = 0; i < day_List.size(); i++) { // 요일출력
				System.out.print(day_List.get(i) + "          ");
			}

			System.out.println("\n---------------------------------------------");

			for (int i = 0; i < ShowCal.size(); i++) {// 달력출력

				if (i % 7 == 0) { // 일요일은 1. 그니까 7로나누어서 딱떨어지면, 줄을 바꿔버림. 0 1 2 3 4 5 6 은 첫째주 일~토 이고. 7이되는순간 그 다음주
									// 일요일이니까. 이것도 그냥 때려 맞춘거
					System.out.println();
				}

				if ((ShowCal.get(i) >= 0) && (ShowCal.get(i) < 10)) { // 값이 한자리면 공백을 한 칸 더 넣어줘서 조금 이쁘게 나오게끔 . 큰 의미는 없음

					System.out.print(ShowCal.get(i) + "      ");

				} else {// 두자리수 이면 그냥 출력
					System.out.print(ShowCal.get(i) + "     ");

				}

			}
			System.out.println("\n---------------------------------------------");

			System.out.print("<1> 을 누르면 전월로 이동 , <2>를 누르면 다음 달로 이동 (종료를 원할 시 exit 입력) \n>>>");
			MovePoint = sc.nextLine();

			if (MovePoint.equals("exit")) {
				System.out.println("종료");
				break;
			}

			else if (Integer.parseInt(MovePoint) == 1) {

				// 전월이동
				cal.add(Calendar.MONTH, -1); 

			} else if (Integer.parseInt(MovePoint)==2) {
				cal.add(Calendar.MONTH, 1);

			}

		}
	}
}
