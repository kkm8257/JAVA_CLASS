
public class Today_03 {

	public static void main(String[] args) {
		
		
		
		int num = 10;
		System.out.println(num);
		a(num);
		System.out.println(num);
		
		
		int[] num1= {10};
		System.out.println(num1[0]);
		b(num1);
		System.out.println(num1[0]);
		
		
		///////////////////
		//�迭�̳� arraylist ��� �ش�
		System.out.println();
		int[] arr1= {10};
		int[] arr2=arr1;  // arr2�� arr1�� �ּҸ� �����ؼ��� , arr2�� arr1�� �ּҸ� ������ ,�ᱹ arr1�� �����Ǵ� arr2�� �����Ǵ�   ...arr1�� �����ȴ�.
		arr2[0]++;
		System.out.println(arr1[0]);
		
		
		
		
		
	}
	
	static void a(int num) {
		//���� �����ؼ� ���� ��ƹ����°���
		num++;
		System.out.println(num);
		
	}
	
	static void b(int[] num1) {
		//�ٸ����� ��  �迭�� �ּҰ��� �����ؿ��°��̱⶧���� , ��ü�� ������ ��ġ�°��̴�.
		
		num1[0]++;
		System.out.println(num1[0]);
	}
	
	
	
	
}
