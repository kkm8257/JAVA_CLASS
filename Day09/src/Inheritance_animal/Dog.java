package Inheritance_animal;

public class Dog extends Animal{

	

	
	public Dog(String a, String b, String c) {

		this.name=a;
		this.color=b;
		this.age=c;
	
	}
	
	
	public void greed() {
		System.out.println(this.name +"�� ���ϰ� �ݱ��! ������ ��û ����!");
	}
}
