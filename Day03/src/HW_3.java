import java.util.Arrays;
import java.util.Random;

public class HW_3 {
	public static void main(String[] args) {

		Random rd = new Random();
		int num=0;
		
		int[] array=new int[6];
		for(int i =0; i< 6;i++) {
			
			System.out.println((i+1)+"��° �ζ� ��÷ ��ȣ�Դϴ�.");
			num=rd.nextInt(100);
			System.out.println("--"+num+"--");
			array[i]=num;
			
		}
		System.out.println("���� �ζ� ��÷ ��ȣ : "+Arrays.toString(array));
		
	}
}
