package Pack02.copy;

public class Bus {


	String clientName;
	String model;
	String color;
	String grade;

	public Bus() {

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

	public String Bust() {
		String str = "�ӵ��� �ø��ϴ�.";

		return str;
		
	}
	public String Curve() {
		String str = "Ŀ�긦 �����ϴ�!";
		return str;
		
	}
	
	public String Arrive() {

		String str = "(Bus)�����Ͽ����ϴ�.";

		return str;

	}


}
