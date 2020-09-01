package Pack01;

public class Truck {
	String clientName;
	String model;
	String color;
	String grade;

	public Truck() {
		System.out.println("입력정보 없이 생성되었습니다.");
	}

	public Truck(String A, String B, String C, String D) {

		clientName = A;
		model = B;
		color = C;
		grade = D;
		System.out.println("(입력정보를 가지고 생성자 실행~)");

	}
	
	

	public String Start() {

		String str = "(Truck)출발하였습니다.";

		return str;

	}
	
	public String Curve() {

		String str = "커브를 꺾습니다!\n";

		return str;

	}

	public String Straight() {

		String str = "직진!!\n";

		return str;

	}

	public String Uturn() {

		String str = "유턴!! \n";
		return str;
	}

	public String Bust() {

		String str = "부스트! \n";
		return str;
	}


	public String Arrive() {

		String str = "(Truck)도착하였습니다.";

		return str;

	}
}
