import java.util.ArrayList;
import java.util.Scanner;

public class Today_02 {
	
		
	

	public int plusMethod(int num1, int num2) {

		int result = num1 + num2;

		return result;

	}
	

	static int plusArrayAll(int[] array) {

		int result = 0;

		System.out.println("배열의 모든 값을 더합니다.");
		for (int i = 0; i < array.length; i++) {

			if (i == (array.length - 1)) {

				System.out.println(array[i]);
				result = result + array[i];

			} else {
				System.out.print(array[i] + " + ");
				result = result + array[i];

			}

		}

		return result;

	}

	static int plusList(ArrayList<Integer> array) {

		int result = 0;

		System.out.println("배열의 모든 값을 더합니다.");
		for (int i = 0; i < array.size(); i++) {

			if (i == (array.size() - 1)) {

				System.out.println(array.get(i));
				result = result + array.get(i);

			} else {
				System.out.print(array.get(i) + " + ");
				result = result + array.get(i);

			}

		}

		return result;

	}
	

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("숫자 2 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		
		///
		Today_02 AD = new Today_02();
	
		///

		System.out.println("1번 메소드의 결과 값 : " + AD.plusMethod(num1, num2) + "\n\n");

		System.out.println("길이가 5인 INT 배열을 만들겠습니다. ");
		int[] array = new int[5];
		ArrayList<Integer> Listarray= new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 숫자를 입력해주세요\n>>>");
			array[i] = Integer.parseInt(sc.nextLine());
			Listarray.add(array[i]);
		}
		System.out.println("\n");
		System.out.println("\n\n2번째 메소드의 결과 값은 " + plusArrayAll(array));
		
		System.out.println("\n");
		System.out.println("\n\n3번째 메소드의 결과 값은 " + plusList(Listarray));
		

		sc.close();

		
		
	}
	
	

	
}

