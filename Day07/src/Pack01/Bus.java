package Pack01;

public class Bus {


	String clientName;
	String model;
	String color;
	String grade;

	public Bus() {
		System.out.println("�Է����� ���� �����Ǿ����ϴ�.");
	}

	public Bus(String A, String B, String C, String D) {

		 clientName = A;
		 model = B;
		 color = C;
		 grade = D;

	}

	public String Start() {

		String str = "(Bus)����Ͽ����ϴ�.";

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

		String str = "(Bus)�����Ͽ����ϴ�.";

		return str;

	}


}
