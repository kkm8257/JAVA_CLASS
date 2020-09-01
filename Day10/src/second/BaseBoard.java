package second;

public class BaseBoard implements InterBoard{

	@Override
	public void upload() {
System.out.println("업로드 완료");
		
	}

	@Override
	public void delete() {
System.out.println("게시물 삭제완료");		
	}

	@Override
	public void rePage() {
System.out.println("새로고침");		
	}

	@Override
	public void exPage() {
System.out.println("이전페이지");		
	}

	@Override
	public void herePrint() {
		System.out.println("BaseBoard 여기는 BaseBoard");
		
	}


	
}
