import java.util.Random;

public class Main_1 {

	public static void main(String[] args) {

//		int [] salesScore = new int[12];
		
//		salesScore[0]=1000;
//		salesScore[1]=1200;
//		salesScore[2]=1500;
//		salesScore[3]=500;
//		salesScore[4]=300;
//		salesScore[5]=500;
//		salesScore[6]=700;
//		
//		salesScore[11]=2000;
//		
//		System.out.println(salesScore.length);
//		

		
		String[] array=new String[5];
		array[0]="���";
		array[1]="����";
		array[2]="����";
		array[3]="�ϴ�";
		array[4]="����";
		
		
		Random rd= new Random();
		
		int choiceNum= rd.nextInt(4);
		
		System.out.println("�迭�� ���� : "+array.length);
		System.out.println(array[choiceNum]+"(��)�� ���õǾ����ϴ�.");
		
		System.out.println("\n\n");
		
		System.out.println("�迭�� ���� : "+array.length);
		System.out.println("array["+choiceNum+"]�� ������ "+array[choiceNum]+"�Դϴ�.");
		
		
		
		
		
	}

}
