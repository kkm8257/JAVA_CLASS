package banking;

public class type_A_Card extends account_sam {

	public type_A_Card(String a, int b){
		this.setClient_name(a);
		this.setBalance(b);
	}
	
	
	//A���� ī��
	
	public void event_A() {
		
		
		if(this.getBalance()>=10000) {
			System.out.println("���忡 10000�� �̻� ���� ��� �ڵ� ����!");
			
		}
		else {
			System.out.println("������ �ܾ��� 10000�� ��� �̺�Ʈ ���� ���� �� �Ͽ����ϴ�.");
		}
		
	}
	
}
