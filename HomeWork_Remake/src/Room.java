
public class Room {

	// 상하좌우 boolean 값 과 퀴즈 유무 boolean 값 , 종착지 확인 boolean 값

	// 일반문
	int left;   // 0 못감  , 1 일반문 , 2빨간문 , 3파란문
	int right;
	int up;
	int down;
	

	boolean iamHere;

	public Room() {

		left = 0;
		right = 0;
		up = 0;
		down = 0;
		iamHere = false;

	}

}
