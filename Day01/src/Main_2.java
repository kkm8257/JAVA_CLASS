
public class Main_2 {

	public static void main(String[] args) {

		
		int num1= 10;
		int num2= 5;		
		int num3 = num1-num2;
		
		System.out.println("------------------------------------------------------------");
		System.out.println("두수의 합 : "+(num1+num2)); 
		System.out.println("두수의 차 : "+(num1-num2));
		System.out.println("두수의 곱 : "+(num1*num2));
		System.out.println("두수를 나눈다 : "+(num1/num2));
		System.out.println("------------------------------------------------------------");
		
		System.out.println("두수의 합 : "+num1+num2);
		//println 에서 스트링타입과 합쳐질 경우, 형변환이 일어난다. 즉 num1 과 num2는 문자열로 형변환이 일어남. 
		
		System.out.println("두수의 합 : "+(num1+num2));
		//소괄호로 묶어주면 된다.
		
		
		
	}

}
