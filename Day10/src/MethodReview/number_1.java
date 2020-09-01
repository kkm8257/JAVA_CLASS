package MethodReview;

public class number_1 {

	//for문 2개를 사용해서 2단 부터 9단 까지 구구단을 출력하는 메소드 만들기
	
	
	public static void guguAll() {
		
		for(int i =2; i<10;i++) {
			System.out.println("<<<<  "+i+"단 출력    >>>>");
			
			
			for(int j =1;j<10;j++) {
				System.out.println(i+ " x "+j+" = "+(i*j));
			}
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		guguAll();
	
	}

}
