import org.omg.CORBA.portable.ValueOutputStream;

public class Main_3 {

	
	
	public static void main(String[] args) {
		
		//����ȯ
		System.out.println("------------------------------------------");
		int num1=100;
		float num2 = 10.9f;
		
		//num1=num2   �����߻�;
		num1=(int)num2;
		
		System.out.println(num1);
		//�Ҽ� �ڸ� ��� ������
		
		num2=(float)num1;
		System.out.println(num2);
		//10�� 10.0 (�Ҽ�)�� ǥ��
		
		
		num1 =5;
		num2= num1;//�ڵ�����ȯ
		System.out.println(num2);
		
		System.out.println("------------------------------------------");
		//
		
		String str = "";
		str= String.valueOf(num1); //int-> String   ..   String.  �̸� num1���� String���� �ٲ��ش�.    Integer. �̸�  num1���� Integer�� �ٲ۴�.
		System.out.println(str);
		//Ȥ��
		str = num1+"";
		System.out.println(str); //�ڿ� ū����ǥ �ΰ��� �־ ������ü�� ������ ���� . String -> int
		
		
		
		num1=Integer.parseInt(str); //String-> int
		System.out.println(num1);
		
		System.out.println("------------------------------------------");
		
		//
	}
}
