package Inheritance_animal;

public class Animal {
	
	
	String name;
	String color;
	String age;
	
	public void attack() {
		
		System.out.println(this.name + "이 매섭게 저항한다!");
	}

	public void runaway() {
		System.out.println(this.name + "이 준내 빠르게 도망간다!");
	}
	
	public void beCaptured() {
		System.out.println(this.name + "이 포획되었다!");
	}
	
	
}
