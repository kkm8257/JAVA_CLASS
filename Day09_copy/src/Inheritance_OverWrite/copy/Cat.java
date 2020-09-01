package Inheritance_OverWrite.copy;

public class Cat extends Animal {

	int sizeOfNail;

	public Cat(String name, int age, int sizeOfNail) {
		super(age, name); // super()는 부모의 생성자를 호출함. 고로 super(age,name)은 Animal(age,name)이라는 생성자를 호출함
		this.sizeOfNail = sizeOfNail; // sizeOfNail은 Cat에있는 멤버변수이므로 this가 올바르다
	}

	void safeLanding() {
		System.out.println("낙법을 합니다");
	}

	void gukguk() {
		System.out.println("꾹꾹이 합니다");
	}

	@Override
	void walk() {
		super.walk();  //원래 부모가가진 메소드 walk()를 수행함
		//그다음 밑에 추가로 작성가능
		//혹은 super 부분자체를 지우고 아예 나만의 기능을 만들 수 있다
	}

	

}
