import java.util.Scanner;

public class Main_4_Triangle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("삼각형의 높이를 입력하세요 >>>");
	
	
	int H =Integer.parseInt(sc.nextLine());
	
	for(int i=0;i<H;i++){
		
		for(int j=0;j<(H-1)-i;j++){
			System.out.print(" "); 
			
			//공백 전진
		}
		
		
		for(int j=0;j<2*i+1;j++){
			System.out.print("*"); 
			//홀수갯수로 출력
		}
		
		System.out.println("");
	}
}
}
