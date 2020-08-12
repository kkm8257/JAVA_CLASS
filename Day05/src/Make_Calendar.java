import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Make_Calendar {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		
		cal.set(Calendar.MONTH,7);//8월    //set 대신에 add를 통해서 전월 다음월 자동 설정 할것
		cal.set(Calendar.DAY_OF_MONTH, 1); // 해당 월의 1일로 설정
		int firstdayNum=cal.get(Calendar.DAY_OF_WEEK);
		
		
		int date_Length=firstdayNum-1;// 거리 
		int end_of_ExMonth;
		System.out.println("8월의 첫 요일 번호  (토요일) : "+firstdayNum);
		System.out.println("8월 첫날과 7월마지막 주의 거리 : "+date_Length); //거리 구함
		
		cal.set(Calendar.MONDAY,6);//7월
		end_of_ExMonth=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("저번달의 마지막 날 : "+cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		System.out.println("--------------------");
		
//		System.out.println("\n\n"+weekCount);
		
		
		//7월달은 31일까지
		for(int i =date_Length; i>0;i--) {
			

			System.out.print((end_of_ExMonth+1-i)+"  ");
		}
		
		//이번달로 이동
		cal.set(Calendar.MONTH,7);
		int thisDay=cal.getActualMaximum(Calendar.DAY_OF_MONTH);//이번달 마지막
		
		int weekCount=cal.get(Calendar.WEEK_OF_MONTH);//지금 날짜기준 요번달의 주 구하기
		int change=2;//줄바꿈 체크
		for(int i =1; i <=thisDay;i++) {
			cal.set(Calendar.DAY_OF_MONTH, i);
			weekCount=cal.get(Calendar.WEEK_OF_MONTH);
			
//			System.out.println("week : "+weekCount  + "change : "+ change);
			if(weekCount==change) {
				change++;
				System.out.println();
				i--;
			}
			else {
				System.out.print(i+"  ");
			}
			
			
		}
		
		
		
		///다음달 계산
		
		
		
		
		
		
		
	}
}
