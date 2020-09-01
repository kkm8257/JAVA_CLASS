import java.util.Scanner;

public class Main_3_Triangle_With_Space {
public static void main(String[] args) {

	//공백있는
	
	
	Scanner sc= new Scanner(System.in);
	
	
	System.out.print("삼각형의 높이를 입력하세요 >>>");
	
	int H=Integer.parseInt(sc.nextLine());
	int N=2*H-1;
	int count=1;
	
	int temp=H;

	
	for(int i=0;i<H;i++) {

		for(int j= 0; j<N;j++) {
			
			if((j==(temp-1))) {

				for(int k = 0;k<count;k++) {
					
					System.out.print("* ");
				}
			}
			else {
				System.out.print(" ");
			}
		
		}
		System.out.println();		
		temp--;
		count++;
		
	}
	
	
		
}
}
