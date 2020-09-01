import java.util.Scanner;

public class Main_2 {
	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);
		
		System.out.println("1부터 100사이의 수를 입력해보세요. ");
		int Temp = Integer.parseInt(sc.nextLine());
		
		if(Temp<=0) {
			System.out.println("0이하의 수는 입력하지마세요.");
		}
		
		else if(Temp<10) {
			System.out.println("Temp 는 10미만이다.");
		}
		else if(Temp<40&&Temp>=10) {
			
			System.out.println("Temp는 10이상 40미만이다.");
		}
		else if(Temp<80 && Temp>=40) {
			System.out.println("Temp는 40이상 80미만이다.");
		}
		else if(Temp<=100 && Temp >=80){
			
			System.out.println("Temp는 80이상 100이하이다.");
		}
		else {
			
			System.out.println("조건 대로 입력하지 않은 수 입니다.");
		}
	
	}
}
