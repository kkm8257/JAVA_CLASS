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
		array[0]="경민";
		array[1]="정모";
		array[2]="원우";
		array[3]="하늘";
		array[4]="상현";
		
		
		Random rd= new Random();
		
		int choiceNum= rd.nextInt(4);
		
		System.out.println("배열의 길이 : "+array.length);
		System.out.println(array[choiceNum]+"(이)가 선택되었습니다.");
		
		System.out.println("\n\n");
		
		System.out.println("배열의 길이 : "+array.length);
		System.out.println("array["+choiceNum+"]의 내용은 "+array[choiceNum]+"입니다.");
		
		
		
		
		
	}

}
