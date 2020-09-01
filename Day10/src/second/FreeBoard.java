package second;

public class FreeBoard extends BaseBoard{

	public void nicePrint() {
		
		rePage(); //InterBoard인터페이스의 메소드를 구현한 BaseBoard 클래스에서 상속받은 메소드 rePage
	}
	
	public void herePrint() {
		System.out.println("hihi  이거는 FreeBoard");
	}
	
	
	
}
