package Inheritance_ReView;


public class Animal {
	int age;
	String name;
	
	 public Animal(String name,int age) {		
		
		this.name = name;
		this.age = age;
	}



	void walk() {
		 System.out.println(this.name+"�� �Ƚ��ϴ�");
	 }
	
	void bark() {
		System.out.println(this.name+"�� ¢���ϴ�.");
	}
	
	void run(){
		System.out.println(this.name+"�� �޸��ϴ�.");
	}
	
	void eat() {
		System.out.println(this.name+"�� ���� �Խ��ϴ�.");
	}

	
}
