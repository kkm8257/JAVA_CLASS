package banking;

public class type_B_Card extends account_sam {

	
	public type_B_Card(String a, int b){
		this.setClient_name(a);
		this.setBalance(b);
	}
	
	
	//B����ī��
	
	public void event_B() {
		System.out.println("B ī�� �̿� ���Ե��� ���Ǿ��� �ڵ� ����˴ϴ�!");
	}
	
}
