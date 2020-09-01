package Inheritance_animal;

public class Dog extends Animal{

	

	
	public Dog(String a, String b, String c) {

		this.name=a;
		this.color=b;
		this.age=c;
	
	}
	
	
	public void greed() {
		System.out.println(this.name +"이 격하게 반긴다! 꼬리를 엄청 흔든다!");
	}
}
