package Pack02.copy;

public class Truck {
	String clientName;
	String model;
	String color;
	String grade;

	public Truck() {

	}

	public Truck(String A, String B, String C, String D) {

		clientName = A;
		model = B;
		color = C;
		grade = D;

	}

	public String Start() {

		String str = "(Truck)����Ͽ����ϴ�.";

		return str;

	}
	
	public String Bust() {
		String str = "�ӵ��� �ø��ϴ�.";

		return str;
		
	}
	public String Curve() {
		String str = "Ŀ�긦 �����ϴ�!";
		return str;
		
	}
	

	public String Arrive() {

		String str = "(Truck)�����Ͽ����ϴ�.";

		return str;

	}
}
