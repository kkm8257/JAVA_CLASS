import java.util.Scanner;

public class DoorCheck {

	//////////////////
	Scanner sc = new Scanner(System.in);
	int i;
	int j;

	boolean endCheck;

	boolean CardKey_1;
	boolean CardKey_2;

	boolean noAgain_A;
	boolean noAgain_B;

	//////////////////

	public DoorCheck(Room[][] Map, int a, int b) {

		//////////////////
		CardKey_1 = false;
		CardKey_2 = false;
		noAgain_A = false;
		noAgain_B = false;
		endCheck = false;
		//////////////////
		// 맵크기 설정

		for (int i = 0; i < Map.length; i++) {

			for (int j = 0; j < Map[i].length; j++) {
				// map안에 room 넣기
				Map[i][j] = new Room();

			}

		}
		/////////
		Map[a][b].iamHere = true;
		this.i = a;
		this.j = b;
		/////////

		Map[0][0].right = 1;
		//
		Map[0][1].right = 1;
		Map[0][1].left = 1;
		//
		Map[0][2].right = 1;
		Map[0][2].left = 1;
		Map[0][2].down = 1;
		//
		Map[0][3].right = 1;
		Map[0][3].left = 1;

		//
		Map[0][4].left = 1;
		//
		Map[1][2].up = 1;
		Map[1][2].down = 1;
		//
		// B방
		Map[2][0].down = 2;
		//
		Map[2][2].up = 1;
		Map[2][2].down = 1;
		Map[2][2].right = 1;
		//
		Map[2][3].left = 1;
		//
		Map[3][2].up = 1;
		Map[3][2].left = 1;
		Map[3][2].right = 1;
		//
		Map[3][1].left = 1;
		Map[3][1].right = 1;
		//
		Map[3][0].right = 1;
		Map[3][0].up = 2; // 열쇠유무 확인필요
		//

		//
		Map[3][3].right = 1;
		Map[3][3].left = 1;
		//
		Map[3][4].left = 1;
		Map[3][4].up = 3; // 열쇠유무 확인필요
		//
		// F방
		Map[2][4].down = 3;
		//
	}

	public void gui(Room[][] Map) {
		check_A_Point();

		for (int i = 0; i < Map.length; i++) {
			for (int j = 0; j < Map[i].length; j++) {
				///////// 위치 출력
				if (Map[i][j].iamHere == true) {

					System.out.print("[O]"); // 3칸
				} else {
					System.out.print("[ ]"); // 3칸
				}
				/////////

				///////// 좌우 화살표 출력부분
				if (((Map[i][j].right == 1) && (Map[i][j + 1].left == 1)) && (j != Map[i].length - 1)) {

					System.out.print(" ↔ "); // 3칸

				} else {
					System.out.print("   ");
				}
				/////////
			}
			System.out.println();

			// 바로 밑부분은 상하 화살표 출력부분 ↕ 부분 출력만들기
			int count = 0;
			int k = 0;
			for (int j = 0; j < Map[i].length; j++) {

				if (((Map[i][j].down == 1) && (Map[i + 1][j].up == 1)) && (i != Map[i].length)) {
					for (k = 1 + count; k <= j * 6 + 1; k++) {
						System.out.print(" ");
						count = (j * 6) + 2; // count변수를 이용해서 , for으로 생기는 중복 적인 띄어쓰기 제거 .j값이 커진만큼 k값의 시작을 더 크게 만듬
					}

					System.out.print("↕");
				}

			}

			System.out.println();
		}

	}

	public void moveUp(Room[][] Map) {

		// 1번 카드키 유무인경우 확인
		if ((Map[this.i][this.j].up == 1)) {//일반문
			Map[this.i][this.j].iamHere = false;
			this.i = i - 1;
			Map[this.i][this.j].iamHere = true;
		} else if ((Map[this.i][this.j].up == 2)) { // 빨간문
			System.out.println("??");
			if (CardKey_1 == true) {
				Map[this.i][this.j].iamHere = false;
				this.i = i - 1;
				Map[this.i][this.j].iamHere = true;
				CardKey_2 = true;
				System.out.println("<<<<    2번 열쇠가 획득    >>>>");
			} else {
				System.out.println("<<<<    1번 열쇠가 없습니다    >>>>");
			}

		} else if (Map[this.i][this.j].up == 3) {// 파란문
			if (this.CardKey_2 == true) {
				Map[this.i][this.j].iamHere = false;
				this.i = i - 1;
				Map[this.i][this.j].iamHere = true;
				check_F_Point();

			} else {
				System.out.println("<<<<    2번 열쇠가 없습니다    >>>>");
			}
		}

		else if ((this.i >= 1) && ((Map[this.i][this.j].up == 1) && (Map[this.i - 1][this.j].down == 1))) {
			// 현재줄과 윗줄의 int 값을 비교해서하되(일반문) i=1 까지인경우
			Map[this.i][this.j].iamHere = false;
			this.i = i - 1;
			Map[this.i][this.j].iamHere = true;

		} else {

			System.out.println("움직일수없습니다.");
		}

		gui(Map);

	}

