import java.util.ArrayList;

public class Main_8 {

	
	public static void main(String[] args) {
		
		
		//arrayLIST�� �迭�� ������ ũ�� ���� �κ��� ������ ��
		
		
		
		//E�� ������Ʈ�� ����  ArrayList<E>
		
		
		ArrayList<String> strArr= new ArrayList<>(); //�ڹ� �ֽŹ������ʹ� �ڿ� <>�� ��������
		ArrayList<Integer> intArr=new ArrayList<>();
		ArrayList<Boolean> boolArr=new ArrayList<>();
		
		
		System.out.println("size : "+strArr.size());  //ArrayList �� length , �� ����
		
		strArr.add("��");
		strArr.add("��");
		strArr.add("��");
		strArr.add("��");

		System.out.println("size : "+strArr.size());  //�ڵ����� �þ��.
		
		
		System.out.println(strArr.get(0));  //ArrayList�� �ε����� ���� ���� Ȯ���ϴ� �� .  get
		System.out.println("----------------------");
		for(int i =0; i<strArr.size();i++) {
			System.out.println(strArr.get(i));
		}
		
		
		
		//���� Ư�� ��ġ�� ���� �ְ� �ʹٸ�?
		
		
		strArr.add(1,"��");
		System.out.println("----------------------");
		for(int i =0; i<strArr.size();i++) {
			System.out.println(strArr.get(i));
		}
		
		//�� �� �ִ� ���� , add�� Ư����ġ�� �����ϰ� ���� ���, �ش� ��ġ�� ���� �ִ� ���� �������°� �ƴ϶� �ڷ� �з�����.
		
		
		strArr.set(1, "SET!");
		System.out.println("----------------------");
		for(int i =0; i<strArr.size();i++) {
			System.out.println(strArr.get(i));
		}
		
		
		//set�� ���� ���, �ش���ġ ���� ������ ������ �ٲپ���� , add���� ����
		
		
		strArr.remove(1);
		System.out.println("----------------------");
		for(int i =0; i<strArr.size();i++) {
			System.out.println(strArr.get(i));
		}
		
		//�ε��� 1 ���� �����԰� ���ÿ� ������ü�� ���ֹ���. �� ArrayList�� ����� �پ���.
		
		
//		strArr.clear();
//		System.out.println("----------------------");
//		for(int i =0; i<strArr.size();i++) {
//			System.out.println(strArr.get(i));
//		}
//		
//		System.out.println(strArr.size());
//		//clear�� ��� ���� ���� �԰� ���ÿ� ����� �پ���.
//		
//		
		
		System.out.println("---------------------");
		System.out.println("���� ��ġ : "+strArr.indexOf("��"));
		
		
		
		
	}
}
