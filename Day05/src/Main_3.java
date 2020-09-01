import java.util.Calendar;

public class Main_3 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;// 자바는 0이 1월이다.
		int day = cal.get(Calendar.DATE);

		int dow = cal.get(Calendar.DAY_OF_WEEK); // 1 이 일요일
		int max = cal.getActualMaximum(Calendar.DATE);

		System.out.println("year : " + year + "   month : " + (month) + "   day : " + day);
		System.out.println(dow);
		System.out.println(max);

		/////
		System.out.println("------------------------------------");
		cal.set(2020, 5, 4);

		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;// 자바는 0이 1월이다.
		day = cal.get(Calendar.DATE);

		System.out.println("year : " + year + "   month : " + (month) + "   day : " + day);
		System.out.println(dow);
		System.out.println(max);

/////////////
		///cal2 선언
		Calendar cal2 = Calendar.getInstance();//오늘날짜
		 cal2.add(Calendar.MONTH, -1);
		 year = cal2.get(Calendar.YEAR);
		 month = cal2.get(Calendar.MONTH) + 1;// 자바는 0이 1월이다.
		 day = cal2.get(Calendar.DATE);
		
		
			System.out.println("year : " + year + "   month : " + (month) + "   day : " + day);
		 
		 
			// add(int field, int amount)를 사용하면 지정한 필드의 값을 원하는 만큼 증가 또는 감소 시킬 수 있기 때문에
			// add메서드를 이용하면 특정 날짜 또는 시간을 기점으로 해서 일정 기간 전후의 날짜와 시간을 알아낼 수 있다.

		
	}
}
