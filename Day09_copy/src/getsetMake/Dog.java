package getsetMake;

public class Dog {

	//���� ���ʹ� ���������ٰ� �Ѵ�.
	//why? ������ . ���� �����ϴ°� �Ȱ��ݾ�?/
	//�����δ� ���δ� private�� ���ƹ���. �׸��� �ʿ��Ѱ�츸 getter setter�� ������ش�
	//�״ϱ� ���δ� getter setter�� ������ִ°Ծƴ϶�  �����δ� �ʿ��Ѱ͸� �߰��ؼ�������ش�
	
	//�ȵ���̵忡���� ���ͼ��͸� ��������,,, ������ü�������� ,, ���� �ִ� 8���� �ӵ��� ��������������
	//������ �׻� private�� �����Ͽ� getter setter�� ����ϵ���!
	
	private String name;
	private int age;
	//���ͼ�Ʈ ����Ű ����Ʈ ��Ʈ s
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void bark() {
		
		System.out.println("���Ҹ� ���Ҹ� ���Ҹ�");
		
	}
}
