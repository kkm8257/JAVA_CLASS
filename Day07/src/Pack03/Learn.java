package Pack03;

public class Learn {
	
	
	public static void main(String[] args) {
		
		
		Dog d1 = new Dog();
		
		d1.run();//같은 패키지 내이기 때문에 가능 
		//d1.stop();   private라 불가능
		System.out.println();
		d1.eat();
		
		
		
		
		//static
		//공통공간으로 사용
		//객체를만들필요없이 클래스이름.  으로 접근
		//static 속성에서 non-static으로는 접근이 불가능함
		
	}
	
	

}
