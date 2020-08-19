package banking;

public class account_sam {
	
	private String client_name;
	private int balance;//잔액
	private int amount;//출입금 액
	
	public account_sam() {
		//기본생성자를 정의하되 , 따로 내용을 구현하지않음 그러면 상속시 문제가 생기지않드라
	}
	
	public account_sam(String a, int b) {

		this.client_name=a;
		this.balance=b;
	
	}
	
	//인스턴스를 생성하기 위해서는 반드시 생성자를 호출
	//부모 클래스로부터 상속받은 메소드 및 필드는 엄연히 부모 클래스에 의해 정의 된 것이고
	//부모의 것이다
	//따라서 부모 클래스의 생성자가 호출되어야 자식클래스에서 사용이가능한것
	//하지만 생성자는 상속되지 않는다!
	//대신 자식 클래스로 인스턴스를 생성할 때 부모클래스의 기본 생성자를 자동으로 호출한다
	
	
	
	public void withdraw(int amount) {
		if(this.balance>=amount) {
			System.out.println("<<<<    "+this.client_name+"님의 계좌정보    >>>>");
			System.out.println("현재잔액 : "+balance+ " 원");
			System.out.println("출금액 : "+amount+ " 원");
			this.balance-=amount;
			System.out.println("출금 후 잔액 : "+balance+ " 원");
			
			
		}
		else {
			System.out.println("<<<<    "+ "잔액이 부족합니다"+"    >>>>");
		}

	}
	
	public void deposit(int amount) {
		System.out.println("<<<<    "+this.client_name+"님의 계좌정보    >>>>");
		System.out.println("현재잔액 : "+balance+ " 원");
		System.out.println("입금액 : "+amount+ " 원");
		this.balance+=amount;
		System.out.println("입금 후 잔액 : "+balance+ " 원");
	}
	///////////////////////////////////////////////////////////////	
	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	

}
