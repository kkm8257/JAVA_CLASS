
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

		
		System.out.println("\n<<<<first�� second ��>>>>");
		if(first!=second) {
			
			System.out.println("first�� second�� ���� �ʴ�.\n");	
		}
		System.out.println("<<<<second�� third ��>>>>");
		if(second==third) {
			System.out.println("second �� third�� ����.\n");
		}
		
		
		System.out.println("-------------------------------------------------");
		
		if(first!=second && second==third) {
			System.out.println("first�� second�� �ٸ��鼭  second�� third�� ����.");
			
		}
		
		if(first!=second || second!=third) {
			
			System.out.println("first�� second�� ���� �ʰų�  Ȥ�� second�� third�� ���� �ʰų� Ȥ��  first�� second�� ���������鼭 second�� third ���� ���� ���� �� �ִ�.");
			
		}
		
		
		
	}
}
