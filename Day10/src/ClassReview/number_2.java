package ClassReview;

import java.util.ArrayList;

public class number_2 {
	
	//2. 위의 1번의 클래스(이하 클래스 A)를 저장할 수 있는 어레이 리스트를 만들기


	public static void main(String[] args) {
		
		
		ArrayList <number_1> array = new ArrayList<>();
		
		number_1 nm1_1= new number_1(10,10,"+");
		number_1 nm1_2= new number_1(20,20,"");
		
		array.add(nm1_1);
		array.add(nm1_2);
		
	}

}
