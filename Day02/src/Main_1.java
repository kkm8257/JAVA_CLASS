
public class Main_1 {

	public static void main(String[] args) {

		int first = 10;
		int second = 20;
		int third = 20;
		
		System.out.println("-------------------------------------------------");

		System.out.println("first : "+ first);
		System.out.println("second : "+second);
		System.out.println("third : "+third);
		
		
		System.out.println("-------------------------------------------------");

		
		System.out.println("\n<<<<first와 second 비교>>>>");
		if(first!=second) {
			
			System.out.println("first와 second는 같지 않다.\n");	
		}
		System.out.println("<<<<second와 third 비교>>>>");
		if(second==third) {
			System.out.println("second 와 third는 같다.\n");
		}
		
		
		System.out.println("-------------------------------------------------");
		
		if(first!=second && second==third) {
			System.out.println("first와 second는 다르면서  second와 third는 같다.");
			
		}
		
		if(first!=second || second!=third) {
			
			System.out.println("first와 second는 같지 않거나  혹은 second와 third는 같지 않거나 혹은  first와 second는 같지않으면서 second와 third 또한 같지 않을 수 있다.");
			
		}
		
		
		
	}
}
