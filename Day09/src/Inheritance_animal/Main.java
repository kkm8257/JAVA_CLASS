package Inheritance_animal;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		ArrayList<Animal> deck = new ArrayList<>();

		Cat cat = new Cat("�ɳ���", "black", "2");
		Dog dog = new Dog("�۸���", "brown", "4");
		Monkey mk = new Monkey("����", "white_brown", "2");
		
		
		
		deck.add(cat);
		deck.add(dog);
		deck.add(mk);

		//////////// ��ӹ��� �޼ҵ� ����
		cat.beCaptured();
		cat.attack();
		cat.runaway();

		dog.runaway();
		dog.beCaptured();

		mk.attack();
		mk.beCaptured();
		///////////

		// ���� Ŭ���� ������ ���� �޼ҵ� ����
		cat.hide();
		dog.greed();
		mk.climb();
		////////////


	}
}
