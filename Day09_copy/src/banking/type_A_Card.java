package banking;

public class type_A_Card extends account_sam {

	public type_A_Card(String a, int b){
		this.setClient_name(a);
		this.setBalance(b);
	}
	
	
	//A유형 카드
	
	public void event_A() {
		
		
		if(this.getBalance()>=10000) {
			System.out.println("통장에 10000원 이상 있을 경우 자동 응모!");
			
		}
		else {
			System.out.println("통장의 잔액이 10000원 적어서 이벤트 응모를 하지 못 하였습니다.");
		}
		
	}
	
}
