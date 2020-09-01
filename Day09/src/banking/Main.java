package banking;

public class Main {

	public static void main(String[] args) {

		type_A_Card ac1=new type_A_Card("±è°æ¹Î",20000);
		type_B_Card ac2= new type_B_Card("¹è°Ç¼ö",10000);
		
		ac1.withdraw(5000);
		System.out.println();
		ac2.deposit(10000);
		System.out.println();
		ac1.event_A();
		System.out.println();
		ac2.event_B();
		
		
	}

}
