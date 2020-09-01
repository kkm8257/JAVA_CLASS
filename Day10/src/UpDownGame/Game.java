package UpDownGame;

import java.util.Random;
import java.util.Scanner;

public class Game {
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);

	int my_ans;
	int com_ans;
	int number_range;

	int my_input;
	int com_input;

	int my_min;
	int my_max;
	int com_min;
	int com_max;

	boolean myflag;
	boolean comflag;

	
	int count=1;
//	나와 컴퓨터의 대결
//	숫자범위는 0부터 시작. 한번 지정 해서 범위는 컴터와 동일
//	
//	턴제방식
//	
//	내가말한숫자보다 up이면 다음턴에는 그 숫자+1
//	내가말한숫자보다 down이면 다음턴에는 그 숫자-1
//	
//	나와 컴터의 횟수를 서로 카운트 (어차피 상관없지만 while 돌릴꺼니까)
//	
//	둘중 한명이 맞출 때까지 한다

	public Game() {

		System.out.println("<<<<게임시작>>>>");
		System.out.print("범위를 잡을껍니다. 1부터 몇까지의 숫자를 할것인가요?\n>>>");
		number_range = Integer.parseInt(sc.nextLine());
		my_ans = rd.nextInt(number_range) + 1;
		com_ans = rd.nextInt(number_range) + 1;

		my_min = 1;
		my_max = number_range;
		com_min = 1;
		com_max = number_range;

	}

	public void mycheck() {
		System.out.println("내 범위는 :  " + this.my_min + " ~ " + this.my_max);
		while (true) {

			
			System.out.print("내 차례 ==>  ");
			int my_input = Integer.parseInt(sc.nextLine());
			if (this.my_min > my_input) { // 내 최소값보다 더 작은 값을 입력시
				System.out.println("범위에 맞게 더 큰수를 입력");
				continue;
			}

			else if (this.my_max < my_input) { // 내 최대값보다 더 큰 값을 입력시
				System.out.println("범위에 맞게 더 작은수를 입력");
				continue;
			}

			else if (my_input > this.my_ans) {
				System.out.println("DOWN!");
				this.my_max = my_input-1;
				break;

			} else if (my_input < this.my_ans) {
				System.out.println("UP!");
				this.my_min = my_input+1;
				break;

			} else if (my_input == this.my_ans) {
				System.out.println("정답! 나의 승리!");
				this.myflag = true;
				break;
			}
		}

	}

	public void comcheck() {
		System.out.println("컴퓨터의 범위는 :  " + this.com_min + " ~ " + this.com_max); 
		System.out.print("컴퓨터 차례 ==>  ");

		while (true) {
			int com_input = rd.nextInt(this.com_max) + 1;
			
			if((this.com_min > com_input)||(this.com_max < com_input) ) {
				
				continue;
			}
			

			else if (com_input > this.com_ans) {
				System.out.println(com_input);
				System.out.println("DOWN!");
				this.com_max = com_input-1;
				break;
			} else if (com_input < this.com_ans) {
				System.out.println(com_input);
				System.out.println("UP!");
				this.com_min = com_input+1;
				break;
			} else if (com_input == this.com_ans) {
				System.out.println(com_input);
				System.out.println("컴퓨터가 정답을 맞추었습니다!  컴퓨터의 승리");
				this.comflag = true;
				break;
			}
		}

	}

	public static void main(String[] args) {

		Game gm = new Game();
		
		while (true) {
			System.out.println("-------------------"+gm.count+"차 시도"+"-------------------");
			gm.mycheck();
			if (gm.myflag == true)
				break;
			gm.comcheck();
			if (gm.comflag == true)
				break;
		}

	}

}
