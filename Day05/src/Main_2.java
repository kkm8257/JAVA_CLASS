import java.text.SimpleDateFormat;
import java.util.Date;

public class Main_2 {

	public static void main(String[] args) {

		Date date = new Date();

		System.out.println(date.toString());

		SimpleDateFormat sdf_1 = new SimpleDateFormat("yy�� MM�� dd�� E����");

		System.out.println(sdf_1.format(date));

		SimpleDateFormat sdf_2 = new SimpleDateFormat("HH�� mm�� ss��");

		System.out.println(sdf_2.format(date));

		SimpleDateFormat sdf_3 = new SimpleDateFormat("h�� mm�� ss��");

		System.out.println(sdf_3.format(date));


		
		

	}

}
