package getsetMake;

public class Main {
	public static void main(String[] args) {
	
		
		Dog  d = new Dog();
		d.bark();
		//d.age=10;
		//d.name="�ɽ��� ��";
		
		d.setAge(10);
		d.setName("�ɽ��� ��");
		
		System.out.println(d.getAge());
		System.out.println(d.getName());
		
	}

}
