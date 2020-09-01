
public class Today_03 {

	public static void main(String[] args) {
		
		
		
		int num = 10;
		System.out.println(num);
		a(num);
		System.out.println(num);
		
		
		int[] num1= {10};
		System.out.println(num1[0]);
		b(num1);
		System.out.println(num1[0]);
		
		
		///////////////////
		//배열이나 arraylist 모두 해당
		System.out.println();
		int[] arr1= {10};
		int[] arr2=arr1;  // arr2에 arr1의 주소를 복사해서줌 , arr2는 arr1의 주소를 참조함 ,결국 arr1이 수정되던 arr2가 수정되던   ...arr1이 수정된다.
		arr2[0]++;
		System.out.println(arr1[0]);
		
		
		
		
		
	}
	
	static void a(int num) {
		//값을 복사해서 새로 담아버리는거임
		num++;
		System.out.println(num);
		
	}
	
	static void b(int[] num1) {
		//다른이유 ㅡ  배열의 주소값을 복사해오는것이기때문에 , 본체에 영향을 미치는것이다.
		
		num1[0]++;
		System.out.println(num1[0]);
	}
	
	
	
	
}
