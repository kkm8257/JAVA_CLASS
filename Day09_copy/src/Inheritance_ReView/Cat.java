package Inheritance_ReView;

public class Cat extends Animal {

	int sizeOfNail;

	public Cat(String name, int age, int sizeOfNail) {
	
		super(name,age);
		this.sizeOfNail=sizeOfNail;
		
	}

	@Override
	void walk() {
		System.out.println(this.name + "�� ��ӻ�� �Ƚ��ϴ�. ( �������̵� )");
	}

	@Override
	void eat() {
		System.out.println(this.name + "�� �����ϰ� ���� �Խ��ϴ�. ( �������̵� )");
	}
	
	


	

}
