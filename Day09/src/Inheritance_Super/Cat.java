package Inheritance_Super;


public class Cat extends Animal {
	
	 int sizeOfNail;
	 
	 public Cat(String name, int age, int sizeOfNail) {
		 super(age, name);	 //super()는 부모의 생성자를 호출함. 고로 super(age,name)은 Animal(age,name)이라는 생성자를 호출함
		 this.sizeOfNail = sizeOfNail;  //sizeOfNail은 Cat에있는 멤버변수이므로 this가 올바르다
	 }
	 
	 void safeLanding() {
		 System.out.println("낙법을 합니다");
	 }
	 
	 void gukguk() {
		 System.out.println("꾹꾹이 합니다");
	 }

}
