import java.util.Random;

public class Main_6_DownCase {

	public static void main(String[] args) {

		Random rd= new Random();
		int temp = 0;

		int[] NotSorted = new int[10];

		for (int i = 0; i < NotSorted.length; i++) {

			NotSorted[i] = rd.nextInt(101);
			if ((NotSorted[i] < 20)) {
				// 20미만의 수 거르기
				i--;
				continue;
			}

		}

		System.out.println("-----내림차순정렬 전-----");
		for (int i = 0; i < NotSorted.length; i++) {

			System.out.print(NotSorted[i] + " ");
		}

		// 내림차순정렬

		for (int i = 0; i < NotSorted.length; i++) {

			for (int j = i + 1; j < NotSorted.length; j++) {

				if (NotSorted[i] < NotSorted[j]) {

					temp = NotSorted[j];
					NotSorted[j] = NotSorted[i];
					NotSorted[i] = temp;

				}

			}

		}
		System.out.println();
		System.out.println("-----내림차순정렬 후-----");
		for (int i = 0; i < NotSorted.length; i++) {
			System.out.print(NotSorted[i] + " ");
		}

		/////// 내림차순정렬끝

	}
}
