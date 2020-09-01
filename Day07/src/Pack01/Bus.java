package Pack01;

public class Bus {


	String clientName;
	String model;
	String color;
	String grade;

	public Bus() {
		System.out.println("입력정보 없이 생성되었습니다.");
	}

	public Bus(String A, String B, String C, String D) {

		 clientName = A;
		 model = B;
		 color = C;
		 grade = D;

	}

	public String Start() {

		String str = "(Bus)출발하였습니다.";

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

		String str = "(Bus)도착하였습니다.";

		return str;

	}


}
