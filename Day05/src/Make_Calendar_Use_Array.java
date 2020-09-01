import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Make_Calendar_Use_Array {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();// 현재 8월의 1일로 세팅
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> ShowCal = new ArrayList<Integer>() ;
		
		
		while (true) {

			System.out.print("달력을 출력합니다.  조회할 달력의 월을 입력해주세요(123입력시 종료)\n>>>");
			int input_Month = Integer.parseInt(sc.nextLine());

			if (input_Month == 123) { // 종료 구현
				System.out.println("종료");
				break;

			}
			ArrayList<String> day_List = new ArrayList<String>();
			day_List.add("일");
			day_List.add("월");
			day_List.add("화");
			day_List.add("수");
			day_List.add("목");
			day_List.add("금");
			day_List.add("토");

			cal.set(Calendar.MONTH, input_Month-1);
//			////////////////////////////////////////
//			System.out.print(cal.get(Calendar.YEAR) + "년 ");
//			System.out.print((cal.get(Calendar.MONTH) + 1) + "월 달력");
//			////////////////////////////////////////
//			
//			
			
			cal.set(Calendar.DAY_OF_MONTH, 1);
//			int end_of_thisMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

			int firstdayNum = cal.get(Calendar.DAY_OF_WEEK);// 8월 1일 토요일(7값)
			
			
			
			////////////////////////////////////////
			System.out.print(cal.get(Calendar.YEAR) + "년 ");
			System.out.print((cal.get(Calendar.MONTH) + 1) + "월 달력");
			////////////////////////////////////////
			
			
			
			int ex_length = firstdayNum - 1;// 이전달의 마지막주일요일과 이번달 날짜시작의 요일 거리
			
			System.out.println("\n---------------------------------------------");	
			for (int i = 0; i < day_List.size(); i++) { //요일출력
				System.out.print(day_List.get(i) + "          ");
			}
			
			
			cal.add(Calendar.DAY_OF_MONTH, -ex_length-1);

			for (int i = 1; i <= ex_length; i++) {//전월출력
				cal.add(Calendar.DAY_OF_MONTH, 1);
				ShowCal.add(cal.get(Calendar.DAY_OF_MONTH));
//				System.out.print(cal.get(Calendar.DAY_OF_MONTH) + "     ");
				
			}
			cal.set(Calendar.MONTH, cal.get(Calendar.MONTH) + 1);//요번달로 세팅 (+1)
			cal.set(Calendar.DAY_OF_MONTH, 1);//요번달의 1일로 세팅(+1)
			
			for(int i =1;i<=cal.getActualMaximum(Calendar.DAY_OF_MONTH);i++) {
				
				ShowCal.add(i);
				// 요번달 요일 담기
			}
//			
			
			System.out.println("\n---------------------------------------------");	
			for(int i =0; i <ShowCal.size();i++) {//달력출력
				
				if(i%7==0) {
					System.out.println();
				}
				
				if((ShowCal.get(i)>=0)&&(ShowCal.get(i)<10)) {
					
					System.out.print(ShowCal.get(i)+"      ");
					
				}
				else {
					System.out.print(ShowCal.get(i)+"     ");
					
					
				}

				
				
			}
			

			System.out.println("\n---------------------------------------------\n\n");
			
			ShowCal.clear();
		}

	}

}
