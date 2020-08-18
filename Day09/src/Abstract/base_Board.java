package Abstract;

public abstract class base_Board {

	//추상메소드를 선언하고
	//그 추상메소드를 상속받을 경우 무조건 오버라이드 해주어서 기능을 만들어줘야한다.
	//이는 규격을 정해주는 개념이라고 볼 수 있음 (팀플 시에 중요) 통일성, 설계도 이런 개념
	
	abstract void post();//글등록
	abstract void freeboard();//게시판
	
	
	//기능을 물려받기위함이 아니다
//	
//	결국 추상메소드는
//	상속받은 클래스에서 무조건 오바라이드 하게 만든후
//	이름 규칙을 만드는 개념으로 볼 수 있다.
	
	
}
