package Pack01;

public class Van {
	String clientName;
	String model;
	String color;
	String grade;

	public Van() {
		System.out.println("�Է����� ���� �����Ǿ����ϴ�.");
	}

	public Van(String A, String B, String C, String D) {

		clientName = A;
		model = B;
		color = C;
		grade = D;
		System.out.println("(�Է������� ������ ������ ����~)");

	}

	public String Start() {

		String str = "(Van)����Ͽ����ϴ�.";

		return str;

	}
	
	public String Curve() {

		String str = "Ŀ�긦 �����ϴ�!\n";

		return str;

	}

	public String Straight() {

		String str = "����!!\n";

		return str;

	}

	public String Uturn() {

		String str = "����!! \n";
		return str;
	}

	public String Bust() {

		String str = "�ν�Ʈ! \n";
		return str;
	}


	public String Arrive() {

		String str = "(Van)�����Ͽ����ϴ�.";

		return str;

	}

}
