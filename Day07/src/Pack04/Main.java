package Pack04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<ProblemSample> DataSet = new ArrayList<>(); // ProblemSample형 ArrayList생성

		String pro = "";
		String e1;
		String e2;
		String e3;
		String e4;
		String Ans;
		
		String input="";

//		System.out.println(sp.Problem);
		
		
		
		
		int count=0;
/////////////////
		pro = "1+1 = ?";
		e1 = "1";
		e2 = "2";
		e3 = "3";
		e4 = "4";
		Ans = "2";

		DataSet.add(new ProblemSample(pro, e1, e2, e3, e4, Ans));
////////////////

/////////////////
		pro = "10+10 = ?";
		e1 = "5";
		e2 = "10";
		e3 = "15";
		e4 = "20";
		Ans = "4";

		DataSet.add(new ProblemSample(pro, e1, e2, e3, e4, Ans));
////////////////

/////////////////
		pro = "30+30 = ?";
		e1 = "40";
		e2 = "50";
		e3 = "60";
		e4 = "70";
		Ans = "3";

		DataSet.add(new ProblemSample(pro, e1, e2, e3, e4, Ans));
////////////////
		
		for (int i = 0; i < DataSet.size(); i++) {

			System.out.println(DataSet.get(i).Problem);
			System.out.println("("+(count+1)+")  "+DataSet.get(i).Ex1+"     ("+(count+2)+")  "+DataSet.get(i).Ex2+"     ("+(count+3)+")  "+DataSet.get(i).Ex3+"     ("+(count+4)+")  "+DataSet.get(i).Ex4);
			input=sc.nextLine();
			
			if(input.equals(DataSet.get(i).Ans)) {
				
				System.out.println("정답입니다.");
				
			}
			else {
				System.out.println("오답입니다.");
			}
			
			
		}

	}

}
