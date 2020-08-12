import java.text.SimpleDateFormat;
import java.util.Date;

public class Main_2 {

	public static void main(String[] args) {

		Date date = new Date();

		System.out.println(date.toString());

		SimpleDateFormat sdf_1 = new SimpleDateFormat("yy년 MM월 dd일 E요일");

		System.out.println(sdf_1.format(date));

		SimpleDateFormat sdf_2 = new SimpleDateFormat("HH시 mm분 ss초");

		System.out.println(sdf_2.format(date));

		SimpleDateFormat sdf_3 = new SimpleDateFormat("h시 mm분 ss초");

		System.out.println(sdf_3.format(date));


		
		

	}

}
