
public class Main_5 {

	public static void main(String[] args) {

		String str = "    ���ع��� ���λ���  ��";
		String[] array;

		System.out.println(str.length());
		str = str.trim();// ���ڿ��� �¿쿩�� ����
		System.out.println(str);

		int idx = str.indexOf("��");
		idx = str.lastIndexOf("��");// �ش��ϴ� ���ڸ� ���ڿ����� ã�µ� �� �� �� ������ ã��
		System.out.println(idx);

		System.out.println(str.charAt(7));// Ư����ġ�� ���� ã��

		////////////////////////////////////////////////// �ѱ��ھ� ����ϱ�

		for (int i = 0; i < str.length(); i++) {

			System.out.print(str.charAt(i) + " ");

		}

		System.out.println();

		array = str.split("");
		for (int i = 0; i < str.length(); i++) {

			System.out.print(array[i] + " ");

		}

		System.out.println();
		str="�����ٶ�";
		System.out.println(str.substring(2,4));
		
		
		str=str.replace("��", "Do it man!");
		System.out.println(str);

		//////////////////////////////////////////////////

	}
}
