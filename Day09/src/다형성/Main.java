package 다형성;

public class Main {

	public static void main(String[] args) {
		Account ac1 = new Account("A씨", "100-88-9999",1000);
		CheckingCard c1 = new CheckingCard("B씨", "100-88-9999",1000, "A001");
		
		Account ac2 = new CheckingCard("B씨", "100-88-9999",1000, "A001");
		ac2.deposit(1000);
		System.out.println(ac2.balance);
		
		Account ac3 = new CreditCard("B씨", "100-88-9999",1000, "A001");
		ac3.deposit(1000);
		System.out.println(ac3.balance);
		
		//account의 탈을 쓴 ac2는 실제로 CheckingCard의 기능을 한다
		//account의 탈을 쓴 ac3는 실제로 CreaditCard의 기능을 한다
		
		
	}

}
