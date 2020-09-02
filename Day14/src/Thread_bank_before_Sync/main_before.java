package Thread_bank_before_Sync;

public class main_before {

	public static void main(String[] args) {

		Account_before ac1=new Account_before();
		Account_before ac2=new Account_before();
		Share_before sh = new Share_before();
		
		Transfer_before tf=new Transfer_before();
		tf.sh=sh;
		CheckAmount_before ca=new CheckAmount_before();
		ca.sh=sh;
	
		
		sh.ac1=ac1;
		sh.ac2=ac2;
		
		tf.start();
		ca.start();
		
		
		
				
		
		
		
	
	
	}

}
