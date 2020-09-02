package Thread_bank_after_Sync;

public class main {

	public static void main(String[] args) {

		Account ac1=new Account();
		Account ac2=new Account();
		Share sh = new Share();
		
		Transfer tf=new Transfer();
		tf.sh=sh;
		CheckAmount ca=new CheckAmount();
		ca.sh=sh;
	
		
		sh.ac1=ac1;
		sh.ac2=ac2;
		
		tf.start();
		ca.start();
		
		
		
				
		
		
		
	
	
	}

}
