package getset_Quiz;

public class Quiz_Sample {

	
	private String problem;
	private String example_1;
	private String example_2;
	private String example_3;
	private String example_4;
	
	private String ans;
	
	
	public Quiz_Sample(String pro, String e1, String e2, String e3, String e4, String ans) {

	
		this.problem=pro;
		this.example_1=e1;
		this.example_2=e2;
		this.example_3=e3;
		this.example_4=e4;
		this.ans=ans;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public String getExample_1() {
		return example_1;
	}
	public void setExample_1(String example_1) {
		this.example_1 = example_1;
	}
	public String getExample_2() {
		return example_2;
	}
	public void setExample_2(String example_2) {
		this.example_2 = example_2;
	}
	public String getExample_3() {
		return example_3;
	}
	public void setExample_3(String example_3) {
		this.example_3 = example_3;
	}
	public String getExample_4() {
		return example_4;
	}
	public void setExample_4(String example_4) {
		this.example_4 = example_4;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	
	
}
