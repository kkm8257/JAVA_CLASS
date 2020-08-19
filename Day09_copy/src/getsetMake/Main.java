package getsetMake;

public class Main {
	public static void main(String[] args) {
	
		
		Dog  d = new Dog();
		d.bark();
		//d.age=10;
		//d.name="심심한 개";
		
		d.setAge(10);
		d.setName("심심한 개");
		
		System.out.println(d.getAge());
		System.out.println(d.getName());
		
	}

}
