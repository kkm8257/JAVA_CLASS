package Inheritance_ReView;


public class Animal {
	int age;
	String name;
	
	 public Animal(String name,int age) {		
		
		this.name = name;
		this.age = age;
	}



	void walk() {
		 System.out.println(this.name+"이 걷습니다");
	 }
	
	void bark() {
		System.out.println(this.name+"이 짖습니다.");
	}
	
	void run(){
		System.out.println(this.name+"이 달립니다.");
	}
	
	void eat() {
		System.out.println(this.name+"이 밥을 먹습니다.");
	}

	
}
