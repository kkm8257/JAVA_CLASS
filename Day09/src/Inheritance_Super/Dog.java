package Inheritance_Super;


public class Dog extends Animal {
	
	String color;
	
	public Dog(int age, String name, String color) {
		super(age, name);
		this.color = color;
	}
	
	void bark() {
		System.out.println(name+ " Â¢½À´Ï´Ù");
	}
	
	 void eat() {
		 System.out.println("¹äÀ» ¸Ô½À´Ï´Ù");
	 }
	 

}
