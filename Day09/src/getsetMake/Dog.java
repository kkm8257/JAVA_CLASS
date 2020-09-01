package getsetMake;

public class Dog {

	//게터 세터는 보안이좋다고 한다.
	//why? 어차피 . 으로 접근하는건 똑같잖아?/
	//실제로는 전부다 private로 막아버려. 그리고 필요한경우만 getter setter를 만들어준다
	//그니까 전부다 getter setter를 만들어주는게아니라  실제로는 필요한것만 추가해서만들어준다
	
	//안드로이드에서는 게터세터를 쓰던말든,,, 보안자체가안좋다 ,, 사용시 최대 8까지 속도가 느려질수도있음
	//하지만 항상 private로 설정하여 getter setter를 사용하도록!
	
	private String name;
	private int age;
	//게터세트 단축키 쉬프트 알트 s
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void bark() {
		
		System.out.println("개소리 개소리 개소리");
		
	}
}
