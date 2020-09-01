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

		String str = "(Truck)출발하였습니다.";

		return str;

	}
	
	public String Bust() {
		String str = "속도를 올립니다.";

		return str;
		
	}
	public String Curve() {
		String str = "커브를 꺾습니다!";
		return str;
		
	}
	

	public String Arrive() {

		String str = "(Truck)도착하였습니다.";

		return str;

	}
}
