package Inheritance_OverWrite.copy;

public class Cat extends Animal {

	int sizeOfNail;

	public Cat(String name, int age, int sizeOfNail) {
		super(age, name); // super()�� �θ��� �����ڸ� ȣ����. ��� super(age,name)�� Animal(age,name)�̶�� �����ڸ� ȣ����
		this.sizeOfNail = sizeOfNail; // sizeOfNail�� Cat���ִ� ��������̹Ƿ� this�� �ùٸ���
	}

	void safeLanding() {
		System.out.println("������ �մϴ�");
	}

	void gukguk() {
		System.out.println("�ڲ��� �մϴ�");
	}

	@Override
	void walk() {
		super.walk();  //���� �θ𰡰��� �޼ҵ� walk()�� ������
		//�״��� �ؿ� �߰��� �ۼ�����
		//Ȥ�� super �κ���ü�� ����� �ƿ� ������ ����� ���� �� �ִ�
	}

	

}
