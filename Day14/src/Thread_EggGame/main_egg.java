package Thread_EggGame;

public class main_egg {

	public static void main(String[] args) {
		
		
		
		Egg_Box eggBox=new Egg_Box();
		Duck duck = new Duck();
		Duck_Owner duck_owner = new Duck_Owner();
		
		duck.eggBox=eggBox;
		duck_owner.eggBox=eggBox;
		
		
		
		duck.start();
		duck_owner.start();
		
		
	}
}
