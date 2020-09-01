
public interface InterBoard {

	//인터페이스에 선언을 해놓고, 가져다가 반드시 선언된 그대로 모두 구현하면 되는게 인터페이스
	//메소드가 있지만 가져다 쓰거나 오버라이드 하거나, abstract가 붙은 메소드는 반드시 구현하면 되는게 abstract class

	abstract void upload();
	abstract void delete();
	
	abstract void rePage();
	abstract void exPage();
}
