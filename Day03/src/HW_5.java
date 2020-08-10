import java.util.Scanner;

public class HW_5 {

	public static void main(String[] args) {
		
		
		int H=0; //높이    N = 2H -1
		int N=0; //별 갯수
		
		
		int count_L=0;
		int count_R=0;
		
		int draw=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("지정 할 삼각형의 높이(삼각형 세로를 별 갯수로 측정) : ");
		H=Integer.parseInt(sc.nextLine());
		N=2*H-1;
		
		count_L=H-1;
		count_R=H-1;
		
		
		
	for(int i =0; i<H-1;i++) {
		
		
		for(int j=0;j<N;j++) {
			
			
			if((j==count_L)||(j==count_R)) {
				
				System.out.print("*");
				
			}
			else {
				System.out.print(" ");
			}
			
			
			
		}
		System.out.println();
		count_L=count_L-1;
		count_R=count_R+1;
		
		if(i==(H-2)) {
			
			for(int k=0;k<N;k++) {
				System.out.print("*");
				
			}
			
		}
		
		
	}
	
	
		
		
	
		
		
	}
}
