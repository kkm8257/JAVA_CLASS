package banking;

public class account_sam {
	
	private String client_name;
	private int balance;//�ܾ�
	private int amount;//���Ա� ��
	
	public account_sam() {
		//�⺻�����ڸ� �����ϵ� , ���� ������ ������������ �׷��� ��ӽ� ������ �������ʵ��
	}
	
	public account_sam(String a, int b) {

		this.client_name=a;
		this.balance=b;
	
	}
	
	//�ν��Ͻ��� �����ϱ� ���ؼ��� �ݵ�� �����ڸ� ȣ��
	//�θ� Ŭ�����κ��� ��ӹ��� �޼ҵ� �� �ʵ�� ������ �θ� Ŭ������ ���� ���� �� ���̰�
	//�θ��� ���̴�
	//���� �θ� Ŭ������ �����ڰ� ȣ��Ǿ�� �ڽ�Ŭ�������� ����̰����Ѱ�
	//������ �����ڴ� ��ӵ��� �ʴ´�!
	//��� �ڽ� Ŭ������ �ν��Ͻ��� ������ �� �θ�Ŭ������ �⺻ �����ڸ� �ڵ����� ȣ���Ѵ�
	
	
	
	public void withdraw(int amount) {
		if(this.balance>=amount) {
			System.out.println("<<<<    "+this.client_name+"���� ��������    >>>>");
			System.out.println("�����ܾ� : "+balance+ " ��");
			System.out.println("��ݾ� : "+amount+ " ��");
			this.balance-=amount;
			System.out.println("��� �� �ܾ� : "+balance+ " ��");
			
			
		}
		else {
			System.out.println("<<<<    "+ "�ܾ��� �����մϴ�"+"    >>>>");
		}

	}
	
	public void deposit(int amount) {
		System.out.println("<<<<    "+this.client_name+"���� ��������    >>>>");
		System.out.println("�����ܾ� : "+balance+ " ��");
		System.out.println("�Աݾ� : "+amount+ " ��");
		this.balance+=amount;
		System.out.println("�Ա� �� �ܾ� : "+balance+ " ��");
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
