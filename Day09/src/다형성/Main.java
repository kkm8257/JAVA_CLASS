package ������;

public class Main {

	public static void main(String[] args) {
		Account ac1 = new Account("A��", "100-88-9999",1000);
		CheckingCard c1 = new CheckingCard("B��", "100-88-9999",1000, "A001");
		
		Account ac2 = new CheckingCard("B��", "100-88-9999",1000, "A001");
		ac2.deposit(1000);
		System.out.println(ac2.balance);
		
		Account ac3 = new CreditCard("B��", "100-88-9999",1000, "A001");
		ac3.deposit(1000);
		System.out.println(ac3.balance);
		
		//account�� Ż�� �� ac2�� ������ CheckingCard�� ����� �Ѵ�
		//account�� Ż�� �� ac3�� ������ CreaditCard�� ����� �Ѵ�
		
		
	}

}
