package Inheritance_animal;

public class Animal {
	
	
	String name;
	String color;
	String age;
	
	public void attack() {
		
		System.out.println(this.name + "�� �ż��� �����Ѵ�!");
	}

	public void runaway() {
		System.out.println(this.name + "�� �س� ������ ��������!");
	}
	
	public void beCaptured() {
		System.out.println(this.name + "�� ��ȹ�Ǿ���!");
	}
	
	
}
