import java.util.Scanner;

public class Main_3 {

	public static void main(String[] args) {
		
		float num_1;
		float num_2;
		
		float result;

		String str;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("ù��° ������ �Է����ּ���.");
		num_1=Integer.parseInt(sc.nextLine());
		
		System.out.println("�ι�° ������ �Է����ּ���.");
		num_2=Integer.parseInt(sc.nextLine());
		
		System.out.println("��Ģ�����ȣ�� �Է����ּ���.");
		str=sc.nextLine();
		
		if(str.equals("+")) {
			
			result=num_1+num_2;
			
			System.out.println((int)num_1+" + "+(int)num_2+" = "+ (int)result);
		}
		else if(str.equals("-")) {
			result=num_1-num_2;
			System.out.println((int)num_1+" - "+(int)num_2+" = "+ (int)result);
		}
	
		
		else if(str.equals("*")){
			
			result=num_1*num_2;
			System.out.println((int)num_1+" * "+(int)num_2+" = "+ (int)result);
		}
		else {
			result=num_1/num_2;
			System.out.println((int)num_1+" / "+(int)num_2+" = "+ (int)result);
		}
	
		
	}
	
	
}
