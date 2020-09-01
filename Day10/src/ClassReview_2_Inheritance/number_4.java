package ClassReview_2_Inheritance;

public class number_4 extends number_3 {

	public float resultCal(int a, int b, String c) {

		if (c.equals("+")) {
			return a + b;
		} else if (c.equals("-")) {
			return a - b;
		} else if (c.equals("*")) {
			return a * b;
		} else if (c.equals("/")) {
			return a / b;
		} else {
			// 잘못된 입력
			return 999999;
		}

	}

	public static void main(String[] args) {
		number_3 nm3 = new number_3();
		number_4 resultArr = new number_4();
		
		
		resultArr.insert(nm3);
		resultArr.processPrint();
		
		
		System.out.println("\n");
		for(int i = 0 ; i <5;i++) {
			
			System.out.println("index ("+i+")의 결과값 =>  "+ resultArr.resultCal(resultArr.nm3_result.array.get(i).num_1,resultArr.nm3_result.array.get(i).num_2,resultArr.nm3_result.array.get(i).str));
			System.out.println();
			

		}
		
		
	}

}
