package Inheritance_ReView;

public class Cat extends Animal {

	int sizeOfNail;

	public Cat(String name, int age, int sizeOfNail) {
	
		super(name,age);
		this.sizeOfNail=sizeOfNail;
		
	}

	@Override
	void walk() {
		System.out.println(this.name + "은 사뿐사뿐 걷습니다. ( 오버라이딩 )");
	}

	@Override
	void eat() {
		System.out.println(this.name + "은 조용하게 밥을 먹습니다. ( 오버라이딩 )");
	}
	
	


	

}
