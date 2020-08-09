
public class Main_5 {

	public static void main(String[] args) {

		String str = "    동해물과 동두산이  동";
		String[] array;

		System.out.println(str.length());
		str = str.trim();// 문자열의 좌우여백 제거
		System.out.println(str);

		int idx = str.indexOf("동");
		idx = str.lastIndexOf("동");// 해당하는 문자를 문자열에서 찾는데 그 중 맨 마지막 찾기
		System.out.println(idx);

		System.out.println(str.charAt(7));// 특정위치의 글자 찾기

		////////////////////////////////////////////////// 한글자씩 출력하기

		for (int i = 0; i < str.length(); i++) {

			System.out.print(str.charAt(i) + " ");

		}

		System.out.println();

		array = str.split("");
		for (int i = 0; i < str.length(); i++) {

			System.out.print(array[i] + " ");

		}

		System.out.println();
		str="가나다라마";
		System.out.println(str.substring(2,4));
		
		
		str=str.replace("라", "Do it man!");
		System.out.println(str);

		//////////////////////////////////////////////////

	}
}
