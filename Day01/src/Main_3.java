import org.omg.CORBA.portable.ValueOutputStream;

public class Main_3 {

	
	
	public static void main(String[] args) {
		
		//형변환
		System.out.println("------------------------------------------");
		int num1=100;
		float num2 = 10.9f;
		
		//num1=num2   오류발생;
		num1=(int)num2;
		
		System.out.println(num1);
		//소수 자리 모두 버려짐
		
		num2=(float)num1;
		System.out.println(num2);
		//10을 10.0 (소수)로 표현
		
		
		num1 =5;
		num2= num1;//자동형변환
		System.out.println(num2);
		
		System.out.println("------------------------------------------");
		//
		
		String str = "";
		str= String.valueOf(num1); //int-> String   ..   String.  이면 num1값을 String으로 바꿔준다.    Integer. 이면  num1값을 Integer로 바꾼다.
		System.out.println(str);
		//혹은
		str = num1+"";
		System.out.println(str); //뒤에 큰따옴표 두개를 넣어서 공백자체를 넣으면 가능 . String -> int
		
		
		
		num1=Integer.parseInt(str); //String-> int
		System.out.println(num1);
		
		System.out.println("------------------------------------------");
		
		//
	}
}
