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
		// ��ũ�� ����

		for (int i = 0; i < Map.length; i++) {

			for (int j = 0; j < Map[i].length; j++) {
				// map�ȿ� room �ֱ�
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
		// B��
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
		Map[3][0].up = 2; // �������� Ȯ���ʿ�
		//

		//
		Map[3][3].right = 1;
		Map[3][3].left = 1;
		//
		Map[3][4].left = 1;
		Map[3][4].up = 3; // �������� Ȯ���ʿ�
		//
		// F��
		Map[2][4].down = 3;
		//
	}

	public void gui(Room[][] Map) {
		check_A_Point();

		for (int i = 0; i < Map.length; i++) {
			for (int j = 0; j < Map[i].length; j++) {
				///////// ��ġ ���
				if (Map[i][j].iamHere == true) {

					System.out.print("[O]"); // 3ĭ
				} else {
					System.out.print("[ ]"); // 3ĭ
				}
				/////////

				///////// �¿� ȭ��ǥ ��ºκ�
				if (((Map[i][j].right == 1) && (Map[i][j + 1].left == 1)) && (j != Map[i].length - 1)) {

					System.out.print(" �� "); // 3ĭ

				} else {
					System.out.print("   ");
				}
				/////////
			}
			System.out.println();

			// �ٷ� �غκ��� ���� ȭ��ǥ ��ºκ� �� �κ� ��¸����
			int count = 0;
			int k = 0;
			for (int j = 0; j < Map[i].length; j++) {

				if (((Map[i][j].down == 1) && (Map[i + 1][j].up == 1)) && (i != Map[i].length)) {
					for (k = 1 + count; k <= j * 6 + 1; k++) {
						System.out.print(" ");
						count = (j * 6) + 2; // count������ �̿��ؼ� , for���� ����� �ߺ� ���� ���� ���� .j���� Ŀ����ŭ k���� ������ �� ũ�� ����
					}

					System.out.print("��");
				}

			}

			System.out.println();
		}

	}

	public void moveUp(Room[][] Map) {

		// 1�� ī��Ű �����ΰ�� Ȯ��
		if ((Map[this.i][this.j].up == 1)) {//�Ϲݹ�
			Map[this.i][this.j].iamHere = false;
			this.i = i - 1;
			Map[this.i][this.j].iamHere = true;
		} else if ((Map[this.i][this.j].up == 2)) { // ������
			System.out.println("??");
			if (CardKey_1 == true) {
				Map[this.i][this.j].iamHere = false;
				this.i = i - 1;
				Map[this.i][this.j].iamHere = true;
				CardKey_2 = true;
				System.out.println("<<<<    2�� ���谡 ȹ��    >>>>");
			} else {
				System.out.println("<<<<    1�� ���谡 �����ϴ�    >>>>");
			}

		} else if (Map[this.i][this.j].up == 3) {// �Ķ���
			if (this.CardKey_2 == true) {
				Map[this.i][this.j].iamHere = false;
				this.i = i - 1;
				Map[this.i][this.j].iamHere = true;
				check_F_Point();

			} else {
				System.out.println("<<<<    2�� ���谡 �����ϴ�    >>>>");
			}
		}

		else if ((this.i >= 1) && ((Map[this.i][this.j].up == 1) && (Map[this.i - 1][this.j].down == 1))) {
			// �����ٰ� ������ int ���� ���ؼ��ϵ�(�Ϲݹ�) i=1 �����ΰ��
			Map[this.i][this.j].iamHere = false;
			this.i = i - 1;
			Map[this.i][this.j].iamHere = true;

		} else {

			System.out.println("�����ϼ������ϴ�.");
		}

		gui(Map);

	}

	public void moveDown(Room[][] Map) {

		// �����ٰ� �ٷ� ������ int�� �� �� , i�� Map.length -2 ������

		if (((Map[this.i][this.j].down == 1) && (Map[this.i + 1][this.j].up == 1)) && (this.i <= Map.length)) {

			Map[this.i][this.j].iamHere = false;
			this.i = i + 1;
			Map[this.i][this.j].iamHere = true;

		}
		else if((CardKey_2==true)&&(Map[this.i][this.j].down == 2) && (Map[this.i + 1][this.j].up == 2))   {
			//�������� �Ӵٰ��� �Ҷ�
			Map[this.i][this.j].iamHere = false;
			this.i = i + 1;
			Map[this.i][this.j].iamHere = true;
		}

		else {

			System.out.println("�����ϼ������ϴ�.");
		}

		gui(Map);

	}

	public void moveLeft(Room[][] Map) {

		if (this.j == 0) {
			// j=0�ΰ��
			System.out.println("�����ϼ������ϴ�.");
		} else if (((Map[this.i][this.j].left == 1) && (Map[this.i][this.j - 1].right == 1)) && (this.j >= 1)) {
			// �ٷ� ���� ���� int�� ���ϵ� , j�� 1���� Ŀ���Ѵ�
			Map[this.i][this.j].iamHere = false;
			this.j = j - 1;
			Map[this.i][this.j].iamHere = true;
		} else {

			System.out.println("�����ϼ������ϴ�.");
		}

		gui(Map);

	}

	public void moveRight(Room[][] Map) {

		if (this.j == Map[this.i].length - 1) {
			// j=4 �϶� ����
			System.out.println("�����ϼ������ϴ�.");
		} else if (((Map[this.i][this.j].right == 1) && (Map[this.i][this.j + 1].left == 1))
				&& (this.j <= Map[this.i].length - 2)) {
			// �ٷ� �����ʰ��� int���� ���ϵ� , j�� Map[this.i].length -2 ������ ����

			Map[this.i][this.j].iamHere = false;
			this.j = j + 1;
			Map[this.i][this.j].iamHere = true;
		} else {

			System.out.println("�����ϼ������ϴ�.");
		}

		gui(Map);

	}

	public void check_A_Point() {

		Quiz_sam qs = new Quiz_sam("2 + 2 = ?", " 1 ", " 2 ", " 3 ", " 4 ", "4"); // ��������

		int temp_i = this.i;
		int temp_j = this.j;

		if (((temp_i == 0) && (temp_j == 4)) && (this.noAgain_A == false)) { // (0,4)��ġ�� ����
			// A�� ������
			System.out.println("--------------------------------- A���� ���� ---------------------------------");
			System.out.println("\n<<<<    �������~!    >>>>\n");
			System.out.println("\n�غ� �Ϸ�Ǹ� yes�� �Է����ּ���");
			String temp = sc.nextLine();

			if (temp.equals("yes")) {
				System.out.println("\n\n");
				if (qs.ShowQuiz()) {
					System.out.println("<<<<   1������ȹ��    >>>>");
					this.CardKey_1 = true; // ���� 1�� ȹ��
					this.noAgain_A = true;
				}

			} else {
				System.out.println("�����Դϴ�.");
			}

		}

	}

	public void check_B_Point() {

		if (this.noAgain_B == false) {
			System.out.println("<<<<   2������ȹ��    >>>>");
			CardKey_2 = true;
			this.noAgain_B = true;

		}

	}

	public void check_F_Point() {

		System.out.println("<<<<    ���� ���� !    >>>>");
		this.endCheck = true;
	}

}
