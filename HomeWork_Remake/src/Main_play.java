import java.util.Scanner;

public class Main_play {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		String pointerKey;
		
		Room[][] Map=new Room[4][5];

		DoorCheck Game= new DoorCheck(Map,2,2);  //내위치 (2,2) 삽입
		
		Game.gui(Map);
		
		while(!Game.endCheck) {
			
			System.out.print("키입력  >>>");
			pointerKey=sc.nextLine();
			System.out.println();
			if(pointerKey.equals("w")) {
				Game.moveUp(Map);
				System.out.println("i : "+Game.i +"   j : "+Game.j);
			}
			
			else if(pointerKey.equals("s")) {
				Game.moveDown(Map);
				System.out.println("i : "+Game.i +"   j : "+Game.j);
			}
			else if(pointerKey.equals("a")) {
				Game.moveLeft(Map);
				System.out.println("i : "+Game.i +"   j : "+Game.j);
			}
			else if(pointerKey.equals("d")) {
				Game.moveRight(Map);
				System.out.println("i : "+Game.i +"   j : "+Game.j);
			}
			
			System.out.println();
		}
		
	
	
		
		
		
		
	}
}
