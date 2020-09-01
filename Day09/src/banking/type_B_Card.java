package banking;

public class type_B_Card extends account_sam {

	
	public type_B_Card(String a, int b){
		this.setClient_name(a);
		this.setBalance(b);
	}
	
	
	//B유형카드
	
	public void event_B() {
		System.out.println("B 카드 이용 고객님들은 조건없이 자동 응모됩니다!");
	}
	
}
