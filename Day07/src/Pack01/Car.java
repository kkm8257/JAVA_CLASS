package Pack01;

public class Car {
	String clientName;
	String model;
	String color;
	String grade;

	public Car() {
		
		System.out.println("기본생성자실행");
	}


	public Car(String clientName, String model, String color, String grade) {

		this.clientName = clientName;
		this.model = model;
		this.color = color;
		this.grade = grade;
		System.out.println("입력정보를 가지고 생성자 실행");

	}

	public String Start() {

		String str = "(Car)출발하였습니다.";

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

		String str = "(Car)도착하였습니다.";

		return str;

	}

}
