import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Random rd= new Random();
		
		int check;
		
		int my;
		int com;
		
		String[] str=new String[3];
		str[0]="가위";
		str[1]="바위";
		str[2]="보";
		
		
		
		
		System.out.println("------------가위 바위 보 게임------------");
		
		
		
		while(true) {
			
			System.out.println("1) "+str[0]+ "  2) "+str[1]+"  3) "+str[2]+"  4) 게임 끝내기");
			System.out.print("해당 보기를 입력하세요.>>>");
			check=Integer.parseInt(sc.nextLine());
			
			
			my=check-1;
			com=rd.nextInt(3);
			
			
			if(check==4) {
				
				System.out.println("종료");
				break;
				
			}
			
			else if(  ((my==0)&&(com==0))||((my==1)&&(com==1))||((my==2)&&(com==2))) {
				//비긴경우
				System.out.println("비겼습니다~ 다시! ");
				continue;
				
			}
			
			//가위와 바위의 싸움
			else if(my==0&&com==1)   {
				System.out.println("유저 : 가위");
				System.out.println("컴 : 바위");
				System.out.println("컴의 승리");
				
			}
			else if(my==1&&com==0)   {
				System.out.println("유저 : 바위");
				System.out.println("컴 : 가위");
				System.out.println("유저의 승리");
				
			}
			
			else if(my==0&&com==2)   {
				System.out.println("유저 : 가위");
				System.out.println("컴 : 보");
				System.out.println("유저의 승리");
				
			}
			
			else if(my==2&&com==0)   {
				System.out.println("유저 : 보");
				System.out.println("컴 : 가위");
				System.out.println("컴의 승리");
				
			}
			
			
			else if(my==1&&com==2)   {
				System.out.println("유저 : 바위");
				System.out.println("컴 : 보");
				System.out.println("컴의 승리");
				
			}
			else if(my==2&&com==1)   {
				System.out.println("유저 : 보");
				System.out.println("컴 : 바위");
				System.out.println("유저의 승리");
				
			}
			
		
		}
		
		
		System.out.println("------------------------------------");
		

		
	}
	
}
