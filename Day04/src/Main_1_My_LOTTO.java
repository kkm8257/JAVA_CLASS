import java.util.Arrays;
import java.util.Random;

public class Main_1_My_LOTTO {
	public static void main(String[] args) {

		
		Random rd = new Random();

		int num = 0;

		int[] chooseArray = new int[6];

		int[] NumArray = new int[46];

		// 로또번호가 6개라고 가정
		// 번호 45개를 배열에 넣고 나오면 0으로

		for (int i = 0; i < NumArray.length; i++) {
			NumArray[i] = i;

		}


		for (int i = 0; i < 6; i++) {

			num = rd.nextInt(46);

			if ((num != 0) && (NumArray[num] == num)) {
				chooseArray[i] = num;
				NumArray[num] = 0;
			} else {
				i=i-1;
				continue;

			}

		}

		System.out.println(Arrays.toString(chooseArray));
		
		
		
	}
}
