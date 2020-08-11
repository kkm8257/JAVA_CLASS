import java.util.ArrayList;

public class Main_8 {

	
	public static void main(String[] args) {
		
		
		//arrayLIST는 배열의 단점인 크기 고정 부분을 개선한 것
		
		
		
		//E는 엘리먼트의 약자  ArrayList<E>
		
		
		ArrayList<String> strArr= new ArrayList<>(); //자바 최신버전부터는 뒤에 <>에 안적어도댄다
		ArrayList<Integer> intArr=new ArrayList<>();
		ArrayList<Boolean> boolArr=new ArrayList<>();
		
		
		System.out.println("size : "+strArr.size());  //ArrayList 의 length , 즉 길이
		
		strArr.add("가");
		strArr.add("나");
		strArr.add("다");
		strArr.add("라");

		System.out.println("size : "+strArr.size());  //자동으로 늘어난다.
		
		
		System.out.println(strArr.get(0));  //ArrayList의 인덱스를 통해 값을 확인하는 것 .  get
		System.out.println("----------------------");
		for(int i =0; i<strArr.size();i++) {
			System.out.println(strArr.get(i));
		}
		
		
		
		//만약 특정 위치에 값을 넣고 싶다면?
		
		
		strArr.add(1,"마");
		System.out.println("----------------------");
		for(int i =0; i<strArr.size();i++) {
			System.out.println(strArr.get(i));
		}
		
		//알 수 있는 것은 , add를 특정위치를 지정하고 넣을 경우, 해당 위치에 원래 있던 값이 지워지는게 아니라 뒤로 밀려난다.
		
		
		strArr.set(1, "SET!");
		System.out.println("----------------------");
		for(int i =0; i<strArr.size();i++) {
			System.out.println(strArr.get(i));
		}
		
		
		//set을 넣을 경우, 해당위치 값을 지정된 값으로 바꾸어버림 , add와의 차이
		
		
		strArr.remove(1);
		System.out.println("----------------------");
		for(int i =0; i<strArr.size();i++) {
			System.out.println(strArr.get(i));
		}
		
		//인덱스 1 값을 삭제함과 동시에 공간자체를 없애버림. 즉 ArrayList의 사이즈가 줄어든다.
		
		
//		strArr.clear();
//		System.out.println("----------------------");
//		for(int i =0; i<strArr.size();i++) {
//			System.out.println(strArr.get(i));
//		}
//		
//		System.out.println(strArr.size());
//		//clear는 모든 값을 삭제 함과 동시에 사이즈도 줄어든다.
//		
//		
		
		System.out.println("---------------------");
		System.out.println("다의 위치 : "+strArr.indexOf("다"));
		
		
		
		
	}
}
