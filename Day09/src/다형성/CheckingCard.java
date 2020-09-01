package ������;

public class CheckingCard extends Account {
	String cardNo;
	
	public CheckingCard(String name, String num, int balance, String cardNo) {
		super(name, num, balance);
		this.cardNo = cardNo;
	}
	
	int pay(int amount) {
		if(balance < amount) {
			System.out.println("�� ���� ������ ī�� �������� ����");
			return 0;
		}else {
			return withdraw(amount);
		}
	}
	
	@Override
	void deposit(int amount) {
		balance += amount*2;
	}
}
