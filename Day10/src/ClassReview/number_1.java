package ClassReview;

public class number_1 {
	//1. 2개의 숫자와 1개의 문자열을 저장할 수 있는 클래스 만들기
	// 뒤에 2 3 4 번에 사용할 클래스 A 

	int num_1;
	int num_2;
	String str;
	
	public number_1(int num_1,int num_2,String str){
		
		this.num_1=num_1;
		this.num_2=num_2;
		this.str=str;
		
	}
	

	public static void main(String[] args) {

	
		
		int num_1=10;
		int num_2=20;
		String str="HIHI";
		number_1 nm1=new number_1(num_1,num_2,str);
		
	}

}
