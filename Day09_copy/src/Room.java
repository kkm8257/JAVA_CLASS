
public class Room {

	int eventType; // 0 1 2 3 4 없음 5 6 은 랜덤 이동(-포함) 7 은 출발지 이동 8은 지도 크기늘리기(5만큼)
	int value;
	boolean gobackFlag;

	public Room() {

		gobackFlag = false;
	}

	public Room(int eventRd, int value) {

		this.eventType = eventRd;

		if (eventRd == 5) {
			// 랜덤이동 +

			this.value = value;

		} else if (eventRd == 6) {
			// 랜덤이동 -
			this.value = -value;
		} else if (eventRd == 7) {
			// 출발지이동
			gobackFlag = true;
		} else if (eventRd == 8) {
			this.value = 5;

		} else {
			//아무일도없음
			
			this.eventType = 0;
			this.value = 0;
		}

	}

}
