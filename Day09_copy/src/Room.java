
public class Room {

	int eventType; // 0 1 2 3 4 ���� 5 6 �� ���� �̵�(-����) 7 �� ����� �̵� 8�� ���� ũ��ø���(5��ŭ)
	int value;
	boolean gobackFlag;

	public Room() {

		gobackFlag = false;
	}

	public Room(int eventRd, int value) {

		this.eventType = eventRd;

		if (eventRd == 5) {
			// �����̵� +

			this.value = value;

		} else if (eventRd == 6) {
			// �����̵� -
			this.value = -value;
		} else if (eventRd == 7) {
			// ������̵�
			gobackFlag = true;
		} else if (eventRd == 8) {
			this.value = 5;

		} else {
			//�ƹ��ϵ�����
			
			this.eventType = 0;
			this.value = 0;
		}

	}

}