	public void moveDown(Room[][] Map) {

		// 현재줄과 바로 밑줄의 int값 비교 단 , i는 Map.length -2 까지만

		if (((Map[this.i][this.j].down == 1) && (Map[this.i + 1][this.j].up == 1)) && (this.i <= Map.length)) {

			Map[this.i][this.j].iamHere = false;
			this.i = i + 1;
			Map[this.i][this.j].iamHere = true;

		}
		else if((CardKey_2==true)&&(Map[this.i][this.j].down == 2) && (Map[this.i + 1][this.j].up == 2))   {
			//빨간문을 왓다갔다 할때
			Map[this.i][this.j].iamHere = false;
			this.i = i + 1;
			Map[this.i][this.j].iamHere = true;
		}

		else {

			System.out.println("움직일수없습니다.");
		}

		gui(Map);

	}

	public void moveLeft(Room[][] Map) {

		if (this.j == 0) {
			// j=0인경우
			System.out.println("움직일수없습니다.");
		} else if (((Map[this.i][this.j].left == 1) && (Map[this.i][this.j - 1].right == 1)) && (this.j >= 1)) {
			// 바로 왼쪽 값과 int을 비교하되 , j는 1보다 커야한다
			Map[this.i][this.j].iamHere = false;
			this.j = j - 1;
			Map[this.i][this.j].iamHere = true;
		} else {

			System.out.println("움직일수없습니다.");
		}

		gui(Map);

	}

	public void moveRight(Room[][] Map) {

		if (this.j == Map[this.i].length - 1) {
			// j=4 일때 못감
			System.out.println("움직일수없습니다.");
		} else if (((Map[this.i][this.j].right == 1) && (Map[this.i][this.j + 1].left == 1))
				&& (this.j <= Map[this.i].length - 2)) {
			// 바로 오른쪽값과 int값을 비교하되 , j는 Map[this.i].length -2 까지만 가능

			Map[this.i][this.j].iamHere = false;
			this.j = j + 1;
			Map[this.i][this.j].iamHere = true;
		} else {

			System.out.println("움직일수없습니다.");
		}

		gui(Map);

	}

	public void check_A_Point() {

		Quiz_sam qs = new Quiz_sam("2 + 2 = ?", " 1 ", " 2 ", " 3 ", " 4 ", "4"); // 문제생성

		int temp_i = this.i;
		int temp_j = this.j;

		if (((temp_i == 0) && (temp_j == 4)) && (this.noAgain_A == false)) { // (0,4)위치에 퀴즈
			// A방 도착시
			System.out.println("--------------------------------- A지점 도착 ---------------------------------");
			System.out.println("\n<<<<    퀴즈시작~!    >>>>\n");
			System.out.println("\n준비가 완료되면 yes를 입력해주세요");
			String temp = sc.nextLine();

			if (temp.equals("yes")) {
				System.out.println("\n\n");
				if (qs.ShowQuiz()) {
					System.out.println("<<<<   1번열쇠획득    >>>>");
					this.CardKey_1 = true; // 열쇠 1번 획득
					this.noAgain_A = true;
				}

			} else {
				System.out.println("오답입니다.");
			}

		}

	}

	public void check_B_Point() {

		if (this.noAgain_B == false) {
			System.out.println("<<<<   2번열쇠획득    >>>>");
			CardKey_2 = true;
			this.noAgain_B = true;

		}

	}

	public void check_F_Point() {

		System.out.println("<<<<    게임 종료 !    >>>>");
		this.endCheck = true;
	}

}
