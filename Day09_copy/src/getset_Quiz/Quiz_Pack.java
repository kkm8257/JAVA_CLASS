package getset_Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_Pack {
	
	
	ArrayList<Quiz_Sample> deck;
	int count;
	
	Scanner sc= new Scanner(System.in);
	String input;
	
	
	
	/////////////
	public Quiz_Pack() {

		deck = new ArrayList<>();
	}
	
	
	//////////////
	
	

	public void makeQuiz() {

		deck.add(new Quiz_Sample("1 + 1 = ?","2","3","4","5","2"));
		deck.add(new Quiz_Sample("�����п��� ��ġ��?","����","�ŵ���","����","��õ","����"));
		deck.add(new Quiz_Sample("���� = ?","turtle","lion","tiger","computer","lion"));
		deck.add(new Quiz_Sample("���� ??? ������ ������ϰ��ִ�","��γ�","���γ��ξ�","�ڷγ�","�̷縶","�ڷγ�"));
	
	}
	
	public void showQuiz() {
		this.count= 1;
		
		
		
		
		for(int i =0; i<deck.size();i++) {
			
			System.out.println((i+1) + "�� ����  : "+deck.get(i).getProblem());
			
			System.out.print("("+count+")  "+deck.get(i).getExample_1()+"   ("+(count+1)+")  "+deck.get(i).getExample_2()+"   ("+(count+2)+")  "+deck.get(i).getExample_3()+"   ("+(count+3)+")  "+deck.get(i).getExample_4());
			System.out.print("\n�Է� >>>");
			input=sc.nextLine();
			System.out.println();
			if(input.equals(deck.get(i).getAns())) {
				System.out.println("�����Դϴ�.");
			}
			else {
				System.out.println("\n");
			}
		
			
		}
	}
}
