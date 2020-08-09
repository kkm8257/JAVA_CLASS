import java.util.Scanner;

public class TempProj {

	public static void main(String[] args) {

		
		int Temp=1;
		
		String StrTemp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------------------------------");
		System.out.println(Integer.toString(Temp)+"번째 입력입니다.");
		System.out.print("문장 입력 : ");
		StrTemp=sc.nextLine();
		System.out.println("입력된 문장 : "+StrTemp);
		System.out.println("-----------------------------------");
		Temp=Temp+1;
		System.out.println(Integer.toString(Temp)+"번째 입력입니다.");
		System.out.print("문장 입력 : ");
		StrTemp=sc.nextLine();
		System.out.println("입력된 문장 : "+StrTemp);
		System.out.println("-----------------------------------");
		
		
		
		
//		String str= String.valueOf(10);
//		System.out.println(str);
//		
//		
//		int alpha;
//		
//		
//		alpha=Integer.valueOf(str);
//		System.out.println(alpha);
//		
//		
		
		
	}

}

