package Inheritance_ReView;

public class Main {

	
	public static void main(String[] args) {
		
		Cat cat = new Cat("�۸���",3,1);
		Dog dog = new Dog("�ɳ���",4,"���");
		
		
		dog.walk();
		dog.bark();
		dog.run();
		dog.eat();
		
		cat.walk();//�������̵�
		cat.bark();
		cat.run();
		cat.eat();//�������̵�
	}
}
