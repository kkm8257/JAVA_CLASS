
import java.util.Random;

public class Main_5_UpCase {

	
	public static void main(String[] args) {
		
		
		//길이가 10인 배열의 각방에 랜덤숫자 20 ~100 까지 넣는다
		//크기가 작은 순서대로 정렬
		
		Random rd= new Random();
		
		int temp=0;
		
		
		
		int[] NotSorted = new int [10];
		
		
		
		for(int i = 0;i<NotSorted.length;i++) {
			
			NotSorted[i]=rd.nextInt(101);
			if((NotSorted[i]<20)) {
				//20미만의 수 거르기
				i--;
				continue;
			}
			
		}
		
		System.out.println("-----오름차순정렬 전-----");
		for(int i =0;i<NotSorted.length;i++) {
			
			System.out.print(NotSorted[i]+" ");
		}
		
		
		
		//오름차순 정렬
		
		for(int i=0;i<NotSorted.length;i++) {
			
			
			
			for(int j=i+1;j<NotSorted.length;j++) {
				
				if(NotSorted[i]>NotSorted[j]) {
					
					temp=NotSorted[j];
					NotSorted[j]=NotSorted[i];
					NotSorted[i]=temp;
					
					
				}
				
			}
			
			
		}
		System.out.println();
		System.out.println("-----오름차순정렬 후-----");
		for(int i =0;i<NotSorted.length;i++) {
			System.out.print(NotSorted[i]+" ");
		}
		
		///////오름차순정렬끝
		
		
		
	}
}
