package Pack01;

public class Car {
	String clientName;
	String model;
	String color;
	String grade;

	public Car() {
		
		System.out.println("�⺻�����ڽ���");
	}


	public Car(String clientName, String model, String color, String grade) {

		this.clientName = clientName;
		this.model = model;
		this.color = color;
		this.grade = grade;
		System.out.println("�Է������� ������ ������ ����");

	}

	public String Start() {

		String str = "(Car)����Ͽ����ϴ�.";

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

		String str = "(Car)�����Ͽ����ϴ�.";

		return str;

	}

}
