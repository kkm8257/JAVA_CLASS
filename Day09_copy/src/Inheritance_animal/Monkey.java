package Inheritance_animal;

public class Monkey extends Animal{


	
	public Monkey(String a, String b, String c) {

		this.name=a;
		this.color=b;
		this.age=c;
	
	}
	
	public void climb() {
		System.out.println(this.name+"�� ������ ź��");
	}
	
}
