
import java.util.Random;

public class Main_5_UpCase {

	
	public static void main(String[] args) {
		
		
		//���̰� 10�� �迭�� ���濡 �������� 20 ~100 ���� �ִ´�
		//ũ�Ⱑ ���� ������� ����
		
		Random rd= new Random();
		
		int temp=0;
		
		
		
		int[] NotSorted = new int [10];
		
		
		
		for(int i = 0;i<NotSorted.length;i++) {
			
			NotSorted[i]=rd.nextInt(101);
			if((NotSorted[i]<20)) {
				//20�̸��� �� �Ÿ���
				i--;
				continue;
			}
			
		}
		
		System.out.println("-----������������ ��-----");
		for(int i =0;i<NotSorted.length;i++) {
			
			System.out.print(NotSorted[i]+" ");
		}
		
		
		
		//�������� ����
		
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
		System.out.println("-----������������ ��-----");
		for(int i =0;i<NotSorted.length;i++) {
			System.out.print(NotSorted[i]+" ");
		}
		
		///////�����������ĳ�
		
		
		
	}
}
