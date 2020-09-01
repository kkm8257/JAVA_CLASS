package Inheritance_animal;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		ArrayList<Animal> deck = new ArrayList<>();

		Cat cat = new Cat("냥냥이", "black", "2");
		Dog dog = new Dog("멍멍이", "brown", "4");
		Monkey mk = new Monkey("숭이", "white_brown", "2");
		
		
		
		deck.add(cat);
		deck.add(dog);
		deck.add(mk);

		//////////// 상속받은 메소드 실행
		cat.beCaptured();
		cat.attack();
		cat.runaway();

		dog.runaway();
		dog.beCaptured();

		mk.attack();
		mk.beCaptured();
		///////////

		// 각각 클래스 내에서 만든 메소드 실행
		cat.hide();
		dog.greed();
		mk.climb();
		////////////


	}
}
