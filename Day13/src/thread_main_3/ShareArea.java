package thread_main_3;

public class ShareArea {
	int num;
	boolean isDone=false;

	
	//volatile 은 실제 메모리 위치로가서 값을 확인해보라는 것이다.
	//MyThread_2 부분의 sysout 주석을 해제하고 volatile 도 없애면 똑같다
	//근데 volatile을 안적어주고 sysout을 제거하면 무한루프에 빠짐
	//자바에서는 실제 내부에서 , 성능 향상을 위해서  값을 재활용하는 경우가있는데, 이를 방지하기위해서 필요해 의해 volatile을 사용하곤한다
	//즉 , 코드상에서는 분명 문제가없는데 무한루프를 돈다? 그러면 volatile을 해보자
	
	
	
	//두번째 쓰레드에서 sysout을 안하고 즉 share.isDone이 한번도 호출된적이없으니까
	//자바컴파일러는 값을 바꾸지않고 계속 사용할경우, 한번 가지고온 값을 가지고
	//계속 재활용하여 값을 체크한다
	//그니까 이를 매번 직접 참조하라! 라는 의미로 volatile 을 사용한다.
	//실제로 실무에서 별로 쓸일이 없다고는 함
	
	
	
}
