package Inheritance_ReView;

public class Main {

	
	public static void main(String[] args) {
		
		Cat cat = new Cat("멍멍이",3,1);
		Dog dog = new Dog("냥냥이",4,"흰색");
		
		
		dog.walk();
		dog.bark();
		dog.run();
		dog.eat();
		
		cat.walk();//오버라이딩
		cat.bark();
		cat.run();
		cat.eat();//오버라이딩
	}
}
