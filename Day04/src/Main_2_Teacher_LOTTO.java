import java.util.Random;

public class Main_2_Teacher_LOTTO {
	public static void main(String[] args) {


		Random rd = new Random();

		int num = 0;
		
		int[] lotto = new int[6];
		
		boolean[] check = new boolean[46];
		
		
		
		for(int i =0;i< lotto.length;i++) {
			
			num=rd.nextInt(46);
			
			if(check[num]==false) {
				lotto[i]=num;
				check[num]=true;
			}
			else {
				
				i--;
				
			}
			
			
		}

		for(int j =0; j<lotto.length;j++) {
			
			System.out.print(lotto[j]+" ");
		}
	
	}
}
